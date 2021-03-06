package com.zfgc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zfgc.exception.ZfgcNotFoundException;
import com.zfgc.exception.ZfgcValidationException;
import com.zfgc.exception.security.ZfgcInvalidAesKeyException;
import com.zfgc.exception.security.ZfgcSecurityException;
import com.zfgc.model.pm.PersonalMessage;
import com.zfgc.model.pm.PmBox;
import com.zfgc.model.pm.PmConversation;
import com.zfgc.model.pm.PmConversationMulti;
import com.zfgc.model.pm.PmConversationView;
import com.zfgc.model.pm.PmConvoBox;
import com.zfgc.model.pm.PmGenerator;
import com.zfgc.model.pm.PmPrune;
import com.zfgc.model.pm.PmTemplateConfig;
import com.zfgc.model.pm.PmUsersToAdd;
import com.zfgc.model.pm.TwoFactorKey;
import com.zfgc.model.users.Users;
import com.zfgc.services.authentication.AuthenticationService;
import com.zfgc.services.pm.PmService;

@Component
@RequestMapping("/pm")
public class PmController extends BaseController {

	@Autowired
	PmService pmService;
	
	@Autowired
	AuthenticationService authenticationService;
	
	private Logger logger = LogManager.getLogger(PmController.class);
	
	
	@RequestMapping(value="/template", method=RequestMethod.POST, produces="application/json")
	public ResponseEntity getPmTemplate(@RequestBody PmTemplateConfig templateConfig){
		return ResponseEntity.status(HttpStatus.OK).body(pmService.getPmTemplate(templateConfig));
	}
	
	@RequestMapping(value="/send", method=RequestMethod.POST, produces="application/json")
	@PreAuthorize("hasRole('ZFGC_USER')")
	public ResponseEntity sendPm(@RequestBody PersonalMessage message){
		PmConversation convo = null;
		
		try{
			convo = pmService.sendMessageInConversation(zfgcUser(), message.getReceivers(), message);
		}
		catch(ZfgcNotFoundException ex){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		catch(Exception ex){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		return ResponseEntity.ok(convo);
	}
	
	@RequestMapping(value="/key", method=RequestMethod.POST, produces="application/json")
	public ResponseEntity createKeyPair(@RequestBody PmGenerator pmGenerator){
		pmService.createKeyPairs(pmGenerator.getUsersId(), pmGenerator.getPassPhrase());
		
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(value="/auth", method=RequestMethod.POST, produces="application/json")
	@PreAuthorize("hasRole('ZFGC_USER')")
	public ResponseEntity authenticatePmKey(@RequestBody TwoFactorKey aes){
		if (aes.getKey() == null){
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}
		
		try {
			Boolean result = authenticationService.isValidAesKey(aes);
			
			if(result == false){
				return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
			}
		} catch (ZfgcInvalidAesKeyException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@RequestMapping(value="/convobox", method=RequestMethod.POST, produces="application/json")
	@PreAuthorize("hasRole('ZFGC_USER')")
	public ResponseEntity viewConvoBox(@RequestParam("filterType") Integer filterType, @RequestBody TwoFactorKey aesKey){
		try{
			
			PmConvoBox convos = null;
			//todo: use constants
			switch(filterType) {
			case 0:
				convos = pmService.getConversationBox(aesKey, zfgcUser());
				break;
				
			case 1:
				convos = pmService.getConversationsInBox(aesKey, zfgcUser());
				break;
				
			case 2:
				convos = pmService.getConversationsSentBox(aesKey, zfgcUser());
				break;
				
			case 3:
				convos = pmService.getArchiveBox(aesKey, zfgcUser());
				break;
			}
			
			if(convos == null){
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
			return ResponseEntity.ok(convos);
		}
	    catch (ZfgcInvalidAesKeyException e) {
	    	return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
	    } catch (ZfgcNotFoundException e) {
	    	return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    } catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@RequestMapping(value="/convobox/prune/template", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity getPruneTemplate(){
		return ResponseEntity.ok(new PmPrune());
	}
	
	@RequestMapping(value="/conversation/template", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity getConvoTemplate(){
		return ResponseEntity.ok(pmService.getConvoTemplate(zfgcUser()));
	}
	
	@RequestMapping(value="/conversation/{conversationId}", method=RequestMethod.POST, produces="application/json")
	@PreAuthorize("hasRole('ZFGC_USER')")
	public ResponseEntity viewConversation(@RequestBody TwoFactorKey aesKey,@PathVariable("conversationId") Integer convoId) {
		try {
			PmConversation convo = pmService.getConversation(convoId, aesKey, zfgcUser());
			
			if(convo == null) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
			return ResponseEntity.ok(convo);
		}
		catch (ZfgcNotFoundException ex){
			ex.printStackTrace();
			logger.error(ExceptionUtils.getStackTrace(ex));
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		catch (ZfgcInvalidAesKeyException ex) {
			ex.printStackTrace();
			logger.error(ExceptionUtils.getStackTrace(ex));
	    	return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
	    }
	}
	
	@RequestMapping(value="/conversation/{conversationId}/delete",method=RequestMethod.POST, produces="application/json")
	@PreAuthorize("hasRole('ZFGC_USER')")
	public ResponseEntity deleteConversation(@RequestBody TwoFactorKey aesKey,@PathVariable("conversationId") Integer convoId){
		PmConversation convo = new PmConversation();
		convo.setPmConversationId(convoId);
		
		try {
			pmService.removeConvoFromInbox(aesKey, convo, zfgcUser());
		} catch (ZfgcInvalidAesKeyException e) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		} catch (ZfgcNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@RequestMapping(value="/conversation/{conversationId}/delete/{usersId}")
	@PreAuthorize("hasRole('ZFGC_USER')")
	public ResponseEntity deleteConversation(@RequestBody TwoFactorKey aesKey,@PathVariable("conversationId") Integer convoId, @PathVariable("usersId") Integer usersId){
		Users remove = new Users();
		remove.setUsersId(usersId);
		
		try{
			pmService.removeUserFromConvo(aesKey, convoId, remove, zfgcUser());
		} catch (ZfgcSecurityException e) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		} catch (ZfgcNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@RequestMapping(value="/conversation/delete",method=RequestMethod.POST, produces="application/json")
	@PreAuthorize("hasRole('ZFGC_USER')")
	public ResponseEntity deleteConversation(@RequestBody PmConversationMulti conversations){
		try{
			pmService.removeMultiConvoFromInbox(conversations, zfgcUser());
		} catch (ZfgcInvalidAesKeyException e) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		} catch (ZfgcNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@RequestMapping(value="/converstion/{conversationId}/archive",method=RequestMethod.POST, produces="application/json")
	@PreAuthorize("hasRole('ZFGC_USER')")
	public ResponseEntity archiveConversation(@RequestBody TwoFactorKey aesKey, @PathVariable("conversationId") Integer convoId){
		
		try{
			pmService.moveConversationToArchive(aesKey, convoId, zfgcUser());
		} catch (ZfgcInvalidAesKeyException e) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		} catch (ZfgcNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@RequestMapping(value="/conversation/archive",method=RequestMethod.POST,produces="application/json")
	@PreAuthorize("hasRole('ZFGC_USER')")
	public ResponseEntity archiveConversation(@RequestBody PmConversationMulti conversations){
		
		try{
			pmService.moveMultiConversationToArchive(conversations, zfgcUser());
		} catch (ZfgcInvalidAesKeyException e) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		} catch (ZfgcNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@RequestMapping(value="/conversation/{conversationId}/inviteUsers",method=RequestMethod.POST,produces="application/json")
	@PreAuthorize("hasRole('ZFGC_USER')")
	public ResponseEntity inviteUsersToConversation(@RequestBody PmUsersToAdd pmUsers, @PathVariable("conversationId") Integer conversationId){
		try{
			pmService.inviteUsers(conversationId, pmUsers, zfgcUser());
		} catch (ZfgcNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@RequestMapping(value="/convobox/prune", method=RequestMethod.POST,produces="application/json")
	@PreAuthorize("hasRole('ZFGC_USER')")
	public ResponseEntity pruneConversations(@RequestBody PmPrune prune){
		try{
			pmService.pruneConversations(prune, zfgcUser());
		} catch (ZfgcInvalidAesKeyException e) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		} catch (ZfgcNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} catch(ZfgcValidationException e){
			return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(e.getErrors());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}

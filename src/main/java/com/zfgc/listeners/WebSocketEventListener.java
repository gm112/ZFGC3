package com.zfgc.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.zfgc.model.online.WhosOnlineList;
import com.zfgc.model.users.Users;
import com.zfgc.services.users.UsersService;
import com.zfgc.services.whosOnline.WhosOnlineService;

@Component
public class WebSocketEventListener {
	
	@Autowired
	UsersService usersService;
	
	@Autowired
	WhosOnlineService whosOnlineService;
	
	@EventListener
    public void handleWebSocketConnectListener(SessionConnectedEvent event) {
		
		
		try {
			WhosOnlineList online = whosOnlineService.getWhosOnline();
			whosOnlineService.websocketMessaging.convertAndSend("/socket/whosonline", online);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	@EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
		
		
		try {
			if(event.getUser() != null){
				Users user = (Users) ((Authentication) event.getUser()).getPrincipal();
				usersService.setUserOffline(user);
			}
			
			WhosOnlineList online = whosOnlineService.getWhosOnline();
			whosOnlineService.websocketMessaging.convertAndSend("/socket/whosonline", online);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

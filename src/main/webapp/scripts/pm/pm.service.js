(function(){
	
	function PmService($timeout,$resource,UserSearchService, UserService){
		var pmService = {};
		
		pmService.resource = $resource('/forum/pm/template',{},{
			template : {
				url : '/forum/pm/template',
				method : 'GET'
			}
		});
		
		pmService.pmConstants = {
			bbCodes : {
				bold : 1,
				italic : 2,
				underline : 3,
				strikethrough : 4
			}	
		};
		
		pmService.populateUserList = function(vm,results){
			if(!vm.users || vm.users === null){
				vm.clearUserList();
			}
			
			if(results.length > 0){
				Array.prototype.push.apply(vm.users,results);
				vm.currentIndex = results.length >= 10 ? vm.users.length + 10 : vm.users.length;
			}
		};
		
		pmService.getLastCursorPos = function(vm){
			$timeout(function(){
				vm.currentCursorPos = vm.textArea[0].selectionStart;
			},100);
		};
		
		pmService.insertShortcut = function(vm,shortcut){
			vm.personalMessage.message = vm.personalMessage.message.slice(0,vm.currentCursorPos) + pmService.getBbCodeFromLkup(vm.lookups.BBCODE,shortcut) + vm.personalMessage.message.slice(vm.currentCursorPos);
		};
		
		pmService.getBbCodeFromLkup = function(lookups,code){
			for(var i = 0; i < lookups.length;i++){
				if(lookups[i].id === code){
					return lookups[i].value;
				}
			}
			
			return null;
		};
		
		pmService.searchForUsers = function(vm,query, start, length){
			if(!query || query === null || query === '' || length === 0 || query.length < 3){
				vm.clearUserList();
				return;
			}
			
			var results = UserSearchService.performSearch(query, start, length);
			
			results.$promise.then(function(data){
				vm.populateUserList(data);
			});
		};
		
		pmService.getUserDisplayName = function(usersId){
			return UserService.resource.getUserDisplayName({'userId' : usersId});
		};
		
		pmService.appendToSenderList = function(vm,user){
			if(!vm.sendersList || vm.sendersList === null){
				vm.sendersList = [];
			}
			
			vm.sendersList.push({'userId' : user.usersId, 'displayName' : user.displayName});
		};
		
		pmService.getTemplate = function(){
			return pmService.resource.template();
		};
		
		pmService.checkIfUserInList = function(vm,usersId){
			if(!vm || vm === null || !usersId || usersId === null){
				return null;
			}
			
			for(var i = 0; i < vm.sendersList.length; i++){
				if(vm.sendersList[i].userId === usersId){
					return true;
				}
			}
			
			return false;
		};
		
		pmService.removeUserFromList = function(vm,index){
			if(!vm || vm === null){
				return null;
			}
			
			vm.sendersList.splice(index,1);
		};
		
		return pmService;
	}
	
	angular.module('zfgc.pm')
		   .service('PmService',['$timeout','$resource','UserSearchService','UserService',PmService]);
	
})();
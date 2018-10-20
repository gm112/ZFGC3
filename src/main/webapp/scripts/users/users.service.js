(function(){
	'use strict';
	
	function UserService($resource, $window, NotificationsService){
		var UserService = {};
		
		UserService.resource = $resource('/forum/users/newuser', {'userId' : '@userId'},
		{
			newUser:{
			         url: '/forum/users/newuser',
			         method: 'POST'
			},
			userProfile:{
			         url: '/forum/users/profile/:userId',
			         method: 'GET'
			},
			loggedInUser:{
				url: '/forum/users/loggedInUser',
				method: 'GET'
			},
			profileNavigation:{
				url: '/forum/users/navigation',
				method: 'GET',
				isArray: true
			},
			saveAccountSettings:{
				url: '/forum/users/profile/account',
				method: 'POST'
			},
			saveForumProfile:{
				url: '/forum/users/profile',
				method: 'POST'
			},
			saveNotificationSettings:{
				url:'/forum/users/profile/notifications',
				method:'POST'
			},
			savePmSettings:{
				url:'/forum/users/profile/pmSettings',
				method:'POST'
			},
			saveBuddyList:{
				url:'/forum/users/profile/buddyList',
				method:'POST'
			},
			getUserDisplayName : {
				url : '/forum/users/displayName/:userId',
				method : 'GET'
			},
			getMemberListing : {
				url : '/forum/users/member-list',
				method : 'GET',
				isArray : true
			}
		});
		UserService.register = function(user){
		         return UserService.resource.newUser(user);                             
		                                      
		};
		UserService.loadProfile = function(userId,vm){
	         var profile = UserService.resource.userProfile({'userId':userId});   
	         profile.$promise.then(function(data){
	        	vm.profile = data;
	        	
	        	UserService.resource.profileNavigation({"usersId":userId}).$promise.then(function(data){
					vm.navTabs = data;
					
					UserService.setTabActive(vm,data[0],data[0].subTabs[0]);
				});
	        	
	        	NotificationsService.getThreadSubs(userId,1,10).$promise.then(function(data){
	        		vm.threadSubs = data;
	        	});
	         });
	         	                                      
		};
		UserService.setTabActive = function(vm,tab, subTab){
			if(vm.navTabs && vm.navTabs !== null && Array.isArray(vm.navTabs) && tab && tab !== null){
				for(var i = 0; i < vm.navTabs.length; i++){
					vm.navTabs[i].active = false;
				}
			}
			
			tab.active = true;
			vm.activeTabSectionId = subTab.navSectionId;
			vm.activeTabNameId = subTab.title;
			vm.activeParentName = tab.title;
		};
		
		UserService.getProfileNavigationTabs = function(vm){
			UserService.resource.profileNavigation().$promise.then(function(data){
				vm.navTabs = data;
			});
		};

		UserService.saveAccountSettings = function(vm){
			UserService.resource.saveAccountSettings(vm.profile);
		};
		
		UserService.saveForumProfile = function(vm){
			UserService.resource.saveForumProfile(vm.profile);
		};
		
		UserService.saveNotificationSettings = function(vm){
			UserService.resource.saveNotificationSettings(vm.profile);
		};
		
		UserService.savePmSettings = function(vm){
			UserService.resource.savePmSettings(vm.profile);
		};
		
		UserService.isUserAdmin = function(user){
			return user.getPrimaryMemberGroupId === 2;
		};
		
		UserService.isCurrentUser = function(vm,user){
			return vm.profile.usersId === user.getUsersId;
		};
		
		UserService.getAvatarUrl = function(avatar){
			if(avatar && avatar !== null && avatar.avatarTypeId && avatar.avatarTypeId !== null){
			
				switch(avatar.avatarTypeId){
					case 2:
					case 4:
						return "http://localhost:8080/forum/contentstream/avatar/" + avatar.avatarId;
						break;
						
					case 3:
						return avatar.fileName;
						break;
				}
			}
			
			return "assets/images/avatar/avatar-none.png";
		};
		
		UserService.getMemberListing = function(vm, pageNumber, range){
			vm.memberList = UserService.resource.getMemberListing({'pageNo' : pageNumber, 'usersPerPage' : range});
		};
		
		UserService.canEditRestrictedProfileField = function(userProfileId){
			if(UserService.loggedInUser && UserService.loggedInUser.usersId !== null && UserService.loggedInUser.usersId === userProfileId){
				return true;
			}
			
			return false;
		}
		
		return UserService;
	}
	
	angular
		.module('zfgc.users')
		.service('UserService', ['$resource','$window','NotificationsService',UserService])
})();
(function(){
	'use strict';
	
	function UsersCtrl(LookupsService, UserService, $scope,$location,$sce,$window, ModalService){
		var vm = this;
		UserService.loadProfile($location.search().userId,vm);
		
		vm.lookups = LookupsService.getLookupsList("MEMBER_GROUP,AVATAR_TYPE,AVATAR_GALLERY,GENDER,NOTIFICATION_FREQUENCY,LKUP_RECEIVE_MESSAGES,LKUP_PM_NOTIF");
		vm.getLkupValue = LookupsService.getLkupValue;
		
		vm.userActivation = function(){
			UserService.adminUserActivate(vm.profile.usersId);
		};
		
		vm.tabClick = function(tab, subTab){
			UserService.setTabActive(vm,tab, subTab);
		};
		
		vm.saveAccountSettings = function(){
			UserService.saveAccountSettings(vm);
		};
		
		vm.saveForumProfile = function(){
			UserService.saveForumProfile(vm);
		};
		
		vm.saveNotificationSettings = function(){
			UserService.saveNotificationSettings(vm);
		};
		
		vm.savePmSettings = function(){
			UserService.savePmSettings(vm);
		};
		
		vm.saveBuddyList = function(){
			UserService.saveBuddyList(vm);
		};
		
		vm.getAvatarUrlByUser = function(user){
			if(user && user !== null){
				return UserService.getAvatarUrl(user.personalInfo.avatar);
			}
		}
		
		vm.getAvatarUrl = function(){
			if(vm.profile && vm.profile !== null){
				return UserService.getAvatarUrl(vm.profile.personalInfo.avatar);
			}
		};
		
		vm.canEditRestrictedProfileField = function(){
			return UserService.canEditRestrictedProfileField(vm.profile.usersId);
		};
		
		vm.openUserTitleCard = function(user){
			ModalService.createTemplatedPopup('UserTitleCardCtrl','scripts/modal/templates/modalUserTitleCard.html', 'user-title-card-modal',{user : user});
		};
		
		vm.deleteBuddy = function(index){
			UserService.deleteBuddy(vm,index);
		};
		
		vm.selectBuddy = function(buddy){
			UserService.addBuddy(vm,buddy);
		};
		
		vm.isUserAdmin = function(){
			return UserService.isUserAdmin(UserService.loggedInUser);
		};
		
		vm.isUserModerator = function(){
			return UserService.isUserModerator(UserService.loggedInUser);
		};
		
		vm.addMemberGroup = function(){
			vm.profile.secondaryMemberGroups.memberGroups.push({memberGroupId : vm.selectedMemberGroup});
		};
		
		vm.removeMemberGroup = function(index){
			vm.profile.secondaryMemberGroups.memberGroups.splice(index,1);
		};
		
		vm.canSendPmToUser = function(){
			return UserService.canSendPmToUser(vm);
		};
		
		 var w = angular.element($window);
         w.bind('resize', function () {
             
             // Get window width
             $scope.windowWidth = "innerWidth" in window ? window.innerWidth : document.documentElement.offsetWidth;
             vm.showDropdown = false;
             // Change maxSize based on window width
             if($scope.windowWidth > 800) {
                 vm.max = 5;
             } else if($scope.windowWidth > 600) {
                 vm.max = 3;
             } else{
                 vm.max = 0;
                 vm.showDropdown = true;
             }
             $scope.$apply();
         });
		
		vm.max = 5;
		vm.total = 175;
		vm.showDropdown = false;
	}
	
	angular
		.module('zfgc.users')
		.controller('UsersCtrl', ['LookupsService','UserService','$scope','$location','$sce','$window', 'ModalService', UsersCtrl])
})();
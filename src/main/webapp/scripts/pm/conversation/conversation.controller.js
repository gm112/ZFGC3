(function(){
	
	function conversationCtrl($scope, $location, PmService){
		var vm = this;
		
		vm.openConversation = function(conversationId){
			vm.conversation = PmService.openConvo(vm,conversationId);
		};
		
		vm.getConvoTitle = function(){
			return PmService.getConvoTitle(vm);
		};
		
		vm.leaveConvo = function(){
			PmService.leaveConversation(vm,vm.conversation.pmConversationId);
		};
		
		if($location.search().conversationId && $location.search().conversationId !== null){
			vm.openConversation($location.search().conversationId);
		}
	}
	
	angular.module('zfgc.pm')
		   .controller('ConversationCtrl',['$scope','$location','PmService',conversationCtrl]);
	
})();
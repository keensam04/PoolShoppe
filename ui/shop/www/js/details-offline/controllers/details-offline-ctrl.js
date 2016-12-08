
angular.module('detailsOffline')

.controller('detailsOfflineCtrl', ['$scope','$state','Utilities', function($scope,$state,Utilities){
	
	$scope.selectedOffer = { };
	$scope.buddies = [];

	$scope.navigateToChatPage = function(buddy) {
		Utilities.setCurrentBuddy(buddy);
		state = 'app.chat';
		$state.go(state);	
	};

	$scope.init = function () {
		debugger;
		$scope.selectedOffer = Utilities.getCurrentOffer();
		$scope.buddies = Utilities.getBuddies();
	};

	$scope.init();
}]);
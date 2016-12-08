
angular.module('login')

.controller('loginCtrl', ['$scope','Utilities', '$state','$rootScope','$location','$ionicHistory',

	function($scope,Utilities,$state,$rootScope,$location,$ionicHistory){
	
	$scope.data = {};

	$scope.navigateToOffers = function() {
		$ionicHistory.nextViewOptions({
            disableAnimate: true,
            disableBack: true
        });
        state = 'app.offers';
    	$state.go(state);
	};

	$scope.login = function() {
		debugger;
		var user = Utilities.getBuddyById($scope.data.username);
        if (user.password === $scope.data.password) {
        	Utilities.setUserInfo(user);
            $rootScope.$broadcast('userDetails : updated' , user);
        	window.localStorage.setItem("loggedInUser", $scope.data.username);
			$scope.navigateToOffers();
        }
    };

    $scope.init = function() {
    	if (!_.isEmpty(Utilities.getUserInfo())) {
    		$scope.navigateToOffers();
    	}
    };

    $scope.init();
}]);

angular.module('offers')

.controller('offersCtrl', ['$scope','Utilities','$state','$rootScope','$location','$ionicHistory',

	function($scope,Utilities,$state,$rootScope,$location,$ionicHistory){
	
	$scope.offers = [];
	$scope.mode = 'ONLINE';

	$rootScope.$on('mode:updated',function(event,modeObject){
		$scope.mode = modeObject.mode;
		$scope.filterOffers();
	});

	$scope.filterOffers = function() {
		$scope.offers = Utilities.getAllOffers().filter(function(offer) {
        	return offer.offerType === $scope.mode;
        });
	};

	$scope.navigateToOffer = function(url){
		window.open(url, '_system', 'location=yes');
	};

	$scope.navigateToDetailsPage = function(offer) {	

		Utilities.setCurrentOffer(offer);
		var state =  ''; 

		if($scope.mode === 'OFFLINE') {
			state = 'app.detailsOffline';
		}
		else{
			state = 'app.details';
		}

		$state.go(state);	
		
	};

	$scope.init = function () {
		debugger;
		var loggedInUser = window.localStorage.getItem("loggedInUser");
		if(loggedInUser === undefined || loggedInUser === null) {
	        $ionicHistory.nextViewOptions({
    	        disableAnimate: true,
    	        disableBack: true
    	    });
    	    state = 'app.login';
    	    $state.go(state);
    	}
		if (loggedInUser !== null && _.isEmpty(Utilities.getUserInfo())) {
    		Utilities.setUserInfo(Utilities.getBuddyById(loggedInUser));
    	}
    	$scope.filterOffers();
	};

	$scope.init();

}]);
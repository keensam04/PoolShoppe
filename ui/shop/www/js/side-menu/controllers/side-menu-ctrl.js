
angular.module('menu')

.controller('menuCtrl', ['$scope','$rootScope','Utilities',

	function($scope, $rootScope, Utilities){
	
	$scope.mode = true;  //online
	$scope.user = {};

	$rootScope.$on('userDetails:updated', function(event , user) {
		console.dir(user);
		$scope.user = user;
	});

	$scope.changeMode = function(mode){
		var modeDetails = {} ;

		if(mode) {
			console.dir('online');		//online
			modeDetails = {
				mode : 'ONLINE'
			}
		}
		else{
			console.dir('offline');		//offline	
			modeDetails = {
				mode : 'OFFLINE'
			};
		}

		$rootScope.$broadcast('mode:updated',modeDetails);
	};

	$scope.init = function() {
		this.user = Utilities.getUserInfo();
	};

	$scope.init();

}])
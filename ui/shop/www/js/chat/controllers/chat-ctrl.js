
angular.module('chat')

.controller('chatCtrl', ['$scope','Utilities', '$state','$rootScope',

	function($scope,Utilities,$state,$rootScope){

	$scope.loggedInUser = {};
	$scope.currentBuddy = {};
	$scope.chats = {
  		"messages": [
    		{
		    	"from": "KEENSAM04",
		      	"to": "PC9292",
		      	"msg": "Hi"
		    },
		    {
		      	"from": "PC9292",
		      	"to": "KEENSAM04",
		      	"msg": "Hi"
		    },
		    {
		      	"from": "KEENSAM04",
		      	"to": "PC9292",
		      	"msg": "How are you"
		    },
		    {
		      	"from": "PC9292",
		      	"to": "KEENSAM04",
		      	"msg": "Good and you?"
		    }
		]
	};

	$scope.init = function () {
		debugger;
		$scope.loggedInUser = Utilities.getUserInfo();
		$scope.currentBuddy = Utilities.getCurrentBuddy();
	};

	$scope.init();

}]);
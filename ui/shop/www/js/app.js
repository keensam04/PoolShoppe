
angular.module('starter', [
  'ionic', 
  'shared',
  'menu',
  'offers',
  'wallet',
  'details',
  'detailsOffline',
  'address',
  'login',
  'chat'
  // 'google-signin'
  ])

.run(function($ionicPlatform ) {
  $ionicPlatform.ready(function() {
    
    if (window.cordova && window.cordova.plugins.Keyboard) {
      cordova.plugins.Keyboard.hideKeyboardAccessoryBar(true);
    }
    if (window.StatusBar) {      

      StatusBar.styleDefault();
    }
  });
})

.config(function($stateProvider, $urlRouterProvider) {
  $stateProvider

  .state('app', {
    url: '/app',
    abstract: true,
    templateUrl: 'js/side-menu/templates/side-menu.html',
    controller: 'menuCtrl'
  })

  .state('app.search', {
    url: '/search',
    views: {
      'menuContent': {
        templateUrl: 'templates/search.html'
      }
    }
  })

  .state('app.browse', {
      url: '/browse',
      views: {
        'menuContent': {
          templateUrl: 'templates/browse.html'
        }
      }
    })
    .state('app.login', {
      url: '/login',
      views: {
        'menuContent': {
          templateUrl: 'js/login/templates/login.html',
          controller: 'loginCtrl'
        }
      }
    })
    .state('app.offers', {
      url: '/offers',
      views: {
        'menuContent': {
          templateUrl: 'js/offers/templates/offers.html',
          controller: 'offersCtrl'
        }
      }
    })
    .state('app.details', {
      url: '/details',
      views: {
        'menuContent': {
          templateUrl: 'js/details/templates/details.html',
          controller: 'detailsCtrl'
        }
      }
    })
    .state('app.detailsOffline', {
      url: '/offlineDetails',
      views: {
        'menuContent': {
          templateUrl: 'js/details-offline/templates/details-offline.html',
          controller: 'detailsOfflineCtrl'
        }
      }
    })
    .state('app.address', {
      url: '/address',
      views: {
        'menuContent': {
          templateUrl: 'js/address/templates/address.html',
          controller: 'addressCtrl'
        }
      }
    })
    .state('app.chat', {
      url: '/chat',
      views: {
        'menuContent': {
          templateUrl: 'js/chat/templates/chat.html',
          controller: 'chatCtrl'
        }
      }
    })
    .state('app.wallet', {
      url: '/wallet',
      views: {
        'menuContent': {
          templateUrl: 'js/wallet/templates/wallet.html',
          controller: 'walletCtrl'
        }
      }
    });
  
  $urlRouterProvider.otherwise('/app/offers');
}).
controller('mainAppCtrl' , ['$scope' , '$rootScope', function($scope,$rootScope) {
   $scope.test = function() {

   };
}]);

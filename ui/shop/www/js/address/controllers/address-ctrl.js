
angular.module('address')

.controller('addressCtrl', ['$scope','Utilities', '$state','$rootScope','$ionicPopup',

	function($scope,Utilities,$state,$rootScope,$ionicPopup){
	
	$scope.cartDetails = {};
	$scope.netPayableAmount = 0;
	$scope.deliveryType = "";
	$scope.userInfo = {};

	$scope.setDeliveryOption = function () {
		if ("pickup" === this.deliveryType) {
			this.netPayableAmount = this.cartDetails.cartTotal + 20;
		} else {
			this.netPayableAmount = this.cartDetails.cartTotal + 50;
		}
	}

	$scope.placeOrder = function() {
		debugger;
		var offer = Utilities.getCurrentOffer();
		var products = [];
		for ( index in this.cartDetails.items) {
			var product = {
				productId : this.cartDetails.items[index].productId,
				quantity : this.cartDetails.items[index].quantity
			};
			products.push(product);
		}
		var payload = {
			"CustomerId": $scope.userInfo.id,
			"OfferId": offer.id,
			"OfferCategory": offer.offerCategory,
			"Products": products,
			"coupon": offer.couponCode,
			"deliverAddress": $scope.userInfo.address,
  			"deliveryOption": this.deliveryType,
  			"pricepaid": this.netPayableAmount,
  			"walletmoney": $scope.userInfo.walletBalance
		};
		// make ajax call to place order
		Utilities.placeOrder(JSON.stringify(payload)).then(
			function(res) {
				$scope.showSuccessDialog(res);
			},
			function(err) {
				$scope.showErrorDialog(err);
			}
		);
	};

	$scope.showSuccessDialog = function(res) {
		var message = "";
		if (res !== undefined) {
			if (res.orderStatusCode === 'InProcess') {
				message = "Your order number " + res.orderId + " has been submitted for processing. You will get a notification once your order has been confirmed."
			} else {
				message = "Your order number " + res.orderId + " has been placed successfully."
			}
		}
	   var alertPopup = $ionicPopup.alert({
	     title: 'Order Placed Successfully',
	     template: message
	   });

	   alertPopup.then(function(res) {
	   		Utilities.getUserInfo().walletBalance = res.walletmoneyleft;
			$state.go('app.offers');
	   });
	};

	$scope.showErrorDialog = function(err) {
	   var alertPopup = $ionicPopup.alert({
	     title: 'Could not place order',
	     template: err.status + ' ' + err.error + ' : ' + err.message
	   });
	};

	$scope.init = function () {
		this.cartDetails = Utilities.getCartDetails();	
		this.deliveryType = "pickup";
		this.userInfo = Utilities.getUserInfo();
		this.setDeliveryOption();
	};

	$scope.init();

}]);
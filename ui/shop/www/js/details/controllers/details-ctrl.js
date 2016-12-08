
angular.module('details')

.controller('detailsCtrl', ['$scope','Utilities','$state', function($scope,Utilities,$state){
	

	$scope.selectedOffer = {};
	$scope.allProductsList = [];
	$scope.cartDetails = [];
	$scope.cartTotal = 0;

	$scope.addProductToCart = function () {
		var productID = this.getParameterByName("pid", $scope.productUrlInput)
		var selectedProduct = this.allProductsList.filter(function(product) {
			return product.productId == productID;
		})[0];
		this.cartTotal = this.cartTotal + parseInt(selectedProduct.sp);
		if ($.inArray(selectedProduct, this.cartDetails) == -1) {
			this.cartDetails.push(selectedProduct);
		} else {
			var item = this.cartDetails.filter(function(item) {
				return item.productId == productID;
			})[0];
			item.quantity++;
		}
	};

	$scope.getParameterByName = function (name, url) {
    	name = name.replace(/[\[\]]/g, "\\$&");
    	var regex = new RegExp("[?&]" + name + "(=([^&#]*)|&|#|$)"),
    		results = regex.exec(url);
    	if (!results) return null;
    	if (!results[2]) return '';
    	return decodeURIComponent(results[2].replace(/\+/g, " "));
	};

	$scope.navigateToPayment = function () {
		var cartDetails = {
			items : $scope.cartDetails,
			cartTotal : $scope.cartTotal
		};
		Utilities.setCartDetails(cartDetails);
		$state.go('app.address');
	};

	$scope.init = function () {
		$scope.selectedOffer = Utilities.getCurrentOffer();
		$scope.allProductsList = Utilities.getAllProducts();

	};

	$scope.init();
}]);
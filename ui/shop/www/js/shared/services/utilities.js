angular.module('shared').
factory('Utilities',['$rootScope', '$http','schemas','RESTSvc','$state',
                    function($rootScope,$http,schemas,RESTSvc,$state){
    
    var offer = {};
    var cartDetails = {};
    var userInfo = {};
    var currentBuddy = {};

    return {
        getAllOffers : function () {
            var offers = schemas.allOffersList;
            return offers;
        },
        setCurrentOffer : function (selectedOffer) {
            offer = selectedOffer;
        },
        getCurrentOffer : function() {
            return offer;
        },
        getAllProducts : function (){
            var products = schemas.allProductsList;
            return products;
        },
        setBuddies: function() {

        },
        getBuddies : function(){
            return schemas.shareBuddies.filter(function(buddy) {
                return buddy.id !== userInfo.id;
            });
        },

        setCurrentBuddy: function(buddy) {
            currentBuddy = buddy;
        },

        getCurrentBuddy : function(){
            return currentBuddy;
        },

        // for passing cart total from detail page to payment page - online scenario
        setCartDetails : function(cart) {
            cartDetails = cart;
        },
        getCartDetails : function() {
            return cartDetails;
        },

        // for accessing user info globally
        setUserInfo : function(user) {
            userInfo = user;
        },

        getUserInfo : function() {
            return userInfo;
        },

        getBuddyById : function(name) {
            return this.getBuddies().filter(function(buddy) {
                return buddy.id == name;
            })[0];
        },

        //call to server to place order
        placeOrder : function(payload) {
            return RESTSvc.post("https://poolshoppe.cfapps.sap.hana.ondemand.com/placeorder", payload, {"Content-Type":"application/json"});
        }
    };

}])

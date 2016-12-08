angular.module('shared')
.factory('RESTSvc', ['$q', '$http', '$injector',

			function($q, $http, $injector) {

				return {

					get: function( api_url, payload,header ) {

						var Utilities = $injector.get('Utilities');
						// Utilities.loading.show();
						var deferred = $q.defer();

						$http({
				            method :'GET',
				            url:api_url,
				            headers :header
				          }).success(function(response, status, headers){
							// Utilities.loading.hide();
                                if(api_url.indexOf("entities") > -1 || api_url.indexOf("targetGroups") > -1 || api_url.indexOf("campaigns") > -1) {
                                    var result = {};
                                    result.data = response;
                                    result.status = status;
                                    result.headers = headers();
                                    deferred.resolve(result);
                                }
                                else
				                    deferred.resolve(response);
				          }).error(function(response) {		 
							// Utilities.loading.hide();                   
							deferred.reject(response);
						  });

						return deferred.promise;
					},


					post: function( api_url, payload,header ) {

						var Utilities = $injector.get('Utilities');
						// Utilities.loading.show();
                        
						var deferred = $q.defer();

						$http({
				            method :'POST',
				            url:api_url,
				            data:payload,
				            headers :header
				         }).success(function(response,status,headers){
							// Utilities.loading.hide();
				         	if(status==201){
				         		var response_headers = headers().location;
				            	deferred.resolve(response_headers);	
				         	}
				         	else if(status==200){
				         		deferred.resolve(response);
				         	}
				         	
				         }).error(function(response) {	
							// Utilities.loading.hide();	                    
							deferred.reject(response);
						 });

						
						return deferred.promise;
					},


					put: function( api_url, payload,header ) {
						var Utilities = $injector.get('Utilities');
						// Utilities.loading.show();

						var deferred = $q.defer();

						$http({
				            method :'PUT',
				            url:api_url,
				            data:payload,
				            headers :header
				         }).success(function(response){
							// Utilities.loading.hide();
				               deferred.resolve(response);
				         }).error(function(response) {		
							// Utilities.loading.hide();                    
							deferred.reject(response);
						 });
						
						return deferred.promise;
					},

					delete: function(api_url,header){
						var Utilities = $injector.get('Utilities');
						// Utilities.loading.show();
						var deferred = $q.defer();

						$http({
				            method :'DELETE',
				            url:api_url,
				            headers :header
				         }).success(function(response){
							// Utilities.loading.hide();
				               deferred.resolve(response);
				         }).error(function(response) {		
							// Utilities.loading.hide();                    
							deferred.reject(response);
						 });
						
						return deferred.promise;

					}
				};
			}
		]);

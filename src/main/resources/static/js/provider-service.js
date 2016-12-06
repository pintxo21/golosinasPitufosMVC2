var providerService = angular.module('providerService', [])

   providerService.service('ProviderService', ['$http', '$q', function($http, $q){
        return{
            getProviders: function(){
                var deferred = $q.defer();

                $http.get('/provider')
                    .then(function(response){
                        if(response.status == 200){
                            deferred.resolve(response.data);
                        }
                        else {
                            deferred.reject('Error while fetching providers');
                        }
                    });

                return deferred.promise;
            },

            deleteProvider: function(providerId){
                var deferred = $q.defer();

                $http({
                    method: 'DELETE',
                    url: '/provider'
                    data: providerId,
                    headers: {
                        "Content-Type": "application/json"
                    }
                }).then(function(response){
                    if(response.status == 200){
                        deferred.resolve();
                    }
                    else{
                        deferred.reject('Error deleting provider');
                    }
                });

                return deferred.promise;
            },

            addProvider: function(){
                var deferred = $q.defer();

                $http({
                    method: 'POST',
                    url: '/provider,
                    headers: {
                       "Content-Type": "application/json"
                    }
                }).then(function(response){
                    if(response.status == 200){
                        deferred.resolve();
                    }
                    else{
                        deferred.reject('Error while adding provider');
                    }
                });

                return deferred.promise;
            },

            updateProvider: function(providerId){
                var deferred = $q.defer();

                $http.put('/provider', providerId)
                    .then(function(response){
                        if(response.status == 200){
                            deferred.resolve();
                        }
                        else{
                            deferred.reject('Error while updating provider');
                        }
                    });

                return deferred.promise;
            }
        }
    }]);
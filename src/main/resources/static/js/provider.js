var providerApp = angular.module('providerApp', ['spring-security-csrf-token-interceptor', 'providerService'])
    providerApp.controller('providerCtrl', ['$scope', '$http', 'ProviderService', function ($scope, $http, ProviderService) {
        $scope.providers = [];
        getProviders();

        function getProviders(){
            ProviderService.getProviders()
                .then(function(data){
                    formatData(data);
                },
                function(errorMessage){
                    console.log("error");
                });
        }

        var formatData = function(data){
            var response = data.providersDTOSet;
            response.forEach(function(provider) {
                var retProvider = {
                    providerName: provider.providerName,
                    providerAddress: provider.providerAddress,
                    providerPhone: provider.providerPhone
                }
                $scope.providers.push(retProvider);
            });
        };

    }]);


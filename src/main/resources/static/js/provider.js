angular.module('providerApp', ['spring-security-csrf-token-interceptor'])
    .controller('providerCtrl', ['$scope', '$http', function ($scope, $http) {
        $scope.providers = [];

        $http({
            method: 'GET',
            url: '/provider',
            headers: {
                "Content-Type": "application/json"
            }
        })
       .success(function(data){
           formatData(data);
       })
       .error(function(){
            alert("error");
            return null ;
        });

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

        //comment
    }]);

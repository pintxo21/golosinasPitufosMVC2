angular.module('loginApp', ['common', 'spring-security-csrf-token-interceptor'])
    .controller('LoginCtrl', ['$scope', '$http', function ($scope, $http) {

        $scope.preparePostData = function () {
            var username = $scope.vm.username != undefined ? $scope.vm.username : '';
            var password = $scope.vm.password != undefined ? $scope.vm.password : '';

            return 'username=' + username + '&password=' + password;
        };

        $scope.onLogin = function () {
            console.log('Attempting login with username ' + $scope.vm.username + ' and password ' + $scope.vm.password);

            $scope.vm.submitted = true;

            if ($scope.form.$invalid) {
                return;
            }

            var postData = $scope.preparePostData();

            $http({
                method: 'POST',
                url: '/authenticate',
                data: postData,
                headers: {
                    "Content-Type": "application/x-www-form-urlencoded",
                    "X-Login-Ajax-call": 'true'
                }
            })
                .then(function (response) {
                    if (response.data == 'ok') {
                        window.location.replace('/index.html');
                    }
                    else {
                        $scope.vm.errorMessages = [];
                        $scope.vm.errorMessages.push({description: 'Access denied'});
                    }
                });
        };

    }]);
angular.module('newUserApp', ['common', 'spring-security-csrf-token-interceptor'])
    .controller('NewUserCtrl', ['$scope', '$http', function ($scope, $http) {

        $scope.createUser = function () {
            console.log('Creating user with username ' + $scope.vm.username + ' and password ' + $scope.vm.password);

            $scope.vm.submitted = true;

            if ($scope.form.$invalid) {
                return;
            }

            var postData = {
                username: $scope.vm.username,
                password: $scope.vm.password,
                passwordConfirm: $scope.vm.confirmPassword
            };

            $http({
                method: 'POST',
                url: '/registration',
                data: postData,
                headers: {
                    "Content-Type": "application/json",
                    "Accept": "text/plain"
                }
            })
            .then(function (response) {
                if (response.status == 200) {
                    console.log("New user created");
                    window.location.replace('/index.html');
                    //$scope.login($scope.vm.userName, $scope.vm.password);
                }
                else {
                    $scope.vm.errorMessages = [];
                    $scope.vm.errorMessages.push({description: response.data});
                    console.log("failed user creation: " + response.data);
                }
            });
        }
    }]);
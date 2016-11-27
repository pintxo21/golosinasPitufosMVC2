angular.module('common', ['ngMessages'])
    .controller('BaseFormCtrl', ['$scope', '$http', function ($scope, $http) {

        var fieldWithFocus;

        $scope.vm = {
            submitted: false,
            errorMessages: []
        };

        $scope.focus = function (fieldName) {
            fieldWithFocus = fieldName;
        };

        $scope.blur = function (fieldName) {
            fieldWithFocus = undefined;
        };

        $scope.isMessagesVisible = function (fieldName) {
            return fieldWithFocus === fieldName || $scope.vm.submitted;
        };


    }])
    .directive('myErrorMessages', function () {
        return {
            restrict: 'E',
            // link: function (scope, element, attrs) {
            //     scope.extraStyles = attrs.extraStyles;
            // },
            templateUrl: '/error/error-messages2.html'
        }
    });


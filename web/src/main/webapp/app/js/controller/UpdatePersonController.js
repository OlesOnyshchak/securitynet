angular
    .module('securitynet')
    .controller('UpdatePersonController', ['$scope', '$log', '$modalInstance', 'PersonService', 'response',
        function ($scope, $log, $modalInstance, PersonService, response) {
            console.log(response);

            $scope.person = response;

            $scope.cancel = function () {
                window.location.reload(true);
            };

            $scope.submit = function () {
                PersonService.save($scope.person);
                window.location.reload(true);
            };
        }]);

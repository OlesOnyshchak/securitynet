angular
    .module('securitynet')
    .controller('AddPersonController', ['$scope', '$log', '$modalInstance', 'PersonService',
        function ($scope, $log, $modalInstance, PersonService) {
            $scope.person = {};

            $scope.cancel = function () {
                window.location.reload(true);
            };

            $scope.submit = function () {
                PersonService.save($scope.person);
                window.location.reload(true);
            };
        }]);

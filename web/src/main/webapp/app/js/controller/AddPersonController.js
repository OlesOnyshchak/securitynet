angular
    .module('securitynet')
    .controller('AddPersonController', ['$scope', '$log', '$modalInstance', 'PersonService',
        function ($scope, $log, $modalInstance, PersonService) {
            $scope.person = {};

            $scope.submit = function () {
                $log.info($scope.person);
                PersonService.save($scope.person);
                window.location.reload(true);
            };
        }]);

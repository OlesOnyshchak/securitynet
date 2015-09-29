angular
    .module('securitynet')
    .controller('AddPersonController', ['$scope', '$log', '$modalInstance', 'PersonService',
        function ($scope, $log, $modalInstance, PersonService) {
            $scope.person = {};

            $scope.cancel = function () {
                window.location.reload(true);
            };
            $scope.submit = function () {
                if (!($scope.person.firstName == 'undefined' ||
                    $scope.person.lastName == 'undefined' ||
                    $scope.person.dateOfBirth == 'undefined'))
                {
                    PersonService.save($scope.person);
                    window.location.reload(true);
                }
            };
        }]);

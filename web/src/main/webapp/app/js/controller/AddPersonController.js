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
                    $scope.person.firstName = $scope.person.firstName
                        .replace(/\d+/g, '')
                        .replace(/\W/g, '');

                    $scope.person.lastName = $scope.person.lastName
                        .replace(/\d+/g, '')
                        .replace(/\W/g, '');

                    PersonService.save($scope.person);
                    window.location.reload(true);
                }
            };
        }]);

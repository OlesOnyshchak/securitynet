angular
    .module('securitynet')
    .controller('UpdatePersonController', ['$scope', '$log', '$modalInstance', 'PersonService', 'response',
        function ($scope, $log, $modalInstance, PersonService, response) {

            $scope.person = response;
            $scope.person.dateOfBirth = new Date(response.dateOfBirth);

            $scope.cancel = function () {
                window.location.reload(true);
            };
            $scope.submit = function (personInfo) {
                personInfo.dateOfBirth = personInfo.dateOfBirth;
                if (!(personInfo.firstName == '' ||
                    personInfo.lastName == '' ||
                    personInfo.dateOfBirth == ''))
                {
                    PersonService.update(personInfo);
                    window.location.reload(true);
                }
            };
        }]);

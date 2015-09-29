angular
    .module('securitynet')
    .controller('UpdatePersonController', ['$scope', '$log', '$modalInstance', 'PersonService', 'response',
        function ($scope, $log, $modalInstance, PersonService, response) {

            $scope.person = response;

            $scope.cancel = function () {
                window.location.reload(true);
            };

            $scope.submit = function (personInfo) {
                console.log(personInfo);
                console.log(personInfo.firstName);
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

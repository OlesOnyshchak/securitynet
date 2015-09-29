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
                if (!(personInfo.firstName == '' ||
                    personInfo.lastName == '' ||
                    personInfo.dateOfBirth == ''))
                {
                    var firstLetterPosition = 0;
                    personInfo.firstName = personInfo.firstName
                        .replace(/\d+/g, '')
                        .replace(/\W/g, '');

                    personInfo.lastName = personInfo.lastName
                        .replace(/\d+/g, '')
                        .replace(/\W/g, '');

                    PersonService.update(personInfo);
                    window.location.reload(true);
                }
            };
        }]);

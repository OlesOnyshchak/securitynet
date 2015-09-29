angular.module('securitynet')
    .controller('PersonController', ['$scope', '$location', '$modal', 'PersonService', function ($scope, $location, $modal, PersonService) {

        PersonService.getAll().then(function (data) {
            $scope.persons = data;
        });

        $scope.savePerson = function (req) {
            PersonService.save(req);
        };

        $scope.getPersonById = function (id) {
            PersonService.get(id);
        };

        $scope.deletePersonById = function (id) {
            PersonService.deletePerson(id).then(function (data) {
                window.location.reload(true);
            });
        };

        $scope.updatePerson = function (id) {
            PersonService.deletePerson(id).then(function (data) {
            });
        };
        $scope.addPerson = function () {
            var modalInstance = $modal.open({
                animation: true,
                templateUrl: 'app/template/person/addPerson.html',
                controller: 'AddPersonController',
                size: 'md'
            });
        }
    }]);
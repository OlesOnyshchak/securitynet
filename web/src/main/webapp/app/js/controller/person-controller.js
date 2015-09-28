angular.module('securitynet')
    .controller('PersonController', ['$scope','PersonService','$rootScope', function($scope, PersonService, $rootScope) {
        $scope.personInfo = {};
        $scope.allPersonInfo = {};

        $scope.savePerson = function(reg) {
            console.log(reg);
            PersonService.save(reg);
        };

        $scope.getPersonById = function(id){
            console.log(PersonService.get(id));
        };

        $scope.getAllPerson = function(){
         PersonService.getAll().then(function(data){
             console.dir(data);
         });
        };

        $scope.deletePersonById = function(id){
            PersonService.deletePerson(id).then(function(data){
                console.dir(data);
            });
        };

        $scope.updatePerson = function(id){
            PersonService.deletePerson(id).then(function(data){
                console.dir(data);
            });
        }
    }]);
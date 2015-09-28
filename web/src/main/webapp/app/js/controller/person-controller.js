angular.module('securitynet')
    .controller('PersonController', ['$scope','PersonService','$rootScope', function($scope, PersonService, $rootScope) {
        $scope.personInfo = {};

        $scope.savePerson = function(reg) {
            console.log(reg);
            PersonService.create(reg);
        };
    }]);
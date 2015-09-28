angular.module('securitynet',['ngRoute']).config(function($routeProvider){
    $routeProvider
        .when('/',{
            templateUrl:'app/templates/person/index.html',
            controller: 'PersonController'
        });
});
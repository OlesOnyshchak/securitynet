angular.module('securitynet',['ngRoute']).config(function($routeProvider){
    $routeProvider
        .when('/add',{
            templateUrl:'app/template/person/index.html',
            controller: 'PersonController'
        })
        .otherwise({ redirectTo: '/'});
});
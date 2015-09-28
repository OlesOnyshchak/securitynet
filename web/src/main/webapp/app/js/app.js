angular.module('securitynet',['ngRoute']).config(function($routeProvider){
    $routeProvider
        .when('/add',{
            templateUrl:'app/template/person/save.html',
            controller: 'PersonController'
        })
        .when('/get',{
            templateUrl:'app/template/person/get.html',
            controller: 'PersonController'
        })
        .when('/getAll',{
            templateUrl:'app/template/person/getAll.html',
            controller: 'PersonController'
        })
        .when('/delete',{
            templateUrl:'app/template/person/delete.html',
            controller: 'PersonController'
        })
        .otherwise({ redirectTo: '/'});
});
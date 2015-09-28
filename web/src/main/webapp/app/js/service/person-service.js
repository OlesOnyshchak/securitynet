angular.module('securitynet')
    .factory("PersonService", ['$http', function PersonServiceFactory($http) {
        return {
            create: function (reg) {
                console.log("ok");
                return $http.post('save-person', reg).success(function (data) {
                    console.log("ok");
                });
            }
        }
    }]);
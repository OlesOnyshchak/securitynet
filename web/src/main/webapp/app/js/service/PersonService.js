angular.module('securitynet')
    .factory("PersonService", ['$http', function PersonServiceFactory($http) {
        return {
            save: function (reg) {
                return $http.post('save-person', reg).success(function (data) {
                });
            },
            get: function (id) {
                return $http.get('get-person/' + id).then(function (response) {
                    return response.data;
                });
            },
            getAll: function () {
                return $http.get('get-all-person').then(function (response) {
                    return response.data;
                });
            },
            deletePerson: function (id) {
                return $http.delete('delete-person/' + id).then(function (response) {
                    return response;
                });
            },
            update: function (personInfo) {
                return $http.put('update-person',personInfo).then(function (response) {
                    return response;
                });
            }

        }
    }]);

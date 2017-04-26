/**
 * Created by willemhustinx on 17-4-2017.
 */
(function () {
    'use strict';

    angular
        .module('app')
        .service('ThemesService', ThemesService);

    ThemesService.$inject = ['$http'];

    function ThemesService($http) {

        var urlBase = '/WebCrawlerWeb/rest/themes';

        this.getAll = function () {
            return $http.get(urlBase);
        };
    }
})();
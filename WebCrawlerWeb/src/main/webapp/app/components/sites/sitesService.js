/**
 * Created by willemhustinx on 17-4-2017.
 */
(function () {
    'use strict';

    angular
        .module('app')
        .service('SitesService', SitesService);

    SitesService.$inject = ['$http'];

    function SitesService($http) {

        var urlBase = '/WebCrawlerWeb/rest/sites';

        this.getAll = function () {
            return $http.get(urlBase);
        };

        this.crawl = function () {
            return $http.put(urlBase + '/crawl');
        }

    }
})();
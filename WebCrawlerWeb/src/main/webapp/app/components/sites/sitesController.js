/**
 * Created by willemhustinx on 17-4-2017.
 */
(function () {
    'use strict';

    angular
        .module('app')
        .controller('SitesController', SitesController);

    SitesController.$inject = ['SitesService'];

    function SitesController(SitesService) {
        var vm = this;

        getAll();

        function getAll() {
            SitesService.getAll()
                .then(function (response) {
                    vm.sites = response.data;
                }, function (error) {
                    vm.status = 'Unable to load data: ' + error.message;
                });
        }

        vm.crawl = function () {
            SitesService.crawl()
                .then(function (response) {
                    console.log(response);
                });
        }
    }
})();
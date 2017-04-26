/**
 * Created by willemhustinx on 17-4-2017.
 */
(function () {
    'use strict';

    angular
        .module('app')
        .controller('ThemesController', ThemesController);

    ThemesController.$inject = ['ThemesService'];

    function ThemesController(ThemesService) {
        var vm = this;

        getAll();

        function getAll() {
            ThemesService.getAll()
                .then(function (response) {
                    vm.themes = response.data;
                }, function (error) {
                    vm.status = 'Unable to load data: ' + error.message;
                });
        }
    }
})();
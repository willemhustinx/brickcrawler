(function () {
    'use strict';

    angular
        .module('app')
        .config(Routes);

    Routes.$inject = ['$routeProvider'];

    function Routes($routeProvider) {

        $routeProvider
            .when('/', {
                templateUrl: 'app/components/home/homeView.html',
                controller: 'HomeController',
                controllerAs: 'home'
            })
            .when('/sites', {
                templateUrl: 'app/components/sites/sitesView.html',
                controller: 'SitesController',
                controllerAs: 'sites'
            })
            .when('/themes', {
                templateUrl: 'app/components/themes/themesView.html',
                controller: 'ThemesController',
                controllerAs: 'themes'
            })
    }

})();
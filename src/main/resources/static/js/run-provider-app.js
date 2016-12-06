///////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Defines the javascript files that need to be loaded and their dependencies.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////

require.config({
    paths: {
        angular: '../bower_components/angular/angular',
        lodash: "../bower_components/lodash/dist/lodash",
        csrfInterceptor: '../bower_components/spring-security-csrf-token-interceptor/dist/spring-security-csrf-token-interceptor.min',
        common: 'common',
        providerService: 'provider-service',
        providerApp: 'provider'
    },
    shim: {
        angular: {
            exports: "angular"
        },
        csrfInterceptor: {
            deps: ['angular']
        },
        common: {
            deps: ['angular', 'csrfInterceptor']
        },
        providerService: {
            deps: ['angular', 'csrfInterceptor']
        },
        providerApp: {
            deps: [ 'common', 'providerService']
        }
    }
});

require(['providerApp'], function () {
    angular.bootstrap(document.getElementById('providerApp'), ['providerApp']);
});
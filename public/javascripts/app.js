
require.config({
    waitSeconds : 15, //make sure it is enough to load all scripts
    baseUrl: 'javascripts',
    paths:{
        //'jquery':'libs/jquery/1.7.1/jquery',  // local jQuery
        //'jquery':'libs/jquery/1.7.1/jquery-loader', // load jQuery from html
        'jquery':'http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min', // load jQuery from CDN
        'underscore':'libs/underscore/1.3.1/underscore',
        'backbone':'libs/backbone/0.9.1/backbone',
        'backbone-localstorage':'libs/backbone/0.9.1/backbone-localstorage',
        'requirelib':'libs/require/1.0.6/require',
        'domReady':'libs/require/1.0.6/domReady',
        'order':'libs/require/1.0.6/order',
        'text':'libs/require/1.0.6/text',
        'i18n':'libs/require/1.0.6/i18n',
        'tpl':'libs/require/1.0.6/tpl',
        // Plugins form https://github.com/millermedeiros/requirejs-plugins
        'async':'libs/require/1.0.6/async',
        'depend':'libs/require/1.0.6/depend',
        'font':'libs/require/1.0.6/font',
        'goog':'libs/require/1.0.6/goog',
        'image':'libs/require/1.0.6/image',
        'json':'libs/require/1.0.6/json',
        'noext':'libs/require/1.0.6/noext',
        'mdown':'libs/require/1.0.6/mdown',
        'propertyParser':'libs/require/1.0.6/propertyParser'
    }
});

require([
    'domReady', // optional, using RequireJS domReady plugin
    'views/app.view'
], function(domReady, AppView){

    domReady(function () {

        var app_view = new AppView;

    });
});




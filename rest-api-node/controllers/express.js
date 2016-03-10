/**
 * Created by omprakash.yadav on 28/07/15.
 */

var path = require('path'),

    express = require('express');

module.exports = function (app) {

    app.set('views', path.join(__dirname, '../views'));
    app.set('view engine', 'ejs');
    //TODO Check if putting this in the beginning of the code section fixes the issue (Try directly on the box)
    app.use(express.static(path.join(__dirname, '../public')));

}


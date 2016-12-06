/**
 * Created by oyadav on 11/27/16.
 */

var async = require("async");
//var each = require("underscore-node");

var cars = ['Tesla', 'Nissan', 'Chevy', 'Subaru'];

// _.each(cars, function (element, index, list) {
//     var output = 'Element: ' + element + ', ' + 'Index: ' + index + ', ' + 'List Length: ' + list.length;
//     log(output, ' #eacharraysunderscore');
// });


async.auto({

    get_username: function (callback) {
        console.log("user name here");
        callback(null, "om");

    },
    connect_to_db : function (callback) {
        console.log("db here");
        var connected = true;
        if(connected)
        callback(null, connected );
    },
    check_if_user_exits : ['connect_to_db', function (results, callback) {

        var userExits = true;
        console.log("check : "+ JSON.stringify(results));

        if(userExits){
            callback(null, "user exits");
        } else {

            console.log("got it");
            callback(null, userExits);
        }
    }

    ],

    sign_up : ['check_if_user_exits', function (results, callback) {

        console.log("success sign up "+ JSON.stringify(results));

        callback(null, {'status':'200', 'msg': 'successfully signed up!!!'});
    }]

}, function (err, results) {
     console.log('results' + JSON.stringify(results));

    });
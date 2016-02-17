/**
 * Created by omprakash.yadav on 16/02/16.
 */

var mongoose = require('mongoose'),
    Musician = mongoose.model('Musician');

exports.findAll = function(req, res){
    Musician.find({},function(err, results) {
        return res.send(results);
    });
};

exports.add = function() {};
exports.update = function() {};
exports.delete = function() {};

exports.findByName = function(req, res) {

    res.send({"id": 1,"name":req.params.name,
        "band":"BBQ Brawlers"});

};



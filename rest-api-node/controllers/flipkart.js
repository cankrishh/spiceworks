/**
 * Created by omprakash.yadav on 16/02/16.
 */
var mongoose = require('mongoose'),
    Musician = mongoose.model('Musician');

exports.findByNameInFk = function(req, res) {

    res.send({"id": 1,"name":req.params.name,
        "band":"BBQ Brawlers","moto":req.query.moto});

};
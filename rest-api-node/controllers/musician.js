/**
 * Created by omprakash.yadav on 16/02/16.
 */

// exports.findAll = function(req, res){
//     console.log(req);
//     console.log(req.params);
//     req.find({},function(err, results) {
//         return res.send(results);
//     });
// };
exports.findAll = function(req, res){
    res.send([{
        "id": 1,
        "name": "Max",
        "band": "Maximum Pain",
        "instrument": "guitar"
    }]);
};

exports.add = function() {};
exports.update = function() {};
exports.delete = function() {};

exports.findByName = function(req, res) {

    res.send({"id": 1,"name":req.params.name,
        "band":"BBQ Brawlers"});

};






module.exports = function(app){
    var musicians = require('../controllers/musician');
    app.get('/musicians', musicians.findAll);

    app.get('/musicians/:name', musicians.findByName);
    app.post('/musicians', musicians.add);
    app.put('/musicians/:id', musicians.update);
    app.delete('/musicians/:id', musicians.delete);
}
















//var express = require('express');
//var router = express.Router();
//
///* GET home page. */
//router.get('/', function(req, res, next) {
//  res.render('index', { title: 'Express' });
//});
//
//module.exports = router;

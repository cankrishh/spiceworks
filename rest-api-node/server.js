var express = require('express');
var path = require('path');

var app=express();
var port =2001;
//app.configure(function(){
//    app.use(express.bodyParser());
//});
app.set('views', path.join(__dirname, '/views'));
app.set('view engine', 'ejs');

app.use(express.static(__dirname + '../views'));


app.get('/',function(req,res){
    res.send("This is sample test");
});
require('./controllers/express') (app);
require('./routes/index')(app);
require('./routes/users')(app);

app.listen(port);

console.log("server started at "+port);


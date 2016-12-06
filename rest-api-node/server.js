var express = require('express');
var path = require('path');

var app=express();
var port =2001;
//app.configure(function(){
//    app.use(express.bodyParser());
//});
app.set('views', path.join(__dirname, '/views'));
app.set('view engine', 'ejs');

 app.use(express.static(__dirname + '../views')); // Built in middleware function static


// app.get('/',function(req,res){
//     res.send("This is sample response");
// });
app.get("/", function(httpRequest, httpResponse, next){
    httpResponse.write("Hello");
    next(); //remove this and see what happens
});

app.get("/", function(httpRequest, httpResponse, next){
    httpResponse.write(" World !!!");
    httpResponse.end();
});
require('./controllers/express') (app);
require('./routes/index')(app);
require('./routes/users')(app);

app.listen(port);
console.log(app);
console.log("server started at "+port);


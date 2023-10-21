var mongoose = require('mongoose'),
passportLocalMongoose = require('passport-local-mongoose');

var UserSchema = new mongoose.Schema({
    username: String,
    password : String
});

UserSchema.plugin(passportLocalMongoose); //Hashing and Salting of password automatically. You don't need to define your own seriolizeUser() and deserializeUser() methods

module.exports = mongoose.model("User",UserSchema);
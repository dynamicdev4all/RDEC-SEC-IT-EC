const userModel = require("../models/userModel");
const sendMail = require("../services/sendMail");
const jwt = require('jsonwebtoken');
const JWT_SECRET='this_is_top_Secret  ';
const userRegister = async(username, email, password)=>{
    try {
        const user = await userModel.findOne({ email: email });
        // if (user) {
        //   console.log("This Email is already in use");
        // } else {
          const newUser = new userModel({
            userName: username,
            email: email,
            passsword: password,
            isActive: false,
          });
          // await newUser.save();
          sendMail(email, username)
          console.log("register success");
        }
      // } 
      catch (error) {
        console.log(error);
      }
}

const userLogin = async(email, password)=>{
    try {
        const user = await userModel.findOne({ email: email });
        if (user) {
          if (user.passsword == password && user.isActive) {
                 res.redirect("/dashboard");
          } else if (user.passsword == password && !user.isActive) {
            console.log("Please verify your email");
          } else if (user.passsword != password) {
            console.log("Password is invalid ");
          }
        } else {
          console.log("The user does not exist");
        }
      } catch (error) {
        console.log(error);
      }
}
const emailVerification = (mail_id)=>{
  try {
    console.log(mail_id)
    const decode_id = jwt.verify(mail_id, JWT_SECRET);
    console.log(decode_id)
  const emailToBeVerified = decode_id.email;
  console.log(emailToBeVerified)
    
  } catch (error) {
    if(jwt.TokenExpiredError){
      console.log("TOken is expired")
    }else{
      console.log(error)
    }
  }
  
}
module.exports = {
    userRegister,
    userLogin,
    emailVerification
}
const nodemailer = require('nodemailer');
const jwt = require('jsonwebtoken');
const JWT_SECRET='this_is_top_Secret';
const sendMail = (email, userName)=>{    const mailTransport = nodemailer.createTransport({
        service:"gmail",
        auth:{
            user:"test.duck.mail@gmail.com",
            pass:"tneelcbewgryosum"
        }
    })


    const id = jwt.sign({email}, JWT_SECRET, {expiresIn:"10m"})
    const verificationLink = `http://localhost:1234/verify-email?id=${id}`
    
    const mailToSend = ({
        from:"test.duck.mail@gmail.com",
        to:email,
        subject:"Verification Mail From Sec-F",
        html: `<body style="font-family: Arial, sans-serif; margin: 0; padding: 20px; background-color: #f4f4f4;">
    <div style="max-width: 600px; margin: auto; background: #ffffff; padding: 20px; border-radius: 5px; box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);">
        <h2 style="color: #333;">Dear ${userName},</h2>
        <p style="color: #555; line-height: 1.6;">
            Your account has been created successfully.<br>
            Please click on the link below to verify your account.
        </p>
        <p>
            <a href="${verificationLink}">${verificationLink}</a>
        </p>
        <p style="color: #555; line-height: 1.6;">
            Thanks & Regards,<br>
            Team Sec-F.
        </p>
    </div>
</body>`
    })
    
    mailTransport.sendMail(mailToSend, (err)=>{
        if(err){
            console.log("Mail sent failed ",err)
        }else{
            console.log("Mail sent success")
        }
    })
}

module.exports = sendMail;
const mongoose = require("mongoose");

const dbconn = mongoose
  .connect(
    "mongodb+srv://piebytwo014:piebytwo014@cluster0.n8om1.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
  )
  .then(() => {
    console.log("Database connection Success");
  })
  .catch((err) => {
    console.log("Some issue in connection ", err);
  });

  module.exports = dbconn;

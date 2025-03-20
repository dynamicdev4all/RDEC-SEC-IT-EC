const e = require("express"); // import express

const app = e();

const path = require("path");

//this is the main route or root route
app.get("/", (req, res) => {
  res.sendFile(path.join(__dirname, "public", "homepage.html"));
});
app.get("/login", (req, res) => {
  res.sendFile(path.join(__dirname, "public", "login.html"));
});
app.get("/register", (req, res) => {
  res.sendFile(path.join(__dirname, "public", "register.html"));
});
app.get("/account-verify", (req, res) => {
  console.log("ACC VERIFY");
});
app.post("/create-new-user", (req, res) => {
  console.log("REgister is called");
});
app.post("/login-user", (req, res) => {
  console.log("login is called");
});

app.listen(6565, () => {
  console.log("Server is running on Port 6565");
});

const User = require("../models/UserModel");

exports.getUsers = (req, res) => {
  const users = [new User("Lucas")];
  res.json(users);
};

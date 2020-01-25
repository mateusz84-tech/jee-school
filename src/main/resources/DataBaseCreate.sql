CREATE DATABASE jeeschool
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;
USE jeeschool;
CREATE TABLE user_group(
    id INT(11) AUTO_INCREMENT,
    name VARCHAR(255),
    PRIMARY KEY (id)
);
CREATE TABLE users(
    id INT(11) AUTO_INCREMENT,
    name VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    password VARCHAR(245),
    user_group_id INT(11),
    PRIMARY KEY (id),
    FOREIGN KEY (user_group_id) REFERENCES user_group(id)
);
CREATE TABLE exercises(
  id INT(11) AUTO_INCREMENT,
  title VARCHAR(255),
  description TEXT,
  PRIMARY KEY (id)
);
CREATE TABLE solution(
  id INT(11) AUTO_INCREMENT,
  created DATETIME,
  updated DATETIME,
  description TEXT,
  exercise_id INT(11),
  users_id INT(11),
  PRIMARY KEY (id),
  FOREIGN KEY (exercise_id) REFERENCES exercises(id),
  FOREIGN KEY (users_id) REFERENCES users(id)
);
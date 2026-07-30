CREATE DATABASE IF NOT EXISTS inventory_management_system;
USE inventory_management_system;

CREATE TABLE IF NOT EXISTS item (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(160) NOT NULL,
  owner VARCHAR(120) NOT NULL,
  status VARCHAR(40) NOT NULL
);

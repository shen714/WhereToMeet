CREATE SCHEMA IF NOT EXISTS WhereToMeet;
USE WhereToMeet;

DROP TABLE IF EXISTS User;

CREATE TABLE User (
	userID INT AUTO_INCREMENT,
    userName VARCHAR(255),
    password VARCHAR(255),
    preferredplaces VARCHAR(255),
    CONSTRAINT pk_User_UserID
		PRIMARY KEY(userID)
);



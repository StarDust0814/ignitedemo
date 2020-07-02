DROP TABLE IF EXISTS UserCache;

CREATE TABLE UserCache (
 userAccount VARCHAR PRIMARY KEY,
 password VARCHAR,
 userID INT,
 userName VARCHAR
) WITH "template=partitioned, backups=1, CACHE_NAME=UserCache, VALUE_TYPE=lu.ankang.ignitedemo.model.User";

INSERT INTO UserCache(userAccount, password, userID, userName) VALUES ('aaa','111',1,'1hao');
INSERT INTO UserCache(userAccount, password, userID, userName) VALUES ('bbb','11',2,'23hao');
INSERT INTO UserCache(userAccount, password, userID, userName) VALUES ('ccc','1',3,'45hao');
INSERT INTO UserCache(userAccount, password, userID, userName) VALUES ('ddd','1111',4,'678hao');
INSERT INTO UserCache(userAccount, password, userID, userName) VALUES ('eee','11111',5,'9hao');
CREATE TABLE IF NOT EXISTS "topic"(
    topicId int primary key,
    topicName varchar (30) not null
);

INSERT INTO "topic" values (1,'Comedy');
INSERT INTO "topic" values (2,'Romance');
INSERT INTO "topic" values (3,'Other');

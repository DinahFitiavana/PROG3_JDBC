CREATE TABLE IF NOT EXISTS "subscribers"(
    subscriberId int primary key,
    subscriberName varchar (200) not null,
    subscriberReference varchar (10)
);

INSERT INTO "subscribers" values (1,'Kanto','F205');
INSERT INTO "subscribers" values (2,'Mathieu','M147');
INSERT INTO "subscribers" values (3,'Randy','M200');

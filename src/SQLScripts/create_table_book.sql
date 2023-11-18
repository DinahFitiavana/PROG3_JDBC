CREATE TABLE IF NOT EXISTS "book"(
    bookId int primary key,
    bookName varchar (200) not null,
    pageSize int,
    releaseDate date,
    author int references author(authorId)
);

INSERT INTO "book" values (1,'Loca',198,'2004-10-20',2);
INSERT INTO "book" values (2,'After',214,'2015-09-14',3);
INSERT INTO "book" values (3,'Love Story',150,'2004-01-29',1);

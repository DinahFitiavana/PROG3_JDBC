CREATE TABLE IF NOT EXISTS "author"(
    authorId int primary key,
    authorName varchar (100) not null,
    sex varchar (10)
);

INSERT INTO "author" values (1,'Peter Smith','M');
INSERT INTO "author" values (2,'Maria Dali','F');
INSERT INTO "author" values (3,'Anna Todd','F');

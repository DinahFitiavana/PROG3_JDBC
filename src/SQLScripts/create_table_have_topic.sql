CREATE TABLE IF NOT EXISTS "have_topic"(
    bookId int references book(bookId),
    topicId int references topic(topicId)
);

INSERT INTO "have_topic" values (2,2);
INSERT INTO "have_topic" values (3,2);
INSERT INTO "have_topic" values (3,3);

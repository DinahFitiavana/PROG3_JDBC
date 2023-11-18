import java.time.LocalDate;

public class Book {
    private int bookId;
    private String bookName;
    private Author author;
    private int pageSize;
    private Topic topic;
    private LocalDate releaseDate;

    public Book(int bookId, String bookName, Author author, int pageSize, Topic topic, LocalDate releaseDate) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.pageSize = pageSize;
        this.topic = topic;
        this.releaseDate = releaseDate;
    }

    public Book() {

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}

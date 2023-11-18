import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookCrudOperations implements CrudOperations<Book>{
    @Override
    public List<Book> findAll() {
        ConnectionToDatabase db = new ConnectionToDatabase();
        Connection connection = db.createConnection();
        List<Book> books = new ArrayList<>();
        try (
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM book");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Book book = new Book();
                book.setBookId(resultSet.getInt("bookId"));
                book.setBookName(resultSet.getString("bookName"));
                book.setPageSize(resultSet.getInt("pageSize"));
                book.setReleaseDate(resultSet.getDate("releaseDate").toLocalDate());
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    };
    @Override
    public List<Book> saveAll(List<Book> toSave) {

    };
    @Override
    public Book save(Book toSave) {

    };
    @Override
    public Book delete(Book toDelete) {
    };
}
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorCrudOperations implements CrudOperations<Author>{
    @Override
    public List<Author> findAll() {
        ConnectionToDatabase db = new ConnectionToDatabase();
        Connection connection = db.createConnection();
        List<Author> authors = new ArrayList<>();
        try (
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM author");
                ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Author author = new Author();
                author.setAuthorId(resultSet.getInt("authorId"));
                author.setAuthorName(resultSet.getString("authorName"));
                author.setSex(resultSet.getString("sex"));
                authors.add(author);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authors;
    };
    @Override
    public List<Author> saveAll(List<Author> toSave) {

    };
    @Override
    public Author save(Author toSave) {

    };
    @Override
    public Author delete(Author toDelete) {

    };
}



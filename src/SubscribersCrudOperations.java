import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubscribersCrudOperations implements CrudOperations<Subscribers>{
    @Override
    public List<Subscribers> findAll() {
        ConnectionToDatabase db = new ConnectionToDatabase();
        Connection connection = db.createConnection();
        List<Subscribers> subscribers = new ArrayList<>();
        try (
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM subscribers");
                ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Subscribers subscribers1 = new Subscribers();
                subscribers1.setId(resultSet.getInt("subscriberId"));
                subscribers1.setName(resultSet.getString("subscriberName"));
                subscribers1.setReference(resultSet.getString("subscriberReference"));
                subscribers.add(subscribers1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return subscribers;
    };
    @Override
    public List<Subscribers> saveAll(List<Subscribers> toSave) {

    };
    @Override
    public Subscribers save(Subscribers toSave) {

    };
    @Override
    public Subscribers delete(Subscribers toDelete) {
    };
}




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDatabase {
    private String url;
    private String user;
    private String password;

    public ConnectionToDatabase() {
        this.url = "jdbc:postgresql://localhost/library_management";
        this.user = "postgres";
        this.password = "randriamino";
    }

    public Connection createConnection(){
        try {
            Connection connection = DriverManager.getConnection(
                    this.url, this.user, this.password
            );
            return connection;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ConnectionToDatabase db = new ConnectionToDatabase();
        Connection connection = db.createConnection();
    }
}


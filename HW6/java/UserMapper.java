import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;

public class UserMapper {
    private static final String url = "jdbc:mysql://localhost:3306/schema2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "313131";

    private Connection connection;

    protected User myUser;

    public UserMapper(Connection connection) {
        this.connection = connection;
    }

    public User findById(int ID) {
        try {
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = this.connection.prepareStatement("SELECT ID, firstName, lastName, Age FROM new_schema WHERE id = ?");
            statement.setInt(1, ID);
            try (ResultSet resultSet = statement.executeQuery()) {
                {
                    while (resultSet.next()) {
                       myUser = new User(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getInt(4));
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return myUser;
    }

    public static void info (User myUser) {
        System.out.println(myUser);
    }

}



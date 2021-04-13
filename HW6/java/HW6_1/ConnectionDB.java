package HW6_1;
import java.sql.*;

public class ConnectionDB {

    private final String url = "jdbc:mysql://localhost:3306/schema2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String user = "root";
    private final String password = "313131";

    private Connection connection;

    public ConnectionDB(){
        try {
            connection = DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Нет подключения к БД!");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}


import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;

//это вариант экспериментов


public class DataBase {
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/schema2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "313131";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String args[]) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
            if(!con.isClosed()){
                System.out.println("Соединение с БД установлено!");
            }
            stmt = con.createStatement();
            //stmt.execute("INSERT INTO new_table(firstName, lastName, Age) VALUES ('Василий', 'Тёркин', 19);"); //execute для вставки и получения данных
            //Урааа! Вставили первые данные в БД! Давайте ещё расширим БД.
            //stmt.execute("INSERT INTO new_table(firstName, lastName, Age) VALUES ('Глафира', 'Сергеенко', 112);");
            //stmt.execute("INSERT INTO new_table(firstName, lastName, Age) VALUES ('Андрей', 'Белый', 16);");
            //stmt.execute("INSERT INTO new_table(firstName, lastName, Age) VALUES ('Василиса', 'Прекрасная', 23);");
            //stmt.executeUpdate(); //с помощью этогшо метода делаем запросы. Давайте внесем изменения в запись.
            //int res = stmt.executeUpdate("UPDATE new_table SET firstName ='Александр' WHERE ID = 3;");
            //Ура! Внесли изменения в БД.
            // System.out.println(res); если хотим увидеть результат
            //Давайте проверим, точно ли, если вызвать строчку с добавкой данных еще раз, она добавится.
            //stmt.execute("INSERT INTO new_table(firstName, lastName, Age) VALUES ('Глафира', 'Сергеенко', 112);");
            //да, точно) поэтому все эти строчки будут в комментариях
//            stmt.executeUpdate("UPDATE new_table SET firstName ='Антонина' WHERE ID = 5;");
//            stmt.executeUpdate("UPDATE new_table SET lastName ='Плюшечкина' WHERE ID = 5;");
//            stmt.executeUpdate("UPDATE new_table SET Age=50  WHERE ID = 5;");
            //несколько команд можно объединить в пакет
//            stmt.addBatch("INSERT INTO new_table(firstName, lastName, Age) VALUES ('Алиса', 'Собака', 12)");
//            stmt.addBatch("INSERT INTO new_table(firstName, lastName, Age) VALUES ('Мария', 'Страстная', 34)");
//            stmt.executeBatch();
            //всё добавилось
            // stmt.clearBatch(); //это если мы хотим очистить бэтч

            //далее получаем данные с БД, там, понятно, можно не комментировать.
            String query = "select * from new_table";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                int id = result.getInt(1); //номер колонки, это айди
                System.out.println(id);
                String id2 = result.getString(2); //это имена
                System.out.println(id2);

            }

            con.close(); //не забываем закрывать
        }
        catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }
}
package HW6_1;

//это вариант "почище".

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        ConnectionDB conn = new ConnectionDB();

        String query = "SELECT * FROM new_table";
        //String query = "SELECT * FROM new_table WHERE ID = 3"; // если хотим конкретного пользователя

        try {
            Statement stmt = conn.getConnection().createStatement();
            ResultSet resultSet = stmt.executeQuery(query);

            while(resultSet.next()){
                Person person = new Person(); //набрали данные, создали объект, и потом с ним работаем
                person.setID(resultSet.getInt(1)); //можно обращаться просто по имени колонки вместо индекса
                person.setFirstName(resultSet.getString(2));
                person.setLastName(resultSet.getString(3));
                person.setAge(resultSet.getInt(4));
                //или это может быть в одну строку, но очень длинную :)

                System.out.println(person);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

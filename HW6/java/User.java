//идея: "понюхать" базу данных )
//база создана, соединение создано, маленькие экспериментики есть в DataBase.
//далее попробуем применить паттерн Data Mapper. Для этого сначала создадим класс юзера, который есть объект из нашей таблицы
//далее в DataBase же

public class User {
    private String firstName;
    private String lastName;
    private int ID;
    private int Age;

    public User(String firstName, String lastName, int ID, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        Age = age;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "ID: " + ID + " " + firstName + " " + lastName + ", Age: " + Age;
    }
}

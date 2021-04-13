package HW6_1;

public class Person {

    private int ID;
    private String firstName;
    private String lastName;
    private int Age;

    public Person(){
    }


    public Person(int ID, String firstName, String lastName, int Age){
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Age = Age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "ID: " + ID + " " + firstName + " " + lastName + ", Age: " + Age;
    }
}

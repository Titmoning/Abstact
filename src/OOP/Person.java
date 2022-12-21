package OOP;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String number;
    public static int id = 0;
    final static int CENTURY = 21;
    {
        name = "Oleg";
        age = 18;
    }

    public Person(String name, String surname, int age, String number) {

        this.surname = surname;

        this.number = number;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "OOP.Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                '}';
    }
    public void talk(){
        System.out.println("Hello");
    }

    public static void printInfo (){
        System.out.println("Столько людей: " + id);

    }

}

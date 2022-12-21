package OOP;

public class Customer extends Person {
    private int salary;
    private String position;
    Customer(String name, String surname, int age, String number, int salary, String position){
        super(name, surname, age, number);
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return "OOP.Customer{" +
                "salary=" + salary +
                ", position='" + position + '\'' +
                "} " + super.toString();
    }

    public void serveClient(){
        System.out.println("Serve the client");
    }

    @Override
    public void talk() {
        System.out.println("buy");
    }
}

package OOP;

public class Client extends Person{
   private int money;
    Client(String name, String surname, int age, String number, int money){
        super(name, surname, age, number);
        this.money = money;
    }
    public void buy(){
        System.out.println("Buy smthing");
    }

    @Override
    public String toString() {
        return "OOP.Client{" +
                "money=" + money +
                "} " + super.toString();
    }
}

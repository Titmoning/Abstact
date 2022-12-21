package DZ;

import java.util.ArrayList;

public class Client extends Person{
    private ArrayList<Book> books;
    private boolean rareOrNot;

    public Client(String name, String surname, int age, String gender, boolean rareOrNot) {
        super(name, surname, age, gender);
        this.books = new ArrayList<>();
        this.rareOrNot = rareOrNot;
    }

    @Override
    public String toString() {
        return "Client{" +
                "books=" + books +
                ", rareOrNot=" + rareOrNot +
                "} " + super.toString();
    }
}

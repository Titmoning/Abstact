package DZ;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library l = new Library();
        ArrayList<Book> book = new ArrayList<>();
        Book book1 = new Book("Lotro","Tolkien",500, true, 10, "07.12", 1);
        Book book2 = new Book("SW","Cameron",360, false, 12, "05.12",3);
        book.add(book1);
        book.add(book2);
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("Katya","Ivanova",27,"female",350,"Seller" );
        Employee employee2 = new Employee("Ivan", "Ivanov", 25,"male", 250,"Manager");
        employees.add(employee1);
        employees.add(employee2);
        ArrayList<Client> clients = new ArrayList<>();
        Client client1 = new Client("Alex","Sidorov",15, "male",false);
        Client client2 = new Client("Lena", "Golovach", 20,"female", true);
        clients.add(client1);
        clients.add(client2);
        Library l2 = new Library(employees,clients,book);
        System.out.println(l);
        System.out.println(l2);
    }
}

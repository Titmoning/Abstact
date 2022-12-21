package DZ;

import java.util.ArrayList;

public class Library {
    private ArrayList<Employee> employees;
    private ArrayList<Client> clients;
    private ArrayList<Book> books;

    public Library(ArrayList<Employee> employees, ArrayList<Client> clients, ArrayList<Book> books) {
        this.employees = employees;
        this.clients = clients;
        this.books = books;
    }
    public Library(){
        this.employees = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void addEmployees(Employee employee){
        employees.add(employee);
    }
    public void addClients(Client client){
        clients.add(client);
    }
    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "employees=" + employees +
                ", clients=" + clients +
                ", books=" + books +
                '}';
    }
}




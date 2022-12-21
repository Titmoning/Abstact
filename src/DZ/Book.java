package DZ;

public class Book {
    private String name;
    private String author;
    private int numberOfPages;
    private boolean availability;
    private int price;
    private String dateOfStart;
    private int countOfDays;

    public Book(String name, String author, int numberOfPages, boolean availability, int price, String dateOfStart, int countOfDays) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.availability = availability;
        this.price = price;
        this.dateOfStart = dateOfStart;
        this.countOfDays = countOfDays;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", availability=" + availability +
                ", price=" + price +
                ", dateOfStart='" + dateOfStart + '\'' +
                ", countOfDays=" + countOfDays +
                '}';
    }
}

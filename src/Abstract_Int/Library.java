package Abstract_Int;

public class Library extends Building{
    private int countBooks;
    private String guard;
    public Library(String name, String address, int yearOfBuilding, String archName, boolean seeSide, int countBooks, String guard) {
        super(name,address,yearOfBuilding,archName, seeSide);
        this.countBooks = countBooks;
        this.guard = guard;
    }

    public void regList(){
        System.out.println("Вы записаны на слушания");
    }

    @Override
    public String toString() {
        return "Library{" +
                "countBooks=" + countBooks +
                ", guard='" + guard + '\'' +
                "} " + super.toString();
    }
}

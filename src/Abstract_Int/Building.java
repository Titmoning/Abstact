package Abstract_Int;

public abstract class Building {
    private String name;
    private String address;
    private int yearOfBuilding;
    private String archName;
    private boolean seeSide;

    public Building(String name, String address, int yearOfBuilding, String archName, boolean seeSide) {
        this.name = name;
        this.address = address;
        this.yearOfBuilding = yearOfBuilding;
        this.archName = archName;
        this.seeSide = seeSide;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", yearOfBuilding=" + yearOfBuilding +
                ", archName='" + archName + '\'' +
                ", seeSide=" + seeSide +
                '}';
    }
}

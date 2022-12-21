package Abstract_Int;

public class House extends Building implements LivingHouse, SocialHouse{
    private boolean forLiving;
    private int rooms;
    public House(String name, String address, int yearOfBuilding, String archName, boolean seeSide, boolean forLiving, int rooms){
        super(name,address,yearOfBuilding,archName,seeSide);
        this.forLiving = forLiving;
        this.rooms = rooms;
    }
    public void rent(){
        System.out.println("House for rent!");
    }

    @Override
    public String toString() {
        return "House{" +
                "forLiving=" + forLiving +
                ", rooms=" + rooms +
                "} " + super.toString();
    }

    @Override
    public void guard() {
        System.out.println("Куда пошел?");
    }

    @Override
    public void jkh() {
        System.out.println("Плоти");
    }

    @Override
    public void chopGuard() {
        System.out.println("ЧОП");
    }

    @Override
    public void coworking() {
        System.out.println("Кокосовый латте");
    }
}

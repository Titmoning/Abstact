package Abstract_Int;

public class Main {

    public static void main(String[] args) {
        Library l = new Library("Ленина", "Ленина", 1289, "Ленин", true, 100000,"Соблюдай тишину!");
        System.out.println(l);
        House h = new House("ЖК","Moscw" , 2022, "Pupkin", false, true, 6);
        System.out.println(h);
        h.guard();
        h.jkh();
    }
}
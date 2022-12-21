package OOP;

public class test {
    public static void main(String[] args) {
        Customer customer = new Customer("Oleg", "Tinkoff", 50, "8965213685", 10000000, "topManager");
        Client client = new Client("Trump", "Trump", 80, "123123123", 1233131313);
        System.out.println(client);
        System.out.println(customer);
        customer.talk();
        client.talk();
        System.out.println();

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();
        System.out.println();

        Bird b = new Bird();
        b.setName("Bob");
        b.setArea("На югах");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.display();
        b.chirick_chirick();
        System.out.println();


        Fish f = new Fish();
        f.setName("Сельд");
        f.display();
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();
        System.out.println();

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.display();
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();
    }
}

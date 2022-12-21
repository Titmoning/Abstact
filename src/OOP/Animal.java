package OOP;

public class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isSwim;
    boolean isWalk;
    boolean isFly;
    final static String description = "О животных";
    static int id = 0;
    {
        name = "Homeless";
        type = "OOP.Animal";
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal() {

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSwim(boolean isSwim) {
        this.isSwim = isSwim;
    }

    public void setWalk(boolean isWalk) {
        this.isWalk = isWalk;
    }

    public void setFly(boolean isFly) {
        this.isFly = isFly;
    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
        id++;
    }

    public final void rename(String name) {

        this.name = name;
    }

    public void display() {
        System.out.println("Тип:" + type + ", Имя:" + name + ", Возраст:" + age + ", Вес:" + weight +
                ", Умеет летать:" + (isFly ? "Да" : "Нет") + ", Умеет ходить:" +
                (isWalk ? "Да" : "Нет") + ", Умеет плавать:" + (isSwim ? "Да." : "Нет."));
    }

    public void holiday() {
        this.weight = Math.ceil(weight + 0.1);
    }

    public void holiday(int n) {
        this.weight = weight + (n * 0.1);
    }

    public void holiday(double m) {
        this.weight = weight + m;
    }

    public void holiday(double m, int n) {
        this.weight = weight + (n * m);
    }

    public boolean isFly() {
        return isFly;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void getInfo(){
        System.out.println("Hello animals");
    }

    @Override
    public String toString() {
        return "OOP.Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isSwim=" + isSwim +
                ", isWalk=" + isWalk +
                ", isFly=" + isFly +
                " Id: "+ id + '}';
    }
}




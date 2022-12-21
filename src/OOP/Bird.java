package OOP;

public class Bird extends Animal {
    private String area;
    private boolean winterFly;

    Bird(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String area, boolean winterFly) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.area = area;
        this.winterFly = winterFly;
    }

    public Bird() {
        super();
        isFly = true;
        winterFly = false;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public void chirick_chirick() {
        System.out.println("Chirik_Chirik");
    }

    @Override
    public void display() {
        System.out.println("I am:" + "Тип:" + type + ", Имя:" + name + ", Возраст:" + age + ", Вес:" + weight +
                ", Умеет летать:" + (isFly ? "Да" : "Нет") + ", Умеет ходить:" +
                (isWalk ? "Да" : "Нет") + ", Умеет плавать:" + (isSwim ? "Да" : "Нет") + ", Где обитает: " + area + " Улетает на зимовку? " + (winterFly ? "Да" : "Нет"));
    }
}

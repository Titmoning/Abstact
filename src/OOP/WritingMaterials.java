package OOP;

public class WritingMaterials {
    public String name;
    public String color;
    public double length;
    public int price;
    public boolean draw;
    static String description = "Все для письма";
    public static int id = 0;
    {
        name = "pen";
        color = "orange";
    }
    public WritingMaterials(){
        id++;
    }
    public void display() {
        System.out.println( "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", length=" + length +
                ", price=" + price +
                ", draw=" + draw + ", ID: "+ id
                );
    }

    public void draw() {
        if(isDraw()){
            System.out.println(name + " рисует " + color);
        }else{
            System.out.println("Не умеет");
        }
    }

    public void priceDown(int i) {
        this.price = price - i;
    }

    public void priceUp(int i) {
        this.price = price + i;
    }

    public void replace_rod(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
    public static void getInfo(){
        System.out.println("Только ручки");
    }
}

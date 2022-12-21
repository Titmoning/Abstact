package OOP;

public final class Fish extends Animal{
    private String squama;
    private boolean upStreamSwim;

    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String squama, boolean upStreamSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.squama = squama;
        this.upStreamSwim = upStreamSwim;
    }

    public Fish() {
    isSwim = true;
    }

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public void bul_bul() {
        System.out.println("Bul-bul");
    }
}

package HW16;

public class Formula extends Car {

    public int speed;

    public Formula(String b, String md, int m, int s) {

        super(b, md, m);
        this.speed = s;
        speedtest(this.speed);
    }

    public void speedtest(int s){
        if (s > 300){
            System.out.println("STOP");
        }
    }
}

import Ex.Audi;

public class Auto2 extends Audi {
    public Integer maxSpeed;
    public Auto2(String brand, String model, Double mileage, Integer maxSpeed) {
        super(brand, model, mileage);
        this.maxSpeed = maxSpeed;
    }

    public void maxSpeed() {
        int maxSpeed=300;
        if(maxSpeed > 300){
            System.out.print("STOP");
        }
        else {
        System.out.println("GO");
    }}}




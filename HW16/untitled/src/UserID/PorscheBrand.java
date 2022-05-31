package UserID;

public class PorscheBrand extends CarsInfo {
    public int MaxSpeed;

    public PorscheBrand(String Brand, String Model, int Mileage, int Speed) {
        super(Brand, Model, Mileage);
        this.MaxSpeed = Speed;
    }

    public void ValidateMaxSpeed() {
        if(this.MaxSpeed > 300){
            System.out.print("Slow Down");
        }
        else {
            System.out.print("Don't push pedal");
        }
    }
}

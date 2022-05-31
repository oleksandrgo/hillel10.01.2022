package Profile;

public class Fiat {
    public class fiat extends Auto{
        public Double speed;
        public fiat(String brand, String model, Double mileage, Double speed){
            super(brand, model, mileage);
            if (speed>300){
                System.out.println("СТОП");
            }
            this.speed = speed;
        }
    }
}

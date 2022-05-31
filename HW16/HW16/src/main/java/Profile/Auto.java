package Profile;
public class Auto {
    public String brand;
    public String model;
    public Double mileage;

    public Auto(String brand, String model, Double mileage) {
        this.brand = brand;
        this.model = model;
        if (!(mileage >= 0 && mileage <= 999999)) {
            this.mileage = mileage;
            else{
                System.out.println("Invalid values");
            }
        }
    }
}


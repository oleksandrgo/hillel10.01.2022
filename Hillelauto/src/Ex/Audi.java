package Ex;

public class Audi {
    public String brand;
    public String model;
    public Double mileage;

    public Audi(String brand, String model, Double mileage)  {
        this.brand = brand;
        this.model = model;

        if(!(mileage>=0 && mileage<=999999)){
            throw new IllegalArgumentException ("Mileage must be up 0 to 999999");
        }
        this.mileage = mileage;
    } }


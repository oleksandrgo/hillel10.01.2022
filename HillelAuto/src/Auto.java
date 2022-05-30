public class Auto {
    public String brand;
    public String model;
    public Double mileage;

    public Auto(String brand, String model, Double mileage)  {
        this.brand = brand;
        this.model = model;
        //проверяем миледж
        if(!(mileage>=0 && mileage<=999999)){
            throw new IllegalCallerException("Mileage must be from 0 to 999999");
        }
        this.mileage = mileage;
        }


}

package UserID;

public class CarsInfo {
    public String Brand;
    public String Model;
    protected int Mileage;


    public CarsInfo(String Brand, String Model, int Mileage) {
        this.Brand = Brand;
        this.Model = Model;
        this.Mileage = Mileage;

    }

    public int Mileage(int mileage) {
        if (!(mileage >= 0 && mileage <= 999999)) {
            try {
                throw new IllegalAccessException("Mileage 0 to 999999");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return mileage;
    }

    protected void setMileage(int mileage) {
        this.Mileage = Mileage(mileage);
    }
    public void Mileage() {
        if (!(this.Mileage >= 0 && this.Mileage <= 999999)) {
            try {
                throw new IllegalAccessException("Mileage must be between 0 and 999999");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

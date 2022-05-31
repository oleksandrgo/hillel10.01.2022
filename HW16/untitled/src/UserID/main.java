package UserID;

public class main {
    public static void main (String [] args) {
        PorscheBrand Porsche =new PorscheBrand ("Porsche","911",20,300);
        Porsche.ValidateMaxSpeed();
        System.out.print("\n");
        CarsInfo CarsInfo = new CarsInfo("Porsche", "Cayenne", 50) ;
        UserRegistration RegUser = new UserRegistration("Oleksii", "Kotov", "testhillel@test.com",
                "apexkot", "apexkot");
        boolean is_valid = RegUser.validate();
        System.out.println(is_valid ? "Valid" : "Not Valid");
        CarsInfo.Mileage();
        CarsInfo.setMileage(CarsInfo.Mileage);

    }

}

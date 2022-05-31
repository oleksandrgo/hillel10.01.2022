package HW16;
import HW16.User;

public class Main {

    public static void main(String[] args){
        User user1 = new User("volcharartemgmail.com", "asdsafdsafdsad", "Artem", "Volkov");
        //user1.info1();

        User user2 = new User("volcharartem@gmail.com", "asdsafdsafdsad");
        //user1.info2();

        Car car1 = new Car("Tesla", "Model X", -8);
        //car1.info();

        Car car2 = new Car("Tesla", "Model 3", 5000);
        //car2.info();

        Formula car3 = new Formula("Ferrari", "F1", 8000, 350);
        //car3.info();

        Formula car4 = new Formula("Lamborgini", "Urus", 300, 200);
        //car4.info();
    }

}
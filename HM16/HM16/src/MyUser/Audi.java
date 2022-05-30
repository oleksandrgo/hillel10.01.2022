package MyUser;
//6.Создать наследника авто, у которого будет также максимальная скорость 300
public class Audi extends Cars {
    public int MaximumSpeed;

    public Audi(String Brand, String Model, int Mileage, int MaximumSpeed) {
        super(Brand, Model, Mileage);
        this.MaximumSpeed = MaximumSpeed;

    }
    //7.Создать метод, который будет говорить "СТОП" если вы привысили скрость!!!
    public void MaximumSpeed() {
        int MaximumSpeed=300;
        if(MaximumSpeed >=300){
            System.out.print("STOP");
        }
        else {
            System.out.print("You don't speed up");
        }
            }
        }


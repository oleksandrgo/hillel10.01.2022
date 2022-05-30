
//Создаем наследника
public class Porshe extends Auto {
    public Double speed;

    public Porshe(String brand, String model, Double mileage, Double speed) {
        super(brand, model, mileage);
        //если скорость выше 300 говорим "СТОП"
        if(speed>300){
            throw new IllegalCallerException("STOP");
        }
        this.speed = speed;
    }
    //говорим "СТОП", если скорость превышает 300
    public void sayStop() {
        if (speed > 300){
            System.out.println("СТОП");
        }
    }
}

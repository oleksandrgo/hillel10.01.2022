package MyUser;
//4.Создать класс авто с полями как в Hillel auto
public class Cars {
    public String Brand;
    public String Model;
    protected int Mileage;

    //5.Сделать валидацию на пробег, допустимые значения от 0 до 999999. Проверка должна выполнятся на момент создания
    // обьекта.
    public Cars(String Brand, String Model, int Mileage) throws IllegalAccessException {
        this.Brand = Brand;
        this.Model = Model;
        if (!(Mileage >= 0 && Mileage <= 999999)) {

            throw new IllegalAccessException("Mileage 0 to 999999");

        }
        this.Mileage = Mileage;

    }

}









package MyUser;
//4.Создать класс авто с полями как в Hillel auto
public class Cars {
    public String Brand;
    public String Model;
    protected int Mileage;


    public Cars(String Brand, String Model, int Mileage) {
        this.Brand = Brand;
        this.Model = Model;
        this.Mileage = Mileage;

    }
    //5.Сделать валидацию на пробег, допустимые значения от 0 до 999999. Проверка должна выполнятся на момент создания
    // обьекта.
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
    }//&#x417;&#x43D;&#x430;&#x447;&#x435;&#x43D;&#x438;&#x435; Mileage &#x434;&#x43E;&#x43B;
    //&#x436;&#x43D;&#x43E; &#x431;&#x44B;&#x442;&#x44C; &#x43E;&#x442; 0 &#x434;&#x43E; 999999

    public void Mileage() {
        int mileage = 1;
        if (!(mileage >= 0 && mileage <= 999999)) {
            try {
                throw new IllegalAccessException("Mileage must be between 0 and 999999");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}









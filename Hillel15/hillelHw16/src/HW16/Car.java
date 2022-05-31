package HW16;

public class Car {

    String brand, model;
    int mileage;

    public Car(String b, String md, int m) {
        this.brand = b;
        this.model = md;
        if (mileagecheck(m)) {
            this.mileage = m;
        } else {
            System.out.println("Значения поля Mileage вне диапазона значений");
        }
    }

    static boolean mileagecheck(int x) {
        boolean b = false;
        if ((x >= 0) && (x <= 99999)) {
            b = true;
        }
        return b;
    }

    public void info() {
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.mileage);
    }


}


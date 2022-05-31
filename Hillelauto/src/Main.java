import Ex.Audi;
import Ex.UserQA;

public class Main {
    public static void main(String[] args) {
        UserQA userQA = new UserQA("Nastya", "Ryndia", "gjbgjkbn@meta.ua", "jrghkfgfj",
                "jrghkfgfj");
        Audi audi = new Audi( "Audi", "Q7", 5000.0);
        Auto2 auto2 = new Auto2("BMW", "X5", 8000.0, 300);
        auto2.maxSpeed ();

    }
}


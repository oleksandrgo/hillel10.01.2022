import java.util.*;

public class Hw15 {

    public static void main(String[] args){

        //1
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure1 = new Scanner(System.in);
        int i = inputFigure1.nextInt();
            //if
        if (i == 1) {
            System.out.println("Пользователь ввёл число : "+ i);
        } else if (i == 2) {
            System.out.println("Пользователь ввёл число : "+ i);
        } else if (i == 3) {
            System.out.println("Пользователь ввёл число : "+ i);
        } else {
            System.out.println("Пользователь ввёл число некорректное число");
        }
            //switch
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure2 = new Scanner(System.in);
        i = inputFigure2.nextInt();
        switch (i){
            case 1:
                System.out.println("Пользователь ввёл число : "+ i);
            case 2:
                System.out.println("Пользователь ввёл число : "+ i);
            case 3:
                System.out.println("Пользователь ввёл число : "+ i);
            default:
                System.out.println("Пользователь ввёл число некорректное число");
        }

        //2
        int k = 5;
        while (k != 0){
            System.out.println(k);
            k--;

        }
        //3
        for (int j = 1; j < 11 ;j++) {
            System.out.println("3 * "+j+" = "+(3*j));
        }
    }
}

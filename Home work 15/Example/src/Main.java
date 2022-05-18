import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /* 1.Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
            1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
            Написать двумя способами. If и switch.*/

        /*System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();

        // Первый способ
        if (i==1){
            System.out.println("Вы ввели число 1");
        } else if (i==2){
            System.out.println("Вы ввели число 2");
        }else if (i==3){
            System.out.println("Вы ввели число 3");
        }else{
            System.out.println("Пожалуйста,введите верное число");
        }*/

        //Второй способ
        /*switch (i){
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println("Пожалуйста,введите верное число");
        }*/

        // 2.Вывести на экран числа от 5 до 1 в обратном порядке
        /*for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }*/


        // 3.Вывести на экран таблицу умножения на 3
        /* for (int i = 1; i <=10 ; i++) {
                System.out.println(3 + " * " + i + " = " + 3 * i);
            }*/

        // 4.Найти среднее арефметическое суммы чисел от 1 до 100
        int sum = 0;
       for (int i = 1; i <= 100; i++){
           sum = sum + i;
       }
        System.out.println("Среднее арифметическое равно " + sum/100);
    }
}

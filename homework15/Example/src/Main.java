/* Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:   1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.   Написать двумя способами. If и switch.   */ import java.util.Scanner;public class Main { public Main() {}    public static void main(String[] args) {        System.out.println("Enter 1, 2 or 3: ");        Scanner inputFigure = new Scanner(System.in);        int i = inputFigure.nextInt();        System.out.println(i);        if ( i==1) {            System.out.println ("You enter 1");        }        else if (i==2) {            System.out.println ("You enter 2");        }        else if (i==3) {            System.out.println ("You enter 3");        }        else        System.out.println ("You entered wrong number");    }} import java.util.Scanner;public class Main { public Main() {}	public static void main(String[] args) {		System.out.println("Enter 1, 2 or 3: ");		Scanner inputFigure = new Scanner(System.in);		int i = inputFigure.nextInt();		System.out.println(i);		switch (i) {		case 1: System.out.println ("You enter 1"); break;		case 2: System.out.println ("You enter 2"); break;		case 3: System.out.println ("You enter 3"); break;		default: System.out.println("You entered wrong number");		}	}}*//*Необходимо вывести на экран числа от 5 до 1. На экране должно быть:      5 4 3 2 1 *//* public class Main { public Main() {}    public static void main(String[] args) {        for (int i=5; i>=1; i--) {            System.out.print (i + " ");        }    }}*//*Необходимо вывести на экран таблицу умножения на 3:        3*1=3        3*2=6        3*3=9        3*4=12        3*5=15        3*6=18        3*7=21        3*8=24        3*9=27        3*10=30        *//* public class Main { public Main() {}    public static void main(String[] args) {        for (int i = 1; i <= 10; i++)            System.out.println("3*" + i + "=" + 3 * i);    } }  *//* Найти среднее арефметическое суммы чисел от 1 до 100 *//*public class Main { public Main() {}    public static void main(String[] args) {        int a = 0; //переменная, в которую будет добавляться сумма чисел от 1 до 100        for (int i = 1; i <= 100; i++)            a += i;        System.out.println(a/100);    } } */
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        System.out.println ("Task 1 If/else");
        System.out.print ("Enter 1, 2 or 3: ");
        Scanner inputFigure = new Scanner (System.in);
        int num = inputFigure.nextInt ();
        if ( num==1) {
            System.out.println ("Enter 1");
        }
        else if (num==2) {
            System.out.println ("Enter 2");
        }
        else if (num==3) {
            System.out.println ("Enter 3");
        }
        else {
            System.out.println ("Not equal to 1, 2 or 3");
        }
        System.out.println ("\n");
        System.out.println ("Task 1 Switch");
        System.out.print ("Enter 1, 2 or 3: ");
        int num1 = inputFigure.nextInt ();
        switch (num1) {
            case 1:
                System.out.println("Enter 1");
                break;
            case 2:
                System.out.println("Enter 2");
                break;
            case 3:
                System.out.println("Enter 3");
                break;
            default:
                System.out.println("Not equal to 1, 2 or 3");
        }
        System.out.println ("\n");
        System.out.println ("Task 2");
        for (int i=5; i>=1; i--) {
            System.out.print (i + " ");
        }
        System.out.println ("\n");
        System.out.println ("Task 3");
        for (int i=1; i<=10; i++) {
            System.out.println ("3 * " + i + "=" + 3*i);
        }
        System.out.println ("\n");
        System.out.println ("Task 4");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum / 100);
    }
}
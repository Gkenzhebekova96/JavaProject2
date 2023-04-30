import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        // create instance (object) from scanner Class
        Scanner sc = new Scanner (System.in);
       // System.out.println( "Enter a number");

        //String name = sc.nextLine();
       // System.out.println("your name is : " + name);
        System.out.println("Enter a number one;");
        int number1 = sc.nextInt();
        System.out.println("Enter a number two");
        int number2 = sc.nextInt();
        int result = number1 + number2;
        System.out.println("result is; "+ result);
        // import scanner
        // create an object from Scanner class
        //ask user to enter


    }



}

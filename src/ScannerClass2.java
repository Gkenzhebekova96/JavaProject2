import java.util.Scanner;

public class ScannerClass2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a your name");
        String name =sc.nextLine();
        System.out.println("Enter your age");
        String age = sc.nextLine();
        String result = name + age;
        System.out.println(" Your name and age: " + result );

        Scanner sc2 = new Scanner (System.in);
        System.out.println("Enter a number");
        int number = sc2.nextInt();
        System.out.println( "Enter a number two");
        int numberTwo = sc2.nextInt();
        int result2 = number + numberTwo;
        System.out.println("Result is :" + result2);






    }



}

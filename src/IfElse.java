import java.util.Scanner;

public class IfElse {

       public static void main (String[] args) {

        if (5  > 3) {
            System.out.println("true");
        }
        if (10 == 10) {
            System.out.println("true");
        }
        int x = 30;
        int y = 20;
        if (x > y) {
            System.out.println(" X is larger!");
        }
        String password = " admin123";

        if (password == " admin123") {
            System.out.println(" Correct password");
        }

        // odd or even number
        //  5       6
        // formula; if divide a number by 2--> 0 it is even num
        //          if result is 1 it is odd num
        int num = 10;
        if (num % 2 == 0) {
            System.out.println(" This is an even number");

        } else{
            System.out.println(" this is a odd number");
        }
        if (true){
            // do this
        } else {
            //do this
        }
        // ask user to enter a number
           // write java code to find out if the number is even or no
          /* System.out.println(" enter the number");
           int number = sc.nextInt();
           if (number %2 == 0){
               System.out.println( number + " is even number!");
           } else {
               System.out.println(number + " is odd number!");
               }/*
           // ask user to enter yob
           // write java code to find out his / her age
           // if age is >65 print : ypu are retired
           //else print : you are not retried

           */
           Scanner sc = new Scanner(System.in);
           System.out.println(" Enter your years of birth date");
           int years = sc.nextInt();
           int age = 2023 -years;
           if ( age > 65){
               System.out.println(age + "You are retired");
           } else {
               System.out.println(" you are "+ age +" and you are not retired");
           }
           //
           int i =10;
           int j= 25;
           System.out.println(10+ ' ' +25);
           int i1 =10;
           int j1=12;
           i1+=++j1;
           System.out.println(i1);
           byte b1 = 5, b2=2;
           byte b = (byte) (b1 % b2);
           System.out.println(b);
           int i2 =5,j2=2;
           System.out.println(i2%j2);










        }
    }

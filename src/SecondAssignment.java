
import java.sql.SQLOutput;
import java.util.Scanner;

public class SecondAssignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* System.out.println(" Please enter an int number ");
        int num = sc.nextInt();
        char num8 = (char)num;
        System.out.println(num8);*/

        // 2 TASK
       /* int votingAge= 18;
        System.out.println(" Welcome to our website, to vote follow below steps: ");

        System.out.println("First step: Please enter your name");
        String name1 = sc.next();
        System.out.println("Second step: Please enter your age");
        int userAge= sc.nextInt();

        if (userAge >= votingAge){
            System.out.println(" Congratulation you old enough to vote!");
        } else{
            System.out.println("Sorry, you are not old enough to vote!");
        }*/
        // 3 TASK

       /* System.out.println(" Please enter first number "); // 2 ASSIGNMENT// TASK3
        int num1 = sc.nextInt();
        System.out.println(" Please enter second number ");
        int num2 = sc.nextInt();
        int sum= num1 + num2;
        int difference = num1-num2;
        double product = num1*num2;
        double division= num1 / num2;
        double modules = num1%num2;
        System.out.println(num1 +"+"+num2 + "="+ sum);
        System.out.println(num1+ "-"+num2 + "="+ difference);
        System.out.println(num1+ "*"+num2 + "="+ product);
        System.out.println(num1+ "/"+num2 + "="+ division);
        System.out.println(num1+ "%"+ num2+ "="+ modules);*/

        // TASK 4

        System.out.println(" PLease enter the number" );
        int numF =sc.nextInt();
        System.out.println(" Please enter the second number");
        int numS = sc.nextInt();
        double division1 = numF/numS;
        double modules1 = numF % numS;
        System.out.println("Division of "+numF +"/"+numS+"="+division1);
        System.out.println("Reminder of "+numF +"%"+numS+"="+modules1);




    }
}

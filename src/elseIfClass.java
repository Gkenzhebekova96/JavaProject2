import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class elseIfClass {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x > y) {
            System.out.println( x+ "is larger");
        } else if (x == y){
            System.out.println(" numbers are equal!");
        }
        else {
            System.out.println(y+ " is larger");

        }
        int number1 = 110;// 1 > 2 && 1 > 3
        int number2 = 70;// 2 > 1 && 2 > 3
        int number3 = 110;// 3 > 2 && 3 > 1

        if (number1 >number2 && number1 > number3){
            System.out.println(number1 + " is larger");
        }
        else if (number2 > number1 && number2 > number3){
            System.out.println(number2 + " is larger");
        }
        else if ( number3 > number2 && number3 >number1){
            System.out.println(number3 +" is larger");
        } else {
            System.out.println(" Numbers are equal!");

        }
        // ask user to enter a number between 1-7
        // and if number is:
        // 1print monday
        // 2 print Tuesday
        // 3 Wednesday
        // 4 thursday
        //... 7 print sunday
        // else : print invalid number
        Scanner cs = new Scanner(System.in);
       /* System.out.println(" Enter numbers between 1-7");
        int number = cs.nextInt();
        int monday= 1, tuesday = 2, wednesday = 3, thursday = 4, friday = 5, saturday = 6, sunday = 7;
        if (number == 1){
            System.out.println(monday+ " Monday");
        } else if (number == 2){
            System.out.println( tuesday + "Tuesday");}
        else if (number == 3){
            System.out.println(wednesday + " Wednesday");
        } else if (number== 4){
            System.out.println(thursday + " Thursday");
        } else if (number == 5 ){
            System.out.println(friday + " Friday");
        } else if (number == 6){
            System.out.println("Saturday");
        } else if (number== 7){
            System.out.println(" Sunday");
        } else {
            System.out.println(number + " Invalid number");
      }*/
        int evenCount= 0;
        int oddCount = 0;

       /* System.out.println(" Enter number one:");
        int num1 = cs.nextInt();
        System.out.println(" Enter number two:");
        int num2 = cs.nextInt();
        System.out.println(" Enter number three:");
        int num3 = cs.nextInt();
        System.out.println(" Enter number four:");
        int num4 = cs.nextInt();
        System.out.println(" Enter number five:");
        int num5 = cs.nextInt();

        if (num1 % 2 ==0 ){
            evenCount++;
        } else {
            oddCount++;
        }
        if (num2 % 2 ==0 ){
            evenCount++;
        } else {
            oddCount++;
        }
        if (num3 % 2 ==0 ){
            evenCount++;
        } else {
            oddCount++;
        }
        if (num4 % 2 ==0 ){
            evenCount++;
        } else {
            oddCount++;
        }
        if (num5 % 2 ==0 ){
            evenCount++;
        } else {
            oddCount++;
        }
        System.out.println(" Total even:" + evenCount);
        System.out.println("Total odd " + oddCount);
        boolean b = false;
        if (b){
            System.out.println(b);
        }else {
            System.out.println(b);
        }*/
         System.out.println(" PLease enter your weight:");
         double weight = cs.nextDouble();
         System.out.println(" Please enter your height");
         double height = cs.nextDouble();
         double BMI = weight / (height* height);
         System.out.println("your weight is "+ weight + " your height is " + height + " your BMI is " + BMI);
         if (BMI <18.5){
             System.out.println("Underweight");
         }
         else if (BMI > 18.5 && BMI< 25){
             System.out.println(" Normal weight");

         } else if (BMI <25 && BMI < 30){
             System.out.println(" Overweight");
         }
         else {
             System.out.println(" Obese weight");
         }










    }
}

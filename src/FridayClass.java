import java.util.Scanner;

public class FridayClass {

     public static void main(String[] args) {
          // create the sum of daily shopping
          //create var with diff data types and sum all items
          //byte,short,int,long,float,double.
          byte celery = 15;
          short dragonFruit = 25;
          int powder = 100;
          long Foundation = 175;
          float Kitkat = 2.5f;
          double chicken = 13.50;
          double TheSumOFGrocery = celery + dragonFruit + powder + Foundation + Kitkat;
          System.out.println(" Total Price......$ " + TheSumOFGrocery);


          Scanner sc = new Scanner(System.in);
/*
        System.out.println("Welcome to Costco shop ");
        //bread

        System.out.println( " the bread");
        byte breadPRice = sc.nextByte();

        //milk
        System.out.println("Milk.......");
        int MilkPrice = sc.nextInt();

        //egg
        System.out.println( "Egg.....");
        float EggPrice = sc.nextFloat();

        // juice
        System.out.println(" Juice.....");
        long JuicePrice = sc.nextLong();
        // cheese
        System.out.println("Cheese .....");
         double CheesePrice = sc.nextDouble();

         float TotalPrice1 = (float) (breadPRice + MilkPrice +EggPrice +JuicePrice+ CheesePrice);
        System.out.println( " The Total Price ...$" + TotalPrice1);

         */
        /*
        System.out.println("please enter temp F;");
        float userInput = sc.nextFloat();
        float celsius = (float) ( (5* (userInput - 32.0)) /9);
        System.out.println("F is" + celsius + "C"); */
          //write a java program that calculates th age of the user
        /*
        System.out.println(" Please enter year you were born");
        int year = sc.nextInt();
        System.out.println("Please enter the current year");
        int currentYear = sc.nextInt();
        int age = currentYear - year;
        System.out.println(" Your age " + age + " years old");
                  */
          //write java program that convert inches to meters
          // formula: meter = inch + 0.0254
        /*
        System.out.println(" Please enter inch ");
        double inches = sc.nextDouble();
        double meter = inches *0.0254;
        System.out.println(inches + " is equal to meter " + meter);

         */
          //write java program that asks user 2 numbers (int,double)
          // find the sum, different product ( -,+,*/ %) and return with the  message
        /*


        System.out.println( "Please enter the number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number 2:");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        double difference = num1- num2;
        double product = num1 * num2;
        double division  = num1 /num2;
        int reminder = (int) (num1 % num2);
        System.out.println("  The sum is " + sum);
        System.out.println("  The difference is " + difference );
        System.out.println("  The product is " + product);
        System.out.println("  The division is " + division);
        System.out.println("  The reminder is " + reminder);

         */
          // write java program that takes input from user in minutes
          // and convert into years and dates
          // formula:minInAYear = 60*24*365
        /*
        System.out.println("Please enter number of minutes");
        int minutes = sc.nextInt();
        int minInAYear = 60*24*365;
        int year = minutes / minInAYear;
        System.out.println(minutes + " is approx equivalent " + year +" year:");

         */
          //calculate BMI
          // formula BMI = kg/height
 /*       System.out.println(" pLease enter your weight");
        double weight = sc.nextDouble();
        System.out.println(" please enter the height");
        double height = sc.nextDouble();
        double BMI = weight/ (height*height);
        System.out.println( " Your weight is "+ weight + " your height is " + height +" Your BMI is " + BMI);

  */
          // break 5 digits int number into separate numbers;
          // 12345 should converted into 1,2,3,4,5,




          //write java program that asks user enter 2 number
          // and check whether entered number is
          //
          //even or odd
 /*         System.out.println( "Please enter any 2 digit int number;");
          int num = sc.nextInt();
          int remainder = num %2;
          boolean evenNumber = remainder == 0; // even number 0,2,4,6,8,10
          boolean oddNumber =remainder == 1; // odd number 1,3,5,7,9
          System.out.println( " Is " + num +" even number? "+ evenNumber);
          System.out.println(" Is " + num + " odd number " + oddNumber);
*/
          int a1 = 78;
          int a2 = 98;
          boolean b1 = a1 == a2;
          System.out.println(b1);

          boolean b2 = a1<a2;
          System.out.println(b2);
          boolean b3 = a1>a2;
          System.out.println(b3);

          



     }
}




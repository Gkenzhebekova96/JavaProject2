import java.util.Scanner;

public class April4Practice {
    public static void main(String[] args) {
        // compose an algorithm that suggest what to wear based on outside temperature

        Scanner ss = new Scanner(System.in);

        // System.out.println(" What is the temperature outside today?");
        //  float temp = ss.nextFloat();
        // above 30 > go to beach
        // if temp between 25 an 30> wear tShirt
        // if temp between 15 and 20 > wear a jacket
        // if below 15 >wear coat
        /*if (temp >30){
            System.out.println(" go to the beach and enjoy");
        }else if ( temp >= 20 && temp <=30){
            System.out.println(" wear tShirt");

        }
        else if (temp>= 15 && temp <=20){
            System.out.println(" wear jacket");
        }
        else if (temp <15) {
            System.out.println(" Wear coat2");
        }*/
        /*System.out.print( " Enter your year of birth ");
        int year = ss.nextInt();
        if ( year >=1946 && year<= 1964){
            System.out.println(" You are from baby Boomers generation ");
        } else if (year >=1965 && year <= 1980){
            System.out.println(" X generation");
        } else if ( year >= 1981 && year >= 1996){
            System.out.println(" Dear value user you are from Millenials generation");
        }
            else if (year >= 1997 && year <= 2010){
            System.out.println(" you are from z generation");
            } else if (year >=2010) {
            System.out.println(" you are Alpha");
        } else {
                System.out.println(" Incorrect value ");
            }*/
        // write a java code that checks if customer can buy alcohol
        // customer should be 21 or older
        /*System.out.print(" what year are you born?");
            int year1 = ss.nextInt();
            int age = 2022 - year1;
             if (age >= 21 && age <= 100){
                 System.out.println(" Customer eligible to buy alcohol");
                 } else if ( age < 21 && age > 0){
                     System.out.println(" customer not eligible to buy alcohol");
             } else {
        System.out.println(" Invalid input");
    }*/
        // write  a java code that generates the exam grade based on exam score
        // grade A bt 90-100
        //grade b bt 89-80
        //grade c bt 79 - 70
        //grade d bt 69 -60
        // failed <60
        //
        /*System.out.println(" what is your exam score");
        float score= ss.nextFloat();
        if ( score >= 90 && score <= 100 ){
            System.out.println(" Our congratulation you grade is A ");
        } else if ( score >= 80 && score <=89){
            System.out.println(" Our congratulation you grade is B");
        } else if (score >= 70 && score <= 79){
            System.out.println(" Our congratulation you grade is C");
        } else  if (score >= 60 && score <= 69){
            System.out.println(" grade D");
        } else if (score < 60) {
            System.out.println("You are failed ");
        } else {
            System.out.println("invalid input");
        }*/
        /*System.out.println(" Enter your mid tern exam score");
        float midTernScore = ss.nextFloat();
        System.out.println(" Please enter final exam score");
        float finalExamScore = ss.nextFloat();
        float averageScore =(float) ((midTernScore * 0.5 )+ (finalExamScore * 0.5));

        if ( averageScore >= 90 && averageScore <= 100 ){
            System.out.println(" Our congratulation you grade is A ");
        } else if ( averageScore >= 80 && averageScore <=89){
            System.out.println("Our congratulation you grade is B");
        } else if (averageScore >= 70 && averageScore <= 79){
            System.out.println(" Our congratulation you grade is C");
        } else  if (averageScore >= 60 && averageScore <= 69){
            System.out.println(" grade D");
        } else if (averageScore < 60) {
            System.out.println("You are failed ");
        } else {
            System.out.println("invalid input");}*/
        //NESTED IF STATEMENT
        // check if the user entered number if positive and even number
       /* System.out.println(" Please enter any number");
        int i = ss.nextInt();
        if ( i > 0){
            if (i %2 ==0){
                System.out.println(i+ " is a positive and even number");
            } else {
                System.out.println(i+ " is a positive and odd number");
            }
        }   else if (i<0)
         if (i %2 == 0){
                System.out.println(i+ " is a negative and even number");
            } else {
                System.out.println(i + " is negative and odd number");
            } else {
            System.out.println(" invalid input");

            }*/
        // take three numbers from the user and print the greatest number
      /*
            if (num1>num3) {
                System.out.println(num1 + " is the largest");
            }
        }else if (num2 > num1){
            if (num2>num3){
                System.out.println(num2+ " is the largest ");
            }
        }else if (num3>num1){
            if (num3>num2){
                System.out.println(num3 + " is largest");
            }
        } else if (num1== num2){
            if (num1==num3){
                System.out.println(" all number are the same");
            }
            else if (num2 <num3){
                System.out.println(num3 +"is the smallest number");
            }*/
        System.out.println(" please enter 1 number");
        int num1 = ss.nextInt();

        System.out.println(" please enter 2 number");
        int num2 = ss.nextInt();

         if (num1>= num2){
             if (num1> num2){
                 System.out.println(num1+"is the largest");
             }else if (num1== num2){
                 System.out.println(" both numbers are equal");
             }
         }else if (num2 >num1){
             System.out.println(num2+"is the largest");
         }







    }
        }
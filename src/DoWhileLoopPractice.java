import java.util.Locale;
import java.util.Scanner;

public class DoWhileLoopPractice {
    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in);
       /* int i =1;
        while (i<=3) {
            System.out.println(" Please enter the number");
            int number = cc.nextInt();
            if (number >= 5 && number <= 10) {
                System.out.println(" you got it");
                break;
            } else {
                i++;
                System.out.println(" Try again");
            }
            if (i == 4) {
                System.out.println("Game over");
            }*/

          /*  int p = 1;
            while (p <= 3) {
                System.out.println("Please enter the number");
                int num2 = cc.nextInt();

            if (num2 >= 2 && num2 <= 20) {
                System.out.println("you got it");
                break;
            } else {
                System.out.println("Try again");
            }
        } if (p ==4){
                System.out.println(" Game is over");
            }*/

            // practice
            int name = 0;
            do {
                System.out.println(name);
                System.out.println("Guljamal");
                name++;
            }while (name <21);

            // FOR LOOP


        for (int r=0; r<5;r++){
            System.out.println(r+ "for lop is executed");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println(" Please enter your name");
        String userInput = sc.nextLine();

      //  for (int s=0;s < userInput.length();s++){
       //     System.out.println(userInput.charAt(s));
       // }
        // write a java program that takes users name for loop print out each letter of the name but turn it to upper case

        for (int h=0; h<userInput.length(); h++){
            char x = userInput.charAt(h);
            String y = String.valueOf(x).toUpperCase(Locale.ROOT);
            System.out.println(y);
        }













    }
}

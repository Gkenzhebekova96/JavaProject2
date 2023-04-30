import java.util.Scanner;

public class NestedIfElseReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create 2 strings variables for your username and password
        // write a program that asks from the user to enter the username
        // if username matches then ask for password , if password matches too then print
        // if username is true but password is not true , print wrong password
        // is username doesnt match , print " invalid username
        /* String userName = "Admin";
        String password = "admin123";

        System.out.println(" Enter username");
        String usernameFromUser = sc.nextLine();
        if (usernameFromUser.equals(userName)){

            System.out.println(" Enter your password");
            String passwordFromUser = sc.nextLine();

          if (passwordFromUser.equals(password)){

             System.out.println(" login successful!");
         } else {
             System.out.println(" wrong password");
         }

        } else{
            System.out.println("Invalid username");
        }*/

        // ask user to enter a number between 1-4
        // if number is not between 1-4 print invalid num
        // if number is between num 1-4 check if it is 1 : Print spring
        // if num 2 : print Summer
        // if its 3 : print Autumn
        // if it 4 : print winter
        System.out.println(" Please enter a number between 1-4");
        int num = sc.nextInt();
        if ( num >0 && num <= 4){
            if (num==1){
                System.out.println(" Spring");
            } else if (num==2){
                System.out.println(" summer");
            } else if (num ==3){
                System.out.println(" autumn");
            }else if (num==4){
                System.out.println(" winter");
            }

        } else {
            System.out.println(" invalid number!");
        }







    }
}

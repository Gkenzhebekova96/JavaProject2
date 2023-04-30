import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <=10);

        i =1;
        do {
            System.out.println(" Gul");
            i++;
        }while (i<=10);

        // ask user to enter the number
        // print x number your name
        // ex; if user enter 2 print 2 times
        // if 10 ; print 10 times
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter the number");
        /* int h = sc.nextInt()
        int start =1;
        while (start <=h ){
            System.out.println(start+" :Gul");
            start++;
        }
        do {
            System.out.println(start+ " :gul");
            start++;
        }while (start<+h);*/
        i=1;
        while (i<=3) {
            System.out.println("Enter a number:");
            int number = sc.nextInt();
            if (number>=5 && number <=10){
                System.out.println("You got it");
                break;
            }else {
                i ++;
                System.out.println("try again");
              }
           } if (i==4){
            System.out.println(" Game over");
          }
        // new

        int b=5;
        do {
            System.out.println(b);
            System.out.println(" Do While loop is being executed");
            b++;
        } while (b<7);








    }
}

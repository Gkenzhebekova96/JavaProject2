import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        // switch
        int number =1;
        switch (number){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3 :
                System.out.println(3);
                break;
            default:
                System.out.printf("non was found!");
        }

        // ask user to enter a char
        // write a java code which switch statement  to find out if the char is vowel and cons
        // vowels Aa Ee Uu Oo iI
        Scanner sc = new Scanner(System.in);
       /* System.out.printf("Please enter a char");
        char c = sc.next().charAt(0);
        switch (c){
            case 'a' :
                case 'A':
                    case 'b':
                        case 'e':
                            case 'U':
                                case 'u':
                                    case 'O':
                                        case 'o':
                                            case 'I':
                                                case 'i':
                System.out.println(c+"is a vowel from switch");
                break;
                default:
                System.out.println(c+"is a constant ");

        }
        if (c=='a'|| c=='E'|| c== 'e'|| c== 'O'|| c== 'o'||c== 'I'||c== 'i'||c=='A'){
            System.out.println(c+"is a vowel from if");
        }else{
            System.out.println(c+ " is a constant");*/

        // ask user to enter a number btw 1-7
        // write java code (switch ) t print
            // 1 - monday
            // 2 - tuesday
            //3 wedsnday
            // /////print invalid number
      /*  System.out.println("Please enter the number btw 1-7");
        int t = sc.nextInt();
        switch (t){
            case 1:
                System.out.println(t +"Monday");
                break;
            case 2:
                System.out.println(t+ "Tuesday");
                break;
            case 3 :
                System.out.println(t+" Wendsday");
                break;
            case 4:
                System.out.println(t+ " Thursday");
                break;
            case 5:
                System.out.println(t+ " Friday Juma Mubarak for everyone");
                break;
            case 6 :
                System.out.println(t+"Saturday");
                break;
            case 7:
                System.out.println(t+" happy Sunday");
                break;
            default:
                System.out.println(" sorry i don't understand this number");
        }*/
        // ask user to enter num btw 1-12
        // if num 12 1,2,> print winter
        // if num 3,4,5,> print spring
        // if num 6,7,8, > print Summer
        // if num 9,10,11 > print autumn
        System.out.println(" Please enter a number btw 1-12");
        int num = sc.nextInt();
         switch (num){
             case 12, 1, 2:
                 System.out.println(num+ " Welcome to winter");
                 break;
             case 3,4,5:
                 System.out.println(num+ " Welcome to spring");
                 break;
             case 6,7,8:
                 System.out.println(num + " Welcome to Summer");
                 break;
             case 9,10,11:
                 System.out.println(num + " Welcome to Autumn");
                 break;
             default:
                 System.out.println(num+ " Invalid input");
         }
         ////// practice
        System.out.println(" Please enter a Grade");
         char letter = sc.next().charAt(0);
         switch (letter){
             case 'a','A':
                 System.out.println( letter+ "Excellent!");break;
             case 'b','B':
                 System.out.println(letter+ " Great");break;
             case 'c','C':
                 System.out.println(letter+ " Okay");break;
             case 'd','D':
                 System.out.println(letter + " You can do better!");break;
             case 'f','F':
                 System.out.println(letter +" Something needs to change ");break;
             default:
                 System.out.println(" Incorrect character");


         }




    }



}

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        //1 way of creating a string object
/*String word1 = "Hello beautiful";
// 2 way of creating a string obj by using new keyword
        String word2 = new String("world!");
        //concatenation in practice
        String obj = word1 + " " + word2;
        int l = obj.length();
        System.out.println(l);
        System.out.println(word1.length());
        System.out.println(word2.length());
        // create 2 string obj
        // concatenate those 2 object
        // find the length of the 2 string obj
         String k = "My name";
         String k2 = new String(" is Guljamal");
         String k3 = k + k2;
         int g = k3.length();
        System.out.println(g);
        System.out.println(k.length());
        System.out.println(k2.length());
        String obj1 = "Tech", obj2 ="Nova",obj3 = obj1 + obj2;
        int i3 = obj1.length(),i4 = obj2.length(), i5 = obj3.length();
        System.out.println(i3 + "," + i4+","+ i5);
        System.out.println(obj1.charAt(1));
        System.out.println(obj3.charAt(7));
        // create 1 string obj
        // use length and charAt methods
        String q = " Java is fan";
        int q1 = q.length();
        System.out.println(q1);
        System.out.println(q.charAt(4));
        System.out.println(q.charAt(2));
        String key = "Supercalifragilisticexpialidocious";
        int numOfCharacter= key.length();
        int indexOfLastChar = key.length()-1;
        System.out.println(" Number of character"+ numOfCharacter);
        System.out.println("Index of of char" + indexOfLastChar);
        System.out.println(key.charAt(indexOfLastChar));
        String kiy = " Kenzhebekova Guljamal";
        int surname = kiy.length();
        int surname2 = kiy.length()-1;
            System.out.println(" Number of my surname " + surname);
        System.out.println("Last index of my surname " + surname2);
        System.out.println(kiy.charAt(21));*/

        // using charAt() String methods, write a java program that takes input from the user
            // and check if first and last chars are equal
           Scanner sc = new Scanner(System.in);

            /*System.out.println(" Please enter your name:");
            String userName = sc.nextLine();

            String fChar = String.valueOf(userName.charAt(0));
            String Lchar =String.valueOf(userName.charAt(userName.length()-1));

            if(fChar.equals(Lchar)){
                    System.out.println(true);
            }else if (!fChar.equals(Lchar)){
                    System.out.println(" false");
            } else {
                    System.out.println(" Invalid input");

            }*/
            // write java program that get input from 3 users and checks using EQUALS()method
            // whether there are namesakes among 3 users
            /*System.out.println(" Please enter your name ");
            String name1= sc.nextLine();
            System.out.println(" Please enter your name");
            String name2=sc.nextLine();
            System.out.println("Please enter your name");
            String name3= sc.nextLine();

             if (name1.equals(name2)){
                     System.out.println(name1 +" and "+  name2+ " are namesakes");
             } else if (name2.equals(name3)){
                     System.out.println(name2+" and "+name3 +" are namesakes");
             } else if (name1.equals(name3)){
                     System.out.println(name1+" and "+name3 +" are namesakes");
             } else if (!name1.equals(name2)&& !name2.equals(name3)&& !name1.equals(name3)){
                     System.out.println(" There are no namesakes");
             }
             else {
                     System.out.println(" invalid input");
             } */
            // practice
           /* String str1 = "Kenzhebekova Guljamal";
            System.out.println(str1 + " has "+ str1.length()+ " character ");
            System.out.println(str1.charAt(0) + " is the first character");
            System.out.println(str1.charAt(6) +" is the 5 th index ");
            System.out.println(str1.charAt(str1.length()-2) + " is the last letter" );
            // CharAt() method takes 1 parameter that is index and returns char
        String str2 = "JAva jAVa";
        char fLetter = str2.charAt(0);
        String fLetterStr = String.valueOf(str2.charAt(0));
        String Letter2 = String.valueOf(str2.charAt(0));
        String Letter4 = String.valueOf(str2.charAt(5));
        System.out.println(Letter2.equalsIgnoreCase(Letter4)); // equalsIgnoreCase () method
        System.out.println(str2.length());

        // isEmpty() method
      /*  System.out.println(str2.isEmpty()); // false
        String s1 = " ";
        String s2 = "";
        System.out.println(s1.isEmpty()); // false
        System.out.println(s2.isEmpty()); // true
      */


        // contains () method

      /*  String x = "Today is cold";
        String y = "Today is cold very much";
        System.out.println(x.contains(y)); // true
        System.out.println(y.contains(x)); // true
        String fullName = "Brad Pitt";
        String firstName= "Brad";
     */

        // write java program that takes user's name
        // and checks weather username contains letter
     /*   System.out.println(" Please enter your name");
        String name = sc.nextLine();
        System.out.println(name.contains("a"));
     */

        // write java program by creating 2 strings that hols a different number of capital cities
        // and checks with if else statement which string contains Paris
        // String object , if else statement , contains(), equals(), equalsIgnoreCase();

     /*   System.out.println(" Please enter any name of city");
        String city1 = sc.nextLine();
        System.out.println(" Please enter any name of city");
        String city2 = sc.nextLine();
        System.out.println(" Please enter any name of city");
        String city3 = sc.nextLine();
        System.out.println(" Please enter any name of city");
        String city4 = sc.nextLine();
        String cities= city1 +","+ city2+","+ city3+ "," +city4;
        String cityName = "Paris";
        if(cities.contains(cityName)){
            System.out.println(cities + " contains Paris");
        } else {
            System.out.println(" does not contain Paris");
        }
      */

        //practice2
       /* String city= " A, B ,U, D, A, B, I";
        String cityN = " P a r i s";
        if (city.contains("I")){
            System.out.println(city +" Contains  i");
        } else {
            System.out.println(" does not contain Paris");
        }
        // different types ofo fruits - apple, pear, grande
        //
        System.out.println(" Please enter the fruit name which you are looking");
        String usersFruit= sc.nextLine();
        String listOfFruits = "apple,pear,grape";
        if (listOfFruits.contains(usersFruit)){
            System.out.println(usersFruit + " is available in our shop");
        } else {
            System.out.println( " Dear customer we do apology we do not have a " + usersFruit + " in our shop");

        }*/
        // startsWith() method
        /*String x = "Rome is a capital of Italy";
        System.out.println(x.startsWith("R"));
        System.out.println(x.startsWith("r"));
        System.out.println(x.startsWith("Ro"));
        System.out.println(x.startsWith("Rome is"));
        System.out.println(x.startsWith(" capital"));
        */
        // endsWith() method
       /* System.out.println(x.endsWith("y"));// true
        System.out.println(x.endsWith("Y"));//false
        System.out.println(x.endsWith("Rome"));//false
        System.out.println(x.endsWith("aly")); // true
        System.out.println(x.endsWith("Italy ")); // false
        */
       /* // toLowerCase() method
        System.out.println(x.toLowerCase(Locale.ROOT));
        // toUpperCase()method
        System.out.println(x.toUpperCase(Locale.ROOT));*/
        //practice
       /* String shop1= " apple, pear, orange,onion,tomato,potato,celery ";
        String shop2 = "strawberry, pear,watermelon,papaya,garlic,cucumber,shallot";

        System.out.println("Dear customer what fruits would you like to buy?  ");
        String userEnterF= sc.nextLine();

        System.out.println("Dear customer what vegetable would you like to buy?  ");
        String userEnterV = sc.nextLine();

        // user's input fruit modification
        String fruitM= userEnterF.toLowerCase(Locale.ROOT);
        // user's input veggie modification
        String veggieM= userEnterV.toLowerCase(Locale.ROOT);
        if (shop1.contains(fruitM) && shop1.contains(veggieM)){
            System.out.println(" You can buy " + userEnterF+ " and"+ userEnterV+" at this shop 1");
        }else if (shop2.contains(fruitM)&& shop2.contains(veggieM)){
            System.out.println(" You can buy " + userEnterF+ " and"+ userEnterV+" at this shop 2");
        }else if (shop1.contains(fruitM)&& shop2.contains(veggieM)){
            System.out.println(" You can buy " + userEnterF+ " at shop 1 and "+ userEnterV+" at this shop2");
        } else if (shop1.contains(veggieM)&& shop2.contains(fruitM)){
            System.out.println(" You can buy " + userEnterF+ " at shop 2 and "+ userEnterV+" at this shop1");
        } else if (shop1.contains(fruitM)|| shop2.contains(fruitM)&& !shop1.contains(veggieM)|| !shop2.contains(veggieM)){
            System.out.println(" Shop1 and shop2 has "+userEnterF + " but not "+ userEnterV);
        } else {
            System.out.println("Unfortunately there is no such fruit or veggie at shop1 and shop2");
        }*/



         //toUpperCase() practice
        /*String midWest = "IL,IA,MI,WI,SD,OH,IN,ND,";
        String easterStates="NH,MA,NC,SC,FL,DE";
        System.out.println(" Please enter the state:");
        String userInput = sc.nextLine();
        String userInputM = userInput.toUpperCase(Locale.ROOT);
        if (midWest.contains(userInputM)) {
            System.out.println(" USer lives in mis West");
        } else if (easterStates.contains(easterStates)){
            System.out.println(" User lives in Ester state");

            }
        else {
            System.out.println(" invalid input");
        }

        // indexOf() method
        String str= "TechNova";
        System.out.println(str.indexOf('T'));// 0
        System.out.println(str.indexOf('t'));//-1
        System.out.println(str.indexOf('h'));//3
        System.out.println(str.indexOf("ch"));//2
        System.out.println(str.indexOf("Na")); //-1


        // lastIndexOF();

 /*       String str3 = "Java is fun";
        System.out.println(str3.indexOf("a"));//1
        System.out.println(str3.lastIndexOf("a"));//3
        String str4= "aaa AA aa";
        System.out.println(str4.indexOf("A"));//4
        System.out.println(str4.lastIndexOf("A"));//5
        System.out.println(str4.indexOf("a"));//0
        System.out.println(str4.lastIndexOf("a"));//8*/

        // replace();
        // update the given "Google" to "Gfoogfle"
       /* String original= " google";
        System.out.println(original.replace("e", "gf"));// gfoogfle

        String x ="A B C D E F G";
        System.out.println(x.replace(" ", ""));


       /* //"Today is cold"-> "Today java si java cold"
        String x1 = "Today is cold";
        System.out.println(x1.replace(" ", " java "));*/
       /* String lorem="Lorem Ipsum is simply";
        System.out.println(lorem.replace("m", ""));*/

        String out = "<<>>";
        String word = "Hello";
        String c1 = out.substring(0,2);
        String c2 = out.substring(2,4);
        System.out.println(c1+ word +c2);

        String extraEnd ="hello";
        extraEnd.substring(2,4);

        //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        String name = "Gul";
        String str1 = " Hello" + name+"!";
        System.out.println(str1);
         int a =23, b=30;
         if (a>20 && b>25){
             System.out.print("1");
         }if (a>30 && b<35){
            System.out.println("2");
        } else {
            System.out.println("3");
        }

         ////////////
        int i=5, j = 8, k=0;
         if (i>j && i++<10 && (k+=i +j)>10){
             System.out.println("true");
         }
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        int l=5;
        int r = ++l +2;
        System.out.println(r +l);

        String d1 = "   Java   ";
        String d2 = "    Java is fun";
        System.out.println(d1.trim());
        System.out.println(d2.trim());
        System.out.println("Hello everyone i love \"everyone\"here");
        //
        String str = "HEllo";
       String s = str.substring(str.length()-2, str.length());
        System.out.println(s+s+s);
        //
        String java= "i love java";
        String bb = java.substring(0,1);
        System.out.println(bb);
        String bb1=java.substring(2,6);
        System.out.println(bb1);
        String bb2= java.substring(7,java.length());// substring
        System.out.println(bb2);
        String bb3 = java.substring(7,11);
        System.out.println(bb3);

        //indexOf/ lastIndexOf
         String f= "Gulzhlamal";
        System.out.println(f.lastIndexOf("hl"));












































    }


}

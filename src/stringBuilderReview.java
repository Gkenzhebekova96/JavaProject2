import java.util.Locale;
import java.util.Scanner;

public class stringBuilderReview {
    public static void main(String[] args) {
        String str2 = new String( " hello world");
        StringBuilder str = new StringBuilder("Hello world");

        // append method
        System.out.println(str+" 2023");
        System.out.println(str.append(" 2023"));

        /*// REVERSE METHODS
        System.out.println(str.reverse());
        //
        String text = "hello";
        StringBuilder newText = new StringBuilder(text);
        //newText.reverse();
        String rText =newText.reverse().toString();
        System.out.println(text);
        System.out.println(newText);
        System.out.println(rText);
        // practice
        String a = "guljamal";
        StringBuilder a1 = new StringBuilder(a);
        String a3 = a1.reverse().toString();
        a1.reverse();
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a3);
        // ask user to enter a text
        // print reverse()& and make all text an uppercase text
        //ex: Hello-> OLLEH
        /*Scanner ss = new Scanner(System.in);
        System.out.println(" Please enter the tex");
        String uEnter=ss.nextLine();
        StringBuilder uText=new StringBuilder(uEnter);
        uEnter= uText.reverse().toString().toUpperCase();
        System.out.println(uEnter);*/

        // DELETE METHODS
        StringBuilder str3  = new StringBuilder("Java is fan!");
        //str3.deleteCharAt(11);
        //str3.deleteCharAt(0);
       // System.out.println(str3);
        System.out.println(str3.delete(5,7));
        // INSERT METHODS (to add character)
        System.out.println(str3.insert(5,"really"));
        System.out.println(str3.insert(0,"#"));














    }
}

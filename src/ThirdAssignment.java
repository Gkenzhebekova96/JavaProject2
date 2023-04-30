import java.util.Scanner;

public class ThirdAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //TASK 1;

      /*  System.out.println(" Please enter you full name");
        String fullName= sc.next();
        String fChar= String.valueOf(fullName.charAt(4));
        String lChar= String.valueOf(fullName.charAt(10));
        System.out.println(" The character at position 4 is "+" < " + fChar+" > ");
        System.out.println(" The character at position 10 is "+" < "+ lChar+" > ");*/

        // TASK 2;
       /* String word1 = " Today is my day off";
         String word2 = " today is my day off";

         if (word1.equals(word2)){
             System.out.println(word1 +" > and <"+ word2 +" > are equal");
         } else {
             System.out.println(word1 +" > and <"+ word2 +" >are not equal");
         }*/
         //TASK 3
        /*System.out.println(" Please enter your name with small letters:");
         String smallName=sc.next();
        System.out.println(" Please enter your name with capital letters:");
        String capLetters= sc.next();
        if (smallName.equalsIgnoreCase(capLetters)){
            System.out.println(smallName + " and "+ capLetters+ " are equal ");
        }else {
            System.out.println(smallName + " and "+ capLetters+" are ot equal");
        }*/

         // TASK4 // Write a Java program to concatenate a given string to the end of another string.
        /*String fWord = "Enjoy every moment";
        String sWord=" of your life !";
        System.out.println(fWord +" "+sWord);*/

        // TASK 5 Write a Java program to test if a given string contains the specified sequence of char values.
        String word3= "Ramadan Kareem!";
        System.out.println(word3.contains("ram"));
        System.out.println(word3.contains("m"));
        System.out.println(word3.contains("ko"));
        System.out.println(word3.contains("Ram"));

        // TASK 6 Write a Java program to check whether two String objects contain the same data.
        String t = "Aleksandr Pushkin";
        String t2= " Chyngyz Aitmatov";

        boolean equal= t.equals(t2);
        boolean equal2 = t.equals(t);

        System.out.println("\"" +t + "\" equals\""+ t2 +"\"? "+ equal);
        System.out.println("\"" + t + "\" equals \""+ t + "\"? " + equal2);

        // TASK 7 7. Write a Java program to get the index of all the characters of the alphabet from: String : "The quick brown fox jumps over the lazy dog."
        String w = "The quick brown fox jumps over the lazy dog";
        System.out.println(w.length());

        String q = " Java is fan";
        int q1 = q.length();
        System.out.println(q1);
        System.out.println(q.charAt(4));
        System.out.println(q.charAt(2));












    }
}

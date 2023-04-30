public class StringMethodsWithKamol  {
    public static void main(String[] args) {
        // CharAt()
        String text = "Monday";// 0M,
        System.out.println(text.charAt(3));
        System.out.println(text.charAt(4));
        //equals()
        String s1 = "1Welcome";
        String s2 = "Welcome";
        System.out.println(s1.equals(s2));

        // substring()
        String text2 = "Monday";
        System.out.println(text2.substring(3)); //day
         String tex3 = "Guljamal";
        System.out.println(tex3.substring(3));// jamal
        String text4= "Hello Monday";
        System.out.println(text4.substring(6));// monday
        System.out.println(text4.substring(0,6));
        System.out.println(text4.substring(9,12));

        // trim()

        String text9= "   Hello & Welcome to New Java Class   !   ";
        System.out.println(text9);


        // compare ()
        String sr = "abc";
        String sr1 = "xyz";
        System.out.println(sr.compareTo(sr1));

        //
        //Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
        String str ="Hello";// "lololo"
        String n2= str.substring(3,5);
        System.out.println(n2+n2+n2);












    }
}

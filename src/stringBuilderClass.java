public class stringBuilderClass {
    public static void main(String[] args) {
        // String classes
        String str =" hello";
        String str2 = new String("text");

        //StringBuilder classes
        StringBuilder str3 = new StringBuilder("Text");
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str.concat("new text added"));
        System.out.println(str);
        str3.append("Hello");
        System.out.println(str3 + "New life is starting");
        System.out.println(str3);

        StringBuilder ss = new StringBuilder("Tech Nova");
        System.out.println(ss);

        // StringBuilder methods
        // append()
        System.out.println(ss.append("'s Java class"));
        System.out.println(ss + "'s Java Class");

        // reverse()
        //System.out.println(ss.reverse());// mixing letters
         // delete
        System.out.println(ss.deleteCharAt(0)); // deleteCharAt
        System.out.println(ss.delete(0,6));// delete

        // insert
        StringBuilder ss1 = new StringBuilder("Good morning");
        System.out.println(ss1.insert(4,"and hello "));
        // practice

        StringBuilder name = new StringBuilder("Java is");
        name.append(" fun.");
        System.out.println(name);
        name.deleteCharAt(0);
        System.out.println(name);

        StringBuilder lastName = new StringBuilder("Kenzhebekova");
        lastName.deleteCharAt(0);
        lastName.delete(0,5);
        System.out.println(lastName);
        // practice
        StringBuilder mom= new StringBuilder("Gulzada Akunove");
        mom.insert(7," and her last name is ");
        System.out.println(mom);







    }
}

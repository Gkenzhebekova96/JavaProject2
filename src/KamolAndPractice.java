public class KamolAndPractice {
    public static void main(String[] args) {

        //Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
        String str= "Hello";
        System.out.println(str.substring(1,str.length()-1));


        // practice
        String key = "Supercalifragilisticexpialidocious";
        int numOfCharacter= key.length();
        int indexOfLastChar = key.length()-1;
        System.out.println(" Number of character"+ numOfCharacter);
        System.out.println("Index of of char" + indexOfLastChar);
        System.out.println(key.charAt(indexOfLastChar));





    }
}

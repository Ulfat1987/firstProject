package day07practice02;

public class Q04 {
    public static void main(String[] args) {
// Type a code to find the number of punctuation marks used in a String.
    String str = "Wow!... Ali is 13 years old, and he is a university student.";

    int totalNum0fChar = str.length();
        System.out.println(totalNum0fChar);
        String strWithoutPunct = str.replaceAll("\\p{Punct}","");
 //Regular expression for All punctuations can be typed "\\p"==>By replaceAll() Punctuation will be replaced with nothing
 //So,we can find the number of characters in the statement.
        System.out.println(strWithoutPunct.length());
        System.out.println(totalNum0fChar - strWithoutPunct.length());
        //easier way
        System.out.println(str.replaceAll("\\P{Punct}","").length());








    }
}

package day25exceptions;

public class E03 {

    public static void main(String[] args) {
        int r1 = getNum0fChars("Tom Hanks");
        System.out.println(r1);//9

        int r2 = getNum0fChars("");
        System.out.println(r2);

        int r3 = getNum0fChars(null);//NullPointerException:If you use "length()" method with "null"
                                         //you will get NullPointerException
        System.out.println(r3);
    }
    //Create a method to find the number of characters in a String
    public static int getNum0fChars(String str){
        int num0fChar = 0;
        try {
            num0fChar = str.length();
        }catch(NullPointerException e){
            System.out.println("A problem occurred in using length");
        }
        return num0fChar;
    }
}

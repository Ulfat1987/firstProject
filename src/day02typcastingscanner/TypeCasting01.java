package day02typcastingscanner;
public class TypeCasting01 {
     /*
     Type casting; converting a number of primitive data type to another number primitive data type.For ex;
     while using data type convert as 'byte' convert to 'int'. Normally it is byte, but it will behave like
     byte. (You can't change char or boolean data types, as they are not numeric data types).
     byte - short - int - long - float-double
     For ex;
     **If you convert small data type to large dat type it is called 'Auto widening'.
     **If you convert large data type to small data type it is called 'Explicit Narrowing'.
     */
    public static void main(String[] args) {
        byte age = 12;
        int myAge = age;
        short population0fVillage = 21000;
        int myPopulation0fVillage = population0fVillage;
        double x = 23.45;
        long y = (long) x;
        System.out.println(y);//23
        //Example 1: Create 2 integer variable and a String value
        int i = 13, k = 21;
        String s = "Tom";
        System.out.println(i + k + s);//34Tom
        System.out.println(s+ k * i);//Tom273
        /*
        order of the operation in Math
        1)Calculate the exponential
        2)Do the operations inside the parenthesis
        3)Do multiplications
        4)Do add and subtractions
         */
        int result = 3 - 2 * (5 + 2 * 3) /11;
        System.out.println(result);//1
        //Type Casting
        /*
        AutoWidening
        Java can put small data types into larger data types automatically
        When you put small data type into a large data type,you can widen the small data container
        into a bigger container data-type
       */
        //Auto-widening
        int m = 14;
        System.out.println(m);//14
        double d = m;
        System.out.println(d);//14.0
        /*
        Explicitly Narrowing
        java does not put large data types into small data types
         */
        int n = 15;
        byte b = (byte) n;
        System.out.println(b);//15
















































    }










}

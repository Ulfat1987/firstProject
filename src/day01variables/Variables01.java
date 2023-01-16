package day01variables;
public class Variables01 {
    public static void main(String[] args) {
        // Data Type Veriable Name  =  Value ;
                int       age       =   27   ;
                // Examle:1 Create a varible Whoe value is 1.99
        double price0fShirt = 1.99;
                             //Data types
        /*
            1)integer:it used for whole number.
              The minimum value of integers is negative is-2147483648
              The maximum value of integers is negative is 2147483647
              Integer variables use 32 bits in memory
             2)short: It is for whole numbers
              The minimum value of short is negative is-32768
              The maximum value of short is negative is 32767
              short variables use 16 bits in memory
            3)byte: it is used for whole number.
              The minimum value of byte is negative is-128
              The maximum value of byte is negative is 127
              byte variables use 8 bits in memory
            4)long: it is used for whole number.
               The minimum value of short is negative -9223372036854755808
               The maximum value of short is negative  9223372036854755807
               long variables use 64 bits in memory
                Note:When you select any data type the value must be in the range of the data type
         */
        int population0fGermany = 80000000;
        System.out.println(population0fGermany);//80000000
        //note:Java accepts long value a integer as default.But if your value is greater than maximum value of
        // integer you will get error.
        // To fix error put L or l to end of the number.
         long population0fTheWorld = 7000000000L;
         long population0fChina = 1400000;
         byte age0fStudent = 23;
         System.out.println(age0fStudent);//23
         short population0fTheVillage = 23000;
         System.out.println(population0fTheVillage);//23000
       /*
       Data Types about decimal values
       1)float:It is use for decimal values ( like 12.99, 5.23)
          Float values use memory 32 bites in memory
          When you create a "float" variable,you have to use 'F'  or f at the end of the value
        2)double:It is use for decimal values
                 doubles uses 64 bites in memory
        */
        float price0fLaptop = 785.99F;
        double weight0fAcell = 0.00000122345;
        /*
        Data Types Related with Numbers
        byte < short < int < long < float < double
         */
        /*
                           2 more data types
        1)boolean:It is for "true" and "false" answer
                  boolean uses just 1 bit in memory
        2)char:   It is for just a single character
                  char uses memory 16 bites in memory
         */
       boolean isRetired = true;
       boolean is0ld = false;
       char inital0fFirstName = 'A';
       /*
       byte < short < int < long < float < double and boolean and "char" are cold "Primitive Data Types"
       If a variable contains just value,it is called "Primitive"
       String is a Non-Primitive data type
       What are the differences between "Primitive Data Type" and "Non-Primitive data types"?
       1)Primitive Data Type have just value but "Non-Primitive Data Types:" have values and methods
       2)"Primitive Data Types" were created by Java, we cannot create any Primitive Data Type.
               But we can create Non-Primitive Data Types whenever we need
       3)"Primitive Data Types" use just lower cases in their names
               But Non-Primitive Data Types starts with upper cases
       4)Usage of memory in "Primitive Data Types" changes from data types to data type
               But all Non-Primitive Data Types use same amount of memory
      */
       String name = "Tom Hanks";

       /*
                                      Memory Usage in Java
           There are 2 types of memory in Java
           1)Stack Memory :Stores i)Primitive Data    2)References(Addresses) of Non-Primitive Data
           2)Heap Memory:Stores non-primitive data
        */
        //Example 2:Create an integer variable and 2 double variable than print their sum on the console
        //Note:If you use different numeric data types in any math operation,the result will be in the largest data type
        int shirt = 21;
        double shoes = 12.99,socks =3.99;
        System.out.println(shirt + shoes + socks);//37.980000000000004
        //Example 3:Create 2 float variable,3 short variable,2 double variable and print their sum on the console
        float f1 = 12.99F, f2= 5.76F;
        short s1 =12, s2 = 23, s3 = 34;
        double d1 =23.45, d2 = 123.09;
        System.out.println(f1 + f2 + s1 + s2 + s3+ d1 + d2);//234.29000000000002
        //Example 4: Create a char variable and an integer variable and try to do addition operation with them
        char c1 ='A';
        int i1 = 10;
        //When you use any char in any math operation Java uses the ASCII value of the char
        System.out.println(c1+ i1);//75
        //Example 5: Create a String variable and 2 integer variables and try to do addition operation with them
        String s ="Tom";
        int i = 12, k = 23;
        System.out.println(s+i+k);//Tom1223
        //What if I want to see Tom35
        System.out.println(s + (i+k));//Tom35
        //If you use "+" sign with a String,Java will do "concatenation" operation.
        //In Concatenation operation data will be joined
    }

}


























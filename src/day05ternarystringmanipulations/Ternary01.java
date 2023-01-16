package day05ternarystringmanipulations;

import java.util.concurrent.locks.Condition;

public class Ternary01 {
    //ternary does the same with "if else" by using more simple syntax
    public static void main(String[] args) {
        //If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
        int i = 12;
        //1.Way:
        if(i>0) {
            System.out.println("The integer is positive");
        }else{
            System.out.println("The integer is not positive");
        }
        //2.Way:ternary
        // Condition      ?     Will be selected for true condition   Will be selected for false condition
       String result= i>0 ?         "The integer is positive":             "The integer is not positive";
        System.out.println(result);
        //Write a program to print the minimum of 2 double on the console. Use ternary...
        //
        double d=12,e=23;
        double min=d>e? e: d;   //   ":" means "else"
        System.out.println(min);//12
     //Type code to calculate the absolute value of a number
        //For positive numbers and zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by -1
         double f = 0;
         double abs = f >= 0 ? f : -1 * f;
        System.out.println(abs);
        //Note: Instead of using ">=", you can use "<". This is better
         double betterAbs = f < 0 ? -1 * f : f;
        System.out.println(betterAbs);
        /* You have 2 integers;
           If both of the integers are positive do multiplication
           If one is negative the other one is positive return "I do not how to multiply"
        */
        int a =5,b=-4;
        //Object data type can be used for all data types whenever we need.
        Object res=a>0 && b>0?a*b: "I do not how to multiply";
        System.out.println(res);
    }
}

package day25exceptions;

public class E01 {
    /*
    1)"Exception" means un-exception issues in code execution
    2)There are two ways to work with Exception
       i)Using try-catch block:Handling Exception
       ii)Throw Exception and block the application
    3)If you do not handle the Exception,Java stops execution and the application is blocked.
     */
    public static void main(String[] args) {

        divide(6, 2);
        divide2(6, 3);

    }

    //1.Way:We do not recommend that way.
    //      i)It is not mandatory for developers to know all math rules.
    //     ii)In Math,there may be very problematic rules,it is so difficult to cover all in if statement
    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("A number cannot be divided by zero");
        } else {
            System.out.println(a / b);
        }
    }
    //2.Way:Handle Exception by using try-catch block
    public static void divide2(int a, int b){
        try {
            System.out.println(a / b);
            System.out.println("Hi Exceptions");
            System.out.println("By Exception");
        }catch(ArithmeticException e){
            System.out.println("A problem occured in division");
        }
    }
}

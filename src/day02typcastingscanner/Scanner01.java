package day02typcastingscanner;
import java.util.Scanner;
public class Scanner01 {
    /*
    Scanner class is used to get data from user into our codes.
    How do we get the data from the user?
    */
    //1.Step:Create an object from "Scanner Class"
    // Class Name   Object Name       Assignment Operator  New Keyword  Constructor==>Class Name +()
    Scanner         Input                  =                new          Scanner(System.in);

    Scanner input= new Scanner(System.in);
    //2.Step:Give a message to user about the data you ask

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your name, please");
      String userName = input.next();
      System.out.println(userName); //Tom
      System.out.println("Enter your full name, please");
      Scanner inputAddress = new Scanner(System.in);
      String address = input.nextLine();//next get until space,but next line get all statement
      System.out.println(address);
  }
}

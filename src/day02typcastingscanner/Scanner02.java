package day02typcastingscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Example 1:Get the width and length of a user and calculate the area of the rectangle
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width");
        Double width = input.nextDouble();
        System.out.println("Enter the length");
        Double length = input.nextDouble();
        System.out.println(" Area is "+width * length);
    }
}

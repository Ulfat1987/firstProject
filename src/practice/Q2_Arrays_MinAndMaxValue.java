package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_Arrays_MinAndMaxValue {
    //

    public static void main(String[] args) {
        int arr[] = {23, 12, 34, 10, 78, 19};
        System.out.println(Arrays.toString(arr));//[23, 12, 34, 10, 78, 19]


    //Put the element in ascending order.==> sort()
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[10, 12, 19, 23, 34, 78]
        int minValue = arr[0];//10
        int maxValue = arr[arr.length-1];
        System.out.println(minValue + maxValue);//88 console like 10+78=88

    //Create an Array and first take number of the elements and then print them on the console.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of employees to store in the array");
        int length = input.nextInt();
        String arrEmployee[] = new String[length];
        for(int i=0; i<length; i++){
            System.out.println("Enter" + i+1 +".employee name.Please press 'Q' to quit" );
            String employeeNames = input.next();
             if(!employeeNames.equalsIgnoreCase("Q")){
                 arrEmployee[i] = employeeNames;
             }else{
                 break;
             }
        }
        System.out.println(Arrays.toString(arrEmployee));
    }
}

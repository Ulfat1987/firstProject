package practice;

import java.util.Arrays;

public class Practice15 {

    public static void main(String[] args) {

        int[] a = new int[]{12, 5, 8, 13};
        Arrays.sort(a);
        if (a.length % 2 != 0) {
            Integer indexOfMiddleElement = a.length / 2;
            System.out.println(a[indexOfMiddleElement]);
        } else {
            Integer indexOfMiddleElement = a.length / 2;
            Integer averageValue = (a[indexOfMiddleElement] + a[indexOfMiddleElement - 1]) / 2;
            System.out.println(averageValue);
        }
    }
}



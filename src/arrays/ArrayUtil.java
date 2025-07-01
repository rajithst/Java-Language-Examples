package arrays;

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        int [] myArray = { 100, 20, 3330, 1410, 50 };
        System.out.println(Arrays.toString(myArray));

        // sort array
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));

        // Fill array with value
        int [] myArray2 = new int[10];
        Arrays.fill(myArray2, 100);
        System.out.println(Arrays.toString(myArray2));

        // copy of array
        int [] myArray3 = Arrays.copyOf(myArray2, 10);
        Arrays.fill(myArray3, 1);
        System.out.println(Arrays.toString(myArray3));

        // Array equality
        int [] myArray4 = {1, 2, 3, 4, 5};
        int [] myArray5 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.equals(myArray4, myArray5));

    }


}

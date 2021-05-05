package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};


            Arrays.sort(array1);
            Arrays.sort(array2);
            int p = 0;
            int q = 0;
            int min = Integer.MAX_VALUE;
            while (p < array1.length && q < array2.length) {
                if (Math.abs(array1[p] - array2[q]) < min) {
                    min = Math.abs(array1[p] - array2[q]);
                }
                if (array1[p] < array2[q]) {
                    p++;
                } else {
                    q++;
                }
            }

        System.out.println("The lowest difference between cells is " +min+".");

        }
}

/*
https://www.codewars.com/kata/57ee99a16c8df7b02d00045f/java

Challenge:

Given a two-dimensional array of integers, return the flattened version of the array
with all the integers in the sorted (ascending) order.

Example:

Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
 */


package sevenkyu;

import java.util.Arrays;

public class FlattenSortArray {

    public static int[] flattenAndSort(int[][] array) {
        int arrLength = 0;

        for (int i = 0; i < array.length; i++) {
            arrLength += array[i].length;
        }

        int[] result = new int[arrLength];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[count] += array[i][j];
                count++;
            }
        }

        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;

            for (int i = 0; i < result.length-1; i++) {
                int temp = 0;

                if(result[i] > result[i+1]){
                    temp = result[i];
                    result[i] = result[i+1];
                    result[i+1] = temp;
                    isSorted = false;
                }
            }
        }



        return result;


    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}})));
    }

}

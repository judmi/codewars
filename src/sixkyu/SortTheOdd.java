/*
https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java

You will be given an array of numbers. You have to sort the odd numbers
in ascending order while leaving the even numbers at their original positions.

Examples
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
 */

package sixkyu;

import java.util.Arrays;

public class SortTheOdd {

    public static int[] sortArray(int[] array) {

        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                for (int j =  i + 1; j < array.length; j++) {
                    if (array[j] % 2 != 0) {
                        if (array[i] > array[j]) {
                            temp = array[j];
                            array[j] = array[i];
                            array[i] = temp;
                        }
                    }
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{ 7, 3, 2, 8, 1, 5 })));
    }
}

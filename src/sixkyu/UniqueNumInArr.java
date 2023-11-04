/*
https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java

There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains at least 3 numbers.
 */

package sixkyu;

import java.util.Arrays;

public class UniqueNumInArr {

    public static double findUniq(double arr[]) {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }

                return arr[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        double[] arr = {2, 2, 2, 1};

        System.out.println(findUniq(arr));
    }
}

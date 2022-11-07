/*
https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/java

Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example:
348597 => [7,9,5,8,4,3]
0 => [0]
 */
package eightkyu;

import java.util.Arrays;

public class NumToReversedArr {

    public static int[] digitize(long n) {

        String ns = String.valueOf(n);
        int length = ns.length();
        int[] result = new int[length];
        for (int i = 0; i < ns.length(); i++) {
                result[i] = Character.getNumericValue(ns.charAt(length - i - 1));
                //result[i] = (int) (ns.charAt(length - 1) - 48)
                //length--;
            }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(54321)));
    }
}

/*
https://www.codewars.com/kata/515e271a311df0350d00000f/train/java

Complete the square sum function so that it squares each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because
1^2 + 2^2 + 2^2 = 9
 */

package eightkyu;

public class SquaredSum {
    public static int squareSum(int[] n)
    {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i]*n[i];
        }

        return sum;
    }
}

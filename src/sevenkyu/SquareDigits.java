/*
https://www.codewars.com/kata/546e2562b03326a88e000020

Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
Note: The function accepts an integer and returns an integer
 */

package sevenkyu;

import java.util.Arrays;

public class SquareDigits {
    public static int squareDigits(int n) {
        String num = String.valueOf(n);
        String result = "";

        for (int i = 0; i < num.length(); i++) {
            int squareNum = Integer.parseInt(String.valueOf(result.charAt(i)));
            squareNum = squareNum * squareNum;
            double d = 1.0;
            result += String.valueOf(squareNum);
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9123));
        //System.out.println(squareDigits(0));

    }
}


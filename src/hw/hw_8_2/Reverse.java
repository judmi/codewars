/*
https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java

Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
 */

package hw.hw_8_2;

import java.util.Arrays;

public class Reverse {
    public static int[] reverse(int n){

        int[] result = new int[n];

        for (int i = 0; i < result.length; i++) {
            result[i] = n;
            n--;
        }
        return result;
    }

    public static int[] reverse2(int n){
        //your code
        int[] res = new int[n];
        for (int i=0; i<n; i++)
            res[i]=n-i;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }
}

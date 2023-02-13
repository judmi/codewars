/*
https://www.codewars.com/kata/559590633066759614000063/train/java

Story
Ben has a very simple idea to make some profit: he buys something and sells it again.
Of course, this wouldn't give him any profit at all if he was simply to buy and sell it at the same price.
Instead, he's going to buy it for the lowest possible price and sell it at the highest.

Task
Write a function that returns both the minimum and maximum number of the given list/array.

Examples (Input --> Output)
[1,2,3,4,5] --> [1,5]
[2334454,5] --> [5,2334454]
[1]         --> [1,1]

Remarks
All arrays or lists will always have at least one element, so you don't need to check the length.
Also, your function will always get an array or a list, you don't have to check for null, undefined or similar.
 */

package sevenkyu;

import java.util.Arrays;

public class MinMaxArr {
    public static int[] minMax(int[] arr) {
        int[] result = new int[2];
        result[0] = arr[0];
        result[1] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < result[0]) {
                result[0] = arr[i];
            }
            if (arr[i] > result[1]) {
                result[1] = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{5})));
    }
}

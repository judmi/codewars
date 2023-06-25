/*
https://www.codewars.com/kata/523f5d21c841566fde000009

Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed from the other:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */

package sixkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> aAsList = new ArrayList<>(a.length);
        for (int i: a) {
            aAsList.add(i);
        }

        List<Integer> bAsList = new ArrayList<>(b.length);
        for (int i: b) {
            bAsList.add(i);
        }

        aAsList.removeAll(bAsList);

        return aAsList.stream().mapToInt(i -> i).toArray();
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2}, new int[] {1})));
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {1})));
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {2})));
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {})));
        System.out.println(Arrays.toString(arrayDiff(new int [] {}, new int[] {1,2})));
    }
}

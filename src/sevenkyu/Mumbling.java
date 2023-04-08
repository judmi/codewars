/*
https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

This time no story, no theory. The examples below show you how to write function accum:

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

package sevenkyu;

public class Mumbling {

    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            result.append(Character.toUpperCase(s.charAt(i)));

            for (int j = 0; j < i; j++) {
                result.append(s.charAt(i));
            }

            result.append("-");

        }

        return result.deleteCharAt(result.lastIndexOf("-")).toString();
    }

    public static int[] test(int n) {
        return new int[0];
    }
    public static void main(String[] args) {
        //accum(new String("ZpglnRxqenU"));
        System.out.println(test(2).toString());
    }
}

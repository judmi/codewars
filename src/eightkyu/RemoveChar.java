/*
https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java

It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
 */

package eightkyu;


public class RemoveChar {
    public static String remove(String str) {
        StringBuilder result = new StringBuilder(str);

        return result.deleteCharAt(0).deleteCharAt(result.length() - 1).toString();
    }
}

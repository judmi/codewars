/*
https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java

Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
 */

package hw.hw_8_2;

public class BoolToWord {
    public static String boolToWord(boolean b)
    {
        if (b == true) {
            return "Yes";
        }
        return "No";
    }

}

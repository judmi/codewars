/*
https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java

Complete the solution so that it returns true if the first argument(string) \
passed in ends with the 2nd argument (also a string).

Examples:

solution('abcd', 'cd') // returns true
solution('abc', 'd') // returns false
 */

package sevenkyu;

public class StringEnds {
    public static boolean solution(String str, String ending) {
        if (ending.length() > str.length()) {
            return false;
        }
        return str.subSequence(str.length() - ending.length(), str.length()).equals(ending);

        //return str.endsWith(ending);
    }
}

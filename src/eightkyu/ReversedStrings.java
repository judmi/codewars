/*
https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java

Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'
 */

package eightkyu;

public class ReversedStrings {
    public static String solution(String str) {
        StringBuilder result = new StringBuilder(str);
        return result.reverse().toString();
    }
}

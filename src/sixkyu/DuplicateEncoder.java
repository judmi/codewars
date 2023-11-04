/*
https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java

The goal of this exercise is to convert a string to a new string where each character in the new string
is "(" if that character appears only once in the original string, or ")"
if that character appears more than once in the original string.
Ignore capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("
 */

package sixkyu;

public class DuplicateEncoder {

    static String encode(String word) {

        StringBuilder result = new StringBuilder();
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i + 1, word.length()).contains(String.valueOf(word.charAt(i))) ||
            word.substring(0, i).contains(String.valueOf(word.charAt(i)))) {
                result.append(")");
            } else {
                result.append("(");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("recede"));
    }
}

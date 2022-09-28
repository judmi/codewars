/*
https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java

Write a function to split a string and convert it into an array of words.
Examples (Input -> Output):
* "Robin Singh" ==> ["Robin", "Singh"]
* "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */
package eightkyu;

import java.util.Arrays;

public class StringToArray {
    public static String[] stringToArray(String s) {
        //String[] result = s.split(" ");
        //return result;
        return s.split(" ");
    }

    public static void main(String[] args) {
        String s = "Hello my darling";
        System.out.println(Arrays.toString(stringToArray(s)));
    }

}

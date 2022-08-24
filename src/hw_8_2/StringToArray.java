/*
https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java

Write a function to split a string and convert it into an array of words.

Examples (Input -> Output):
* "Robin Singh" ==> ["Robin", "Singh"]

* "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

 */

package hw_8_2;

public class StringToArray {

    public static String[] stringToArray(String s) {
        String[] result = s.split(" ");
        return result;
    }
}

/*
https://www.codewars.com/kata/5704aea738428f4d30000914/train/java

Create a function that will return a string that combines all of the letters of the three inputed strings in groups.
Taking the first letter of all of the inputs and grouping them next to each other.
Do this for every letter, see example below!

E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"

Note: You can expect all of the inputs to be the same length.
 */

package hw.hw_8_1;

public class TripleTrouble {

    public static String tripleTrouble(String one, String two, String three) {
        String result = "";

        for (int i = 0; i < one.length(); i++) {
            result += String.valueOf(one.charAt(i)) + String.valueOf(two.charAt(i)) + String.valueOf(three.charAt(i));
        }

        return result;
    }

    public static String tripleTrouble2(String s1, String s2, String s3) {
        StringBuilder sb = new StringBuilder(s1.length()*3);
        for (int i=0; i<s1.length(); i++) {
            sb.append(s1.charAt(i)).append(s2.charAt(i)).append(s3.charAt(i));
        }
        return sb.toString();
    }

    public static String tripleTrouble3(String one, String two, String three) {
        String s = "";
        for (int i = 0; i < one.length(); i++){
            s += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
        return s;
    }


}

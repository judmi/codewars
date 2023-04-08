/*
https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7/train/java

Write a function which converts the input string to uppercase.
 */


package eightkyu;

public class MakeUpperCase {

    public static String MakeUpperCase(String str){

        StringBuilder result = new StringBuilder(str);
        for (int i = 0; i < result.length(); i++) {
            if ( (int) result.charAt(i) > 90 || (int) result.charAt(i) < 65) {
                result.setCharAt(i, (char) (str.charAt(i) - 32));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "RSBRHZ F V4Q50NA23XWDEQ3XPNC0GJYRKEPOWVU901J6";
        str = str.toLowerCase();
        System.out.println(MakeUpperCase(str));
    }
}


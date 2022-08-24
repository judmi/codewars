/*
https://www.codewars.com/kata/57a5c31ce298a7e6b7000334/train/java

Complete the function which converts a binary number (given as a string) to a decimal number.
 */

public class BinToDec {
    public static int binToDecimal(String inp){
        int result = 0;
        for (int i = 0; i < inp.length(); i++) {
                result = result * 2 + Character.getNumericValue(inp.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(binToDecimal("10"));
    }
}

/*
https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java

Write a function that takes an integer as input, and returns the number of bits that are equal to one in the
binary representation of that number. You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 */

package sixkyu;

public class BitCounting {

    public static int countBits(int n){
        int oneCount = 0;

        while (n != 0) {
            if(n % 2 == 1) {
                oneCount++;
            }
            n = n / 2;
        }

        return oneCount;
    }

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
}

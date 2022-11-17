/*
https://www.codewars.com/kata/5748838ce2fab90b86001b1a

Complete the function that calculates the area of the red square,
when the length of the circular arc A is given as the input.
Return the result rounded to two decimals.
 */
package eightkyu;

public class AreaOfSquare {

    public static double squareArea(double A) {
        double r = (A * 4.0) / (2.0 * Math.PI);
        return Math.round(r * r * 100.0)/100.0;
    }

    public static void main(String[] args) {
        System.out.println(squareArea(8.0));
    }
}

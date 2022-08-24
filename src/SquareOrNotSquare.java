/*
https://www.codewars.com/kata/57f6ad55cca6e045d2000627/train/java
Write a method, that will get an integer array as parameter and will process every number from this array.
Return a new array with processing every number of the input-array like this:

If the number has an integer square root, take this, otherwise square the number.

[4,3,9,7,2,1] -> [2,9,3,49,4,1]
The input array will always contain only positive numbers and will never be empty or null.

The input array should not be modified!


 */

public class SquareOrNotSquare {
    public static int[] squareOrSquareRoot(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            //if (Math.sqrt(array[i]) % 1 == 0)
            if (Math.sqrt(array[i]) - (int)Math.sqrt(array[i]) == 0.0) {
                array[i] = (int)Math.sqrt(array[i]);
            } else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Math.sqrt(8) % 1);
        System.out.println(Math.sqrt(9) % 1 == 0);

    }
}

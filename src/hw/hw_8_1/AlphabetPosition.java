/*
https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java

When provided with a letter, return its position in the alphabet.

Input :: "a"

Ouput :: "Position of alphabet: 1"
 */

package hw.hw_8_1;

public class AlphabetPosition {
    public static String position(char alphabet)
    {
        //alphabet = Character.toLowerCase(alphabet);
        return "Position of alphabet: " + ((int) alphabet - 96);
    }

}

/*
https://www.codewars.com/kata/54edbc7200b811e956000556/train/java

Consider an array/list of sheep where some sheep may be missing from their place.
We need a function that counts the number of sheep present in the array (true means present).

For example,

[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
The correct answer would be 17.

Hint: Don't forget to check for bad values like null/undefined
 */

package eightkyu;

public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int numOfSheep = 0;

        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i]) {
                numOfSheep++;
            }
        }

        return numOfSheep;
    }
}

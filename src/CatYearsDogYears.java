/*
https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b

I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that
 */
public class CatYearsDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] result = {humanYears, 0, 0};

        for (int i = 1; i <= humanYears; i++) {
            if (i == 1) {
                result[1] += 15;
                result[2] += 15;
            } else if (i == 2) {
                result[1] += 9;
                result[2] += 9;
            } else {
                result[1] += 4;
                result[2] += 5;
            }
        }

        return result;
    }
}

/*
https://www.codewars.com/kata/54ff3102c1bad923760001f3

Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.
 */

package sevenkyu;

public class VowelCount {


    public static int getCount(String str) {
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i'
            || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }


    public static void main(String[] args) {
        {
            int row=5, i, j, space, num;
            for(i=0; i<row; i++)
            {
                for(space=row; space>i; space--)
                {
                    System.out.print(" ");
                }
                num=1;
                for(j=0; j<=i; j++)
                {
                    System.out.print(num+ " ");
                    num = num*(i-j)/(j+1);
                }
                System.out.print("\n");
            }
        }
    }
}

/*
The pipes connecting your level's stages together need to be fixed before you receive any more complaints.
Each pipe should be connecting, since the levels ascend, you can assume every number
in the sequence after the first index will be greater than the previous and that there will be no duplicates.

Task
Given the a list of numbers, return the list so that the values increment by 1 for each index up to the maximum value.

Example
Input: 1,3,5,6,7,8

Output: 1,2,3,4,5,6,7,8
 */

public class LarioAndMuigi {
        public static int[] pipeFix(int[] numbers) {
            int[] result = new int[numbers.length * 2];

            for (int i = 0; i < numbers.length; i++) {
                result[i] = numbers[i];
                result[i+1] = numbers[i] + 1;
            }
            return result;
        }
}

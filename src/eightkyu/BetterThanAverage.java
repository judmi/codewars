/*
https://www.codewars.com/kata/5601409514fc93442500010b/train/java

There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.
You receive an array with your peers' test scores. Now calculate the average and compare your score!
Return True if you're better, else False!
Note:
Your points are not included in the array of your class's points.
For calculating the average point you may add your point to the given array!
 */
package eightkyu;

public class BetterThanAverage {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int[] points = new int[classPoints.length + 1];
        for (int i = 0; i < classPoints.length; i++) {
            points[i] = classPoints[i];
        }
        points[points.length - 1] = yourPoints;

        int sum = 0;
        for (int i = 0; i < points.length; i++) {
            sum += points[i];
        }

        if (yourPoints > sum / points.length) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3};
        System.out.println(betterThanAverage(new int[]{1, 2}, 5));
    }
}

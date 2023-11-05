/*
https://www.codewars.com/kata/52685f7382004e774f0001f7\

Write a function, which takes a non-negative integer (seconds) as input
and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)
 */

package fivekyu;

public class HumanTime {

    public static String makeReadable(int seconds) {
        int h = seconds / 3600;
        int min = (seconds - 3600 * h) / 60;
        int sec = seconds - 3600*h - 60*min;
        StringBuilder result = new StringBuilder();

        if (h < 10) {
            result.append(String.format("0%s", h));
        } else {
            result.append(h);
        }
        result.append(":");

        if (min < 10) {
            result.append(String.format("0%s", min));
        } else {
            result.append(min);
        }
        result.append(":");

        if (sec < 10) {
            result.append(String.format("0%s", sec));
        } else {
            result.append(sec);
        }

        return result.toString();
    }
}

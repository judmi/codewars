/*
https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java

Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.

Example: bitcoin take over the world maybe who knows perhaps
 */

public class ShortestWord {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        String shortestWord = words[0];

        for(int i = 0; i < words.length; i++) {
            if (shortestWord.length() > words[i].length()) {
                shortestWord = words[i];
            }
        }
        return shortestWord.length();
    }
}
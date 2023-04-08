/*
https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java

Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F
 */

package hw.hw_8_1;

public class AbbreviateName {

    public static String abbrevName(String name) {
        name = name.toUpperCase();

        String result = String.valueOf(name.charAt(0));
        for (int i = 0; i <= name.length(); i++) {
            if (String.valueOf(name.charAt(i)).equals(" ")) {
                result += "." + String.valueOf(name.charAt(i+1));
                break;
            }
        }

        return result;
    }

    public static String abbrevName2(String name) {
        name = name.charAt(0) + "." + (name.charAt(name.indexOf(" ")+1));
        name = name.toUpperCase();
        return name;
    }

//    String[] names = name.split(" ");
//    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
//        return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
}

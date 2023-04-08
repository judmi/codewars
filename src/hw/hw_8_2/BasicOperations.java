/*
https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java

Your task is to create a function that does four basic mathematical operations.

The function should take three arguments - operation(string/char), value1(number), value2(number).
The function should return result of numbers after applying the chosen operation.

Examples(Operator, value1, value2) --> output
('+', 4, 7) --> 11
('-', 15, 18) --> -3
('*', 5, 5) --> 25
('/', 49, 7) --> 7

 */

package hw.hw_8_2;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2)
    {
        switch(op) {
            case "+": return v1 + v2;
            case "-": return v1 - v2;
            case "*": return v1 * v2;
            case "/": return v1 / v2;
            default: return 0;
        }

    }

    public static Integer basicMath2(String op, int v1, int v2)
    {
        int valor = 0;
        if("+".equals(op)) valor = v1 + v2;
        if("-".equals(op)) valor = v1 - v2;
        if("*".equals(op)) valor = v1 * v2;
        if("/".equals(op)) valor = v1 / v2;
        return valor;
    }
}

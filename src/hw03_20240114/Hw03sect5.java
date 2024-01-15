package hw03_20240114;

import java.util.Scanner;

public class Hw03sect5 {
    /*
    * 5)
Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два числа и символ – или + или % или / или *. На экран выводится резултат действия над двумя введенными числами. Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Введіть перше число");
        float number1 = inputString.nextFloat(); // Можна взяти тип double чи int, але хотів поекспериментувати із float
        System.out.println("Введіть друге число:");
        float number2 = inputString.nextFloat();
        System.out.println("Введіть один із символів: - або + або % або * або /");
        String actionSymbol = inputString.next();
        System.out.println(actionSymbol.equals("-") ? ("Різниця введених чисел = " + (number1 - number2)) : actionSymbol.equals("+") ? ("Сума введених чисел = " + (number1 + number2)) : actionSymbol.equals("%") ? ("Остача від ділення введених чисел = " + (number1 % number2)) : actionSymbol.equals("/") ? ("Частка від ділення введених чисел = " + (number1 / number2)) : actionSymbol.equals("*") ? ("Добуток введених чисел = " + (number1 * number2)) : "0");
    }
}

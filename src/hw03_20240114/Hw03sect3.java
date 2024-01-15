package hw03_20240114;

import java.util.Scanner;

public class Hw03sect3 {
    /*
    * 3)
При помощи тернарного оператора необходимо получить разность двух чисел введенных с клавиатуры, и всегда отнимать от большего меньшее. Вывести эту разность в консоль.*/
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int number1 = inputString.nextInt();
        System.out.println("Введіть друге число:");
        int number2 = inputString.nextInt();
        System.out.println("Різниця введених чисел = " + (number1 <= number2? number2-number1: number1 - number2));
    }
}

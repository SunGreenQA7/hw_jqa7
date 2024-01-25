package hw05_20240118;

import java.util.Random;
import java.util.Scanner;

/*Написати програму “числа”, яка загадує випадкове число та пропонує гравцеві його вгадати.

Технічні вимоги:
• За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100] та пропонує гравцеві через консоль ввести своє ім’я, яке зберігається в змінній name. • Перед початком на екран виводиться текст: Let the game begin! • Сам процес гри обробляється у нескінченному циклі. • Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану кількість з тим, що ввів користувач. • Якщо введене число менше загаданого, програма виводить на екран текст: Your number is too small. Please, try again.. Якщо введене число більше за загадане, то програма виводить на екран текст: Your number is too big. Please, try again.. • Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}! • Завдання повинно бути виконане за допомогою масиви (НЕ використовуйте інтерфейси List, Set, Map).*/
public class Hw05sect1 {
    public static void main(String[] args) {
        Random randomDigit = new Random(); //Створюємо об"єкт класу Random
        Scanner scanner = new Scanner(System.in);
        boolean noWin = true;//Змінна вгадування числа

        System.out.print("Введіть ім\"\\я гравця: ");
        String name = scanner.nextLine();//Вводимо ім"я гравця
        System.out.println("Let the game begin!");
        int randPcNumber = randomDigit.nextInt(0, 100);//Створюємо випадкове число
        System.out.println(randPcNumber);//Виводимо загадане число на екран для тестування

        while (noWin) { //Умова виграшу
            System.out.print("Введіть ваше число від 1 до 100: ");
            int playerNumber = scanner.nextInt();//Гравець вводить числа
            if (playerNumber < randPcNumber)
                System.out.println("Your number is too small.");
            else if (playerNumber > randPcNumber)
                System.out.println("Your number is too big");
            else if (playerNumber == randPcNumber){
                System.out.println("Congratulations, " + name + "!");
                noWin = false;
            }
        }
    }
}

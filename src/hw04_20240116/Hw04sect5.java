package hw04_20240116;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Hw04sect5 {
    /*5)
Есть одномерный массив из 10 элементов, заполнен- ный случайными числами. Пользователь вводит с клавиатуры число. Программа показывает есть ли такое число в созданном до этого массиве.*/
    public static void main(String[] args) {
        Random randomDigit = new Random();
        int[] randomArray = new int[10];
        Scanner scanner = new Scanner(System.in);//Об"єкт scanner класу Scanner
        for (int i = 0; i < 10; i++) {
            randomArray[i] = randomDigit.nextInt(0, 9);
        }
        System.out.println(Arrays.toString(randomArray));
        int yourNumber;//Сюди будем записувати число з клавіатури
        boolean match = false;//Результат співпадіння
        while (!match) {
            System.out.println("Type your number");
            yourNumber = scanner.nextInt();//Вводимо число з клавіатури
            for (int i = 0; i < 10 && !match; i++) {//Зчитуємо числа масиву до першого співпадіння
                if (yourNumber == randomArray[i]) {//Перевіряємо елементи масиву на введене число
                    System.out.println("You have got a " + randomArray[i] + " at " + "i = " + i);
                    match = true;//Співпало!
                }
            }
            if (match) break;//Зупиняєм зчитування з клавіатури нового числа
            System.out.println("Number doesn't match");
        }
    }
}


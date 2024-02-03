package hw07_20240123;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*1)
Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа списком, a также нечетные числа списком.*/
public class MainHw07Sect1 {
    public static void main(String[] args) {
        Random randomDigit = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір числового масиву: ");
        int arraySize = scanner.nextInt(); //Задаємо розмір числового масиву
        int[] sourceArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) { //Заповнюємо масив випадковими цілими числами від 0 до 99 включно
            sourceArray[i] = randomDigit.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(sourceArray));

        Hw07sect1 task07_1 = new Hw07sect1();//Створюємо об"єкт task07_1 класу Hw07sect1
        task07_1.splitArrayToOddEvenLists(sourceArray);//Застосовуємо метод splitArrayToOddEvenLists до масиву sourceArray
    }
}

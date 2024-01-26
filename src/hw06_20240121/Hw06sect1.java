package hw06_20240121;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*1) Пользователь задает размерность двумерного массива с клавиатуры.
Массив заполняется случайными числами от 0 до 1000.
Необходимо создать одномерный массив, состоящий из максимальных значений
каждого отдельного массива входящего в двумерный.
Новый полученный массив вывести на экран.*/
public class Hw06sect1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] size = new int[2]; //Сюди прийматимемо розмірність двовимірного масива з клавіатури
        System.out.println("Введіть через пробіл число елементів у двомірному масиві: ");

        for (int i = 0; i < 2; i++) {
            if (scanner.hasNextInt()) { //Перевіряємо на введення тільки числа
                size[i] = scanner.nextInt();
            } else {
                System.out.println("Невірно. Введіть ціле число.");
                i--; //Повертаємо значення індексу для введення коректного значення масиву
                scanner.next(); //Затираємо невірно введене значення
            }
        }

        int[] maxNumbersArray = new int[size[0]]; //Масив максимальних значень
        int[][] twoDimArray = new int[size[0]][size[1]]; //Масив випадкових чисел
        for (int i = 0; i < size[0]; i++) { //Створюємо масив випадкових чисел
            int maxNumber = twoDimArray[i][0]; //Одразу шукаємо максимальне значення
            for (int j = 0; j < size[1]; j++) {
                twoDimArray[i][j] = random.nextInt(1001);
                if (twoDimArray[i][j] > maxNumber) {
                    maxNumber = twoDimArray[i][j];
                }
            }
            maxNumbersArray[i] = maxNumber; //Заповнюємо масив максимальних значень
        }

        System.out.println("Масив випадкових чисел розміром " + size[0] + " X " + size[1]);
        for (int[] arrOfSubArr : twoDimArray) {
            System.out.println(Arrays.toString(arrOfSubArr));
        }
        System.out.println("Масив максимальних значень:");
        System.out.println(Arrays.toString(maxNumbersArray));


    }
}


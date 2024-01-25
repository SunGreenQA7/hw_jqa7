package hw04_20240116;

import java.util.Arrays;
import java.util.Random;

public class Hw04sect6 {
    /*6)
Заполнить массив на 45 элементов случайными числами от -50 до +50. Найти минимальный элемент и вывести его на консоль. Найти максимальный элемент и вывести его на консоль.*/
    public static void main(String[] args) {
        Random randomDigit = new Random(); //Створюємо об"єкт класу Random
        int[] randomArray = new int[45]; //Порожній масив чисел розміром 45
        for (int i = 0; i < 45; i++) {//У циклі заповнюємо масив випадковими числами
            randomArray[i] = randomDigit.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(randomArray));//Виводимо масив рядком у консоль
        int minElement = 0;
        int maxElement = 0;
        for (int i = 0; i < 45; i++) {//Перебором шукаєм мінімальний елемент
            if (minElement > randomArray[i])
                minElement = randomArray[i];
        }
        for (int i = 0; i < 45; i++) { //Перебором шукаєм максимальний елемент
            if (maxElement < randomArray[i])
                maxElement = randomArray[i];
        }
        System.out.println("Мінімальний елемент масиву = " + minElement);
        System.out.println("Максимальний елемент масиву = " + maxElement);
    }
}

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

        //Оптимізація коду після зауваження

        /*Новий коментар до вашого запису "assignment_18605_170614292372_hw04.txt"
Автор: Serhii Kudaev (IP адреса: 88.156.138.15,
088156138015.dynamic-2-waw-k-2-2-0.vectranet.pl)
Email: greysiarhei@gmail.com
Коментар:
В 6 задаче при поиске минимального и максимального числа. Когда Вы задаете
изначальное значение для минимума и максимума, лучше приравнивать их не к нулю, а к
первому элементу массива.

Ви можете бачити всі коментарі до цього запису тут:
https://lms.dan-it.com.ua/assignment/assignment_18605_170614292372_hw04-txt/#comments

Постійне посилання:
https://lms.dan-it.com.ua/assignment/assignment_18605_170614292372_hw04-txt/#comment-5253
*/
        //int minElement = 0;
        //int maxElement = 0;
        int minElement = randomArray[0], maxElement = randomArray[0];

        for (int i = 1; i < 45; i++) {//Перебором шукаєм мінімальний та максимальний елемент
            if (minElement > randomArray[i]) {
                minElement = randomArray[i];
            }
            //for (int i = 0; i < 45; i++) { //Перебором шукаєм максимальний елемент
            if (maxElement < randomArray[i])
                maxElement = randomArray[i];
        }
        System.out.println("Мінімальний елемент масиву = " + minElement);
        System.out.println("Максимальний елемент масиву = " + maxElement);
    }
}

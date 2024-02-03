package hw07_20240123;

/*1)

Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа списком, a также нечетные числа списком.*/

import java.util.*;

public class Hw07sect1 {
    //Метод котрий приймає масив цілих чисел і нічого не повертає
    public void splitArrayToOddEvenLists(int[] arrayOfInt) {

        //Створюємо об"єкти: порожні списки для відсортованих чисел
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        int evenIndex = 0, oddIndex = 0;//Змінні індексу відсортованих списків
        for (int digit : arrayOfInt) {//Послідовно зчитуємо елементи масиву у змінну digit
            if (digit % 2 == 0) {//Шукаємо остачу від ділення числа на 2
                evenNumbers.add(evenIndex, digit);//Записуємо значення digit в позицію evenIndex у список
                evenIndex++; //Переходимо на наступну позицію списку
            } else {
                oddNumbers.add(oddIndex, digit);//Записуємо значення digit в позицію oddIndex у список
                oddIndex++; //Переходимо на наступну позицію списку
            }
        }
        System.out.println("Список непарних чисел:");
        for (int odd : oddNumbers) {
            System.out.print(odd + " ");
        }
        System.out.println();
        System.out.println("Список парних чисел:");
        for (int even : evenNumbers) {
            System.out.print(even + " ");
        }
    }
}
package hw04_20240116;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Hw04sect4 {
    /*4)
Первый будет состоять из следующих имен: “Петя”, “Маша”, “Алёна”, “Федя”, “Саша”, “Антон”, “Глеб”. Второй будет содержать следующие значения типа int: 10, 12, 14, 16, 18, 20. Третий будет содержать следующие значения: “школу”, “магазин”, “церковь”, “тренажерный зал”, “кино”, “поликлинику”. Пользователь вводит три числа с клавиатуры, которые будут соответствовать индексам каждого из элементов массивов. Пример1. после ввода 3,2,1: На экране должно вывестись следующее сообщение: “Федя будет идти в магазин в 14:00” Пример2. после ввода 1,2,3: На экране должно вывестись следующее сообщение: “Маша будет идти в тренажерный зал в 14:00”*/

    public static void main(String[] args) { //Задаємо явно три масиви
        String[] humanNames = {"Петро", "Маша", "Оленка", "Хведір", "Саша", "Антон", "Гліб" };
        int[] timeOfHour = {10, 12, 14, 16, 18, 20};
        String[] goals = {"школу", "магазин", "церкву", "тренажерний зал", "кіно", "поліклініку" };
        Scanner scanner = new Scanner(System.in);
        //Вказаний код не перевіряє на помилку при виході цифри за межі індекса
        System.out.println("Введіть з клавіатури через кому без пробілів три числа:");
        System.out.println("Допустимий діапазон: 0<=first<=6,0<=second<=5,0<=third<=5");
        String[] digiCodeArray = scanner.nextLine().split(",");//Робимо масив рядків
        int[] digiCodeInt = new int[3];//Створюємо числовий масив
        for (int i = 0; i < 3; i++) {//Заповнюємо перетвореними значеннями із рядка у число
            digiCodeInt[i] = Integer.parseInt(digiCodeArray[i]);
        }
        System.out.println(humanNames[digiCodeInt[0]] + " буде йти в " + goals[digiCodeInt[2]] + " об " + timeOfHour[digiCodeInt[1]] + ":00");
    }
}

package hw03_20240114;

import java.util.Scanner;

public class Hw03sect2 {
    /* 2)
     * Пользователь вводит с клавиатуры три целочисленных значения. На экран выводится информация можно ли из этих сторон построить треугольник. (необходимо вспомнить правило построения треугольника по трем сторонам).
     * */

    public static void main(String[] args) {
        Scanner triangleSidesInput = new Scanner(System.in);
        System.out.println("Введіть довжину сторін трикутника через пробіл:");
        String sidesString = triangleSidesInput.nextInt() + " " + triangleSidesInput.nextInt() + " " + triangleSidesInput.nextInt();
        // Читаєм ряд введених значень, створюєм масив записів, розділених за ознакою пробілу
        String[] sidesStringArray = sidesString.split("\s");
        // Елементи масиву перетворюєм у цілі числа
        int aInputSide = Integer.parseInt(sidesStringArray[0]);
        int bInputSide = Integer.parseInt(sidesStringArray[1]);
        int cInputSide = Integer.parseInt(sidesStringArray[2]);
        // Сортуєм сторони трикутника у порядку зменшення a > b > c
        int aRanged = aInputSide >= bInputSide && aInputSide >= cInputSide ? aInputSide : bInputSide >= cInputSide && bInputSide >= aInputSide ? bInputSide : cInputSide;
        int bRanged = aInputSide >= bInputSide && aInputSide <= cInputSide ? aInputSide : bInputSide >= aInputSide && bInputSide <= cInputSide ? bInputSide : cInputSide;
        int cRanged = aInputSide <= bInputSide && aInputSide <= cInputSide ? aInputSide : bInputSide <= cInputSide && bInputSide <= aInputSide ? bInputSide : cInputSide;
        System.out.println("Сторони трикутника відсортовано від більшої до меншої a > b > c:");
        System.out.println("Сторона a = " + aRanged);
        System.out.println("Сторона b = " + bRanged);
        System.out.println("Сторона c = " + cRanged);
     /* Умова існування трикутника: будь яка сторона трикутника менша від суми двох інших його сторін і більша за їх різницю.
        Оскільки довжини сторін у нас відсортовані умову можна дещо спростити
      */
        String triangle = (aRanged < (bRanged + cRanged) && bRanged > (aRanged - cRanged) && cRanged > (aRanged - bRanged)) ? "Трикутник з такими сторонами можливий :)" : "Неможливо побудувати трикутник з такими сторонами :(";
        System.out.println(triangle);

    }
}


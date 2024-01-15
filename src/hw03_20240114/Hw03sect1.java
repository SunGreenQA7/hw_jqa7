package hw03_20240114;

import java.util.Scanner;

public class Hw03sect1 {
    /*
    * 1)
У вас есть строка “Я тестирую замечательно. Что еще нужно?”, которую нужно ввести с клавиатуры в консоль.

Необходимо при помощи только метода next() класса Scanner (не используем метод nextLine()) присвоить перемнным типа String следующие значения: string1 = Я string2 = тестирую string3 = замечательно string4 = Что еще нужно? Помимо string1, string2, string3, string4 новыхпеременных создавать нельзя.*/
    public static void main(String[] args) {
        Scanner manualInputString = new Scanner(System.in);
        System.out.println("Наберіть на клавіатурі 'Я' і натисніть Enter");
        String string1 = manualInputString.next();
        System.out.println("Наберіть на клавіатурі 'тестирую' і натисніть Enter");
        String string2 = manualInputString.next();
        System.out.println("Наберіть на клавіатурі 'замечательно.' і натисніть Enter");
        String string3 = manualInputString.next();
        System.out.println("Наберіть на клавіатурі 'Что еще нужно?' і натисніть Enter");
        String string4 = manualInputString.next() + " " +  manualInputString.next() + " " + manualInputString.next();
        // String string5 = manualInputString.next();
        System.out.println("Значення змінної string1 = " + string1);
        System.out.println("Значення змінної string2 = " + string2);
        System.out.println("Значення змінної string3 = " + string3);
        System.out.println("Значення змінної string4 = " + string4);
    }
}

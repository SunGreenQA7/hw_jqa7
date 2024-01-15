package hw03_20240114;

import java.util.Scanner;

public class Hw03sect4 {
    /*
    * 4)
(Использовать операторы if-else-if) Пользоватьель вводит с клавиатуры числа: Если число равно 1, то выводин на консоль “Понедельник”; Если число равно 2, то выводин на консоль “Вторник”; Если число равно 3, то выводин на консоль “Среда”; Если число равно 4, то выводин на консоль “Четверг”; Если число равно 5, то выводин на консоль “Пятница”; Если число равно 6, то выводин на консоль “Суббота”; Если число равно 7, то выводин на консоль “Воскресенье”; В противном случае выводим текст: “Лучше бы сегодня была пятница”.*/
    public static void main(String[] args) {
        Scanner dayOfWeekLine = new Scanner(System.in);
        System.out.println("Введіть ціле число:");
        int numberOfDay = dayOfWeekLine.nextInt();
        if (numberOfDay == 1) {
            System.out.println("Понеділок");
        } else if (numberOfDay == 2) {
            System.out.println("Вівторок");
        } else if (numberOfDay == 3) {
            System.out.println("Середа");
        } else if (numberOfDay == 4) {
            System.out.println("Четвер");
        } else if (numberOfDay == 5) {
            System.out.println("П\''ятниця");
        } else if (numberOfDay == 6) {
            System.out.println("Субота");
        } else if (numberOfDay == 7) {
            System.out.println("Неділя");
        } else {
            System.out.println("It's better Friday to be ))");
        }
    }
}

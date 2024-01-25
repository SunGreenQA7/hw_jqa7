package hw04_20240116;

import java.util.Scanner;

public class Hw04sect3 {
    /*3)
Написать проограмму, условно для склада приема металла. Представим, что склад может хранить определенный вес металла. Пользователь вводит с клавиатуры вес, который может хранится на складе. Дальше пользователь вводит с клавиатуры вес, который условно собирается сдать на склад пользователь. Программа должна после каждой сдачи металла показывать сколько веса еще может принять склад. Если пользователь хочет сдать металла больше чем осталось места на складе, то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции. Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает о невозможности приемки такого малого веса. Программа завершается, когда место на складе закончилось.*/
    public static void main(String[] args) {
        Scanner scladInput = new Scanner(System.in);
        System.out.println("Введіть загальну місткість складу:");
        int totalMetalStorage = scladInput.nextInt(); //Загальна місткість складу
        int utilizedStorage = 0; //Заповнення складу
        while (totalMetalStorage - utilizedStorage >= 5) { //Перевірка вільного місця, цикл "здавання" металу
            System.out.println("Введіть вагу металу, який здаєте зараз:");
            int utilizeNow = scladInput.nextInt();
            if (utilizeNow < 5 && utilizeNow >= 0) { //Якщо здають менше 5 металу
                System.out.println("Вам треба назбирати ще " + (5 - utilizeNow) + " металу");
                continue;
            }
            if (utilizeNow < 0) { //Якщо здають від"ємне значення металу
                System.out.println("Ви хочете купити у нас " + utilizeNow * (-1) + " металу?");
                continue;
            }
            if (totalMetalStorage - utilizedStorage - utilizeNow < 0) { //Якщо здають більше, ніж вільного місця на складі
                System.out.println("Ваш метал на наш склад не влізе");
            } else {
                utilizedStorage = utilizedStorage + utilizeNow;
            }
            if (totalMetalStorage - utilizedStorage < 5) { //Якщо на складі менше 5 вільного місця, отже ми не зможемо здати менше 5 за умовою задачі
                System.out.println("Наш склад заповнений!");
                break;
            } else {
                System.out.println("Ще можна здати: " + (totalMetalStorage - utilizedStorage));
            }
        }
        System.out.println("Гуд бай");
    }
}

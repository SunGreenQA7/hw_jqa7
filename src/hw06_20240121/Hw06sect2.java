package hw06_20240121;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*2) Написати програму “стрільба по цілі”.
                  Технічні вимоги:

• Даний квадрат 5х5, де програма випадковим чином ставить ціль.
• Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
• Сам процес гри обробляється у нескінченному циклі.
• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія
• знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився, пропонує ввести число ще раз.
• Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
• Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки, куди гравець вже стріляв, слід зазначити як *.
• Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле.
• Уражену ціль відзначити як x.
• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).

Приклад виведення в консоль:

[0, 1, 2, 3, 4, 5]
[1, -, *, -, -, -]
[2, -, -, -, -, -]
[3, -, *, -, -, -]
[4, -, -, *, -, -]
[5, -, *, -, -, *]
*/
public class Hw06sect2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        char fillerChar = '_';

        int[] targetSize = new int[2]; //Сюди прийматимемо розмір мішені з клавіатури
        int[] targetSizeToDisplay = new int[2]; //Сюди записуємо розмір мішені для виводу в консоль
        int[] targetPoint = new int[2]; //Сюди задаватимемо випадкові координати цілі
        int[] shoot = new int[2]; //Координати пострілу
        System.out.print("Введіть через пробіл розмір мішені: ");

        for (int i = 0; i < 2; i++) { //Створюємо масиви розмірів мішені
            if (scanner.hasNextInt()) { //Перевіряємо на введення тільки числа
                targetSize[i] = scanner.nextInt();
                if (targetSize[i] <= 0) { //Відкидаємо неприйнятні значення розміру
                    System.out.println("Помилка. Введіть розмір > 0");
                    i--;
                    scanner.next();
                }
            } else {
                System.out.println("Введено символ. Введіть ціле число.");
                i--; //Повертаємо значення індексу для введення некоректного значення масиву
                scanner.next(); //Затираємо невірно введене значення
            }
            if (i >= 0) {
                targetSizeToDisplay[i] = targetSize[i] + 1;
            }
        }

        String[][] tarGetDesk = new String[targetSizeToDisplay[1]][targetSizeToDisplay[0]]; //Створюємо мішень заданого розміру як масив рядків
        for (int i = 0; i < targetSizeToDisplay[1]; i++) { //Рядки мішені
            tarGetDesk[i][0] = "|" + i + "|";
            for (int j = 1; j < targetSizeToDisplay[0]; j++) { //Стовпчики мішені
                tarGetDesk[0][j] = "|" + j + "|";
                tarGetDesk[i][j] = "|" + fillerChar + "|";
            }
        }
        System.out.println();//Виводимо мішень на екран
        for (int i = 0; i < targetSizeToDisplay[1]; i++) {
            for (int j = 0; j < targetSizeToDisplay[0]; j++) {
                System.out.print(tarGetDesk[i][j]);
            }
            System.out.println();
        }

        //Генерація випадкової цілі
        targetPoint[0] = random.nextInt(1, targetSizeToDisplay[0]);
        targetPoint[1] = random.nextInt(1, targetSizeToDisplay[1]);
        System.out.println();
        System.out.println("All Set. Get ready to rumble!");

        boolean missRow = true, missColumn = true, targetHit;//Змінні умов перевірки

        do { //Головний цикл гри до влучання у ціль

            do { //Цикл перевірки введення координат пострілу
                System.out.println();
                System.out.print("Для стрільби введіть стовпчик 1-" + targetSize[0] + " і рядок 1-" + targetSize[1] + " через пробіл: ");

                for (int i = 0; i < 2; i++) {
                    if (scanner.hasNextInt()) { //Перевіряємо на введення тільки числа
                        shoot[i] = scanner.nextInt();
                    } else {
                        System.out.println("Невірно. Введіть ціле число.");
                        //i--; //Повертаємо значення індексу для введення коректного значення масиву
                        scanner.next(); //Затираємо невірно введене значення
                    }

                    if (i == 0) {
                        if (shoot[0] < 1 || shoot[0] > targetSize[0]) {
                            System.out.println("Некоректний стовпчик 1-" + targetSize[0]);
                            missColumn = true;
                        } else {
                            missColumn = false;
                        }
                    }
                    if (i == 1) {
                        if (shoot[1] < 1 || shoot[1] > targetSize[1]) {
                            System.out.println("Некоректний рядок 1-" + targetSize[1]);
                            missRow = true;
                        } else {
                            missRow = false;
                        }
                    }
                }
            } while (missColumn || missRow);
            System.out.println("Ціль тут: " + Arrays.toString(targetPoint));
            //Shooting
            targetHit = Arrays.equals(targetPoint, shoot);//Фіксуємо влучання через порівняння елементів масивів цілі та пострілу
            if (targetHit) { //Ставимо мітку цілі
                tarGetDesk[shoot[1]][shoot[0]] = "|" + 'X' + "|";
                System.out.println();
                System.out.println("You are the WINNER!");
            } else { //Ставимо мітку пострілу
                tarGetDesk[shoot[1]][shoot[0]] = "|" + '*' + "|";
            }
            System.out.println();//Виводимо мішень на екран після пострілів
            for (int i = 0; i < targetSizeToDisplay[1]; i++) {
                for (int j = 0; j < targetSizeToDisplay[0]; j++) {
                    System.out.print(tarGetDesk[i][j]);
                }
                System.out.println();
            }
        } while (!targetHit);
    }
}



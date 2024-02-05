package hw07_20240123;

import java.util.Random;

/*2)                     Написать перегруженный метод, который может:
*/
public class Hw07sect2 {
    /*•	Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".*/
    public void overMethodHW7() {
        System.out.println("Я пустой");
    }

    /*•	Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.*/
    public void overMethodHW7(String stringVar) {
        stringVar = "Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.";
        System.out.println(stringVar);
    }

    /*•	Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.*/
    public void overMethodHW7(String[] stringArray) {
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    /*•	Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.*/
    public int overMethodHW7(int[] inputNumberArray) {
        int summa = 0;
        for (int element : inputNumberArray) {
            summa += element;
        }
        System.out.println("Сума елементів масива виведена у методі = " + summa);
        return summa;
    }

    /*•	Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа: "Ваше сообщение - "%%%%%%%%", ваше число -  $", где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/
    public void overMethodHW7(int inputNumber, String inputString) {
        System.out.println("Ваше сообщение - " + inputString + ", ваше число - " + inputNumber);
    }

    public static void main(String[] args) {
        Hw07sect2 hw07sect2 = new Hw07sect2();//Створюємо об"єкт hw07sect2 класу Hw07sect2

        hw07sect2.overMethodHW7();//Виклик методу #1

        hw07sect2.overMethodHW7("Starting string");//Виклик методу #2

        String[] inputStringArray = new String[]{"String1", "String2", "String3"};//Створюємо об"єкт inputStringArray типу масив рядків
        hw07sect2.overMethodHW7(inputStringArray);//Виклик методу #3

        Random random = new Random();
        int[] numberArray = new int[9];//Створюємо об"єкт numberArray типу масив int розміром 9 елементів
        for (int i = 0; i < 9; i++) { //Заповнюємо масив випадковими цілими числами від 0 до 99 включно
            numberArray[i] = random.nextInt(0, 100);
        }
        System.out.println("Сума елементів масива виведена у класі = " + hw07sect2.overMethodHW7(numberArray));//Виклик методу #4

        hw07sect2.overMethodHW7(4, "This is a string");//Виклик методу #5

    }
}

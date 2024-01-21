package hw04_20240116;

import java.util.Scanner;

public class Hw04sect1 {
    /*1)
Написать программу, которая будет считывать введенные пользователем слова с клавиатуры слова, и склеивать их в одно предложение до тех пор, пока пользователь не введет с клавитуры слово STOP. Все слова введенные до этого должны отобразится в консоли одним предложением.*/
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Введіть з клавіатури слово і натисніть Enter:");
        String sentenceIn = keyboardInput.next();//Змінна для введення речення, зчитуєм перше слово
        sentenceIn = Character.toUpperCase(sentenceIn.charAt(0)) + sentenceIn.substring(1); //Пишемо перше слово з великої літери
        String wordIn = ""; //Змінна для введення слів
        if (sentenceIn.equals("STOP")) //Зупиняємо, якщо перше введене слово STOP
            sentenceIn = "is empty";
        else
            while (!wordIn.equals("STOP")) { //Перевіряємо на стоп слово
                sentenceIn = sentenceIn + " " + wordIn; //Формуємо речення
                wordIn = keyboardInput.next();

                /*так, тут два пробіла після першого слова ))
                 * В кінці речення слово STOP не пишемо*/
            }
        System.out.println("Ваше речення:");
        System.out.println(sentenceIn);
    }
}

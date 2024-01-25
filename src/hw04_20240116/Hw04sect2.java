package hw04_20240116;

import java.util.Scanner;

public class Hw04sect2 {
    /*2)
Написать программу в которой пользователь вводит с клавиатуры число, а программа определяет, является она полиндромом или нет. И выводит данную информацию на экран.*/
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        System.out.println("Type your number:");
        String directNumber = inputScan.nextLine();
        String revertNumber = "";
        for (int i = directNumber.length() - 1; i >= 0; i--) {
            revertNumber = revertNumber + directNumber.charAt(i);
        }
        if (directNumber.equals(revertNumber)) {
            System.out.println("The number " + directNumber + " is polindrome: " + revertNumber);
        } else {
            System.out.println("The number " + directNumber + " is NOT polindrome: " + revertNumber);
        }
    }
}

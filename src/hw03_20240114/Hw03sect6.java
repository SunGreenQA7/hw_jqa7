package hw03_20240114;

import java.util.Scanner;

public class Hw03sect6 {
    /*
    * 6)
Используя оператор switch написать программу, которая выводит на консоль ссылку для скачивания программы. Из выбора программ взять: IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS, Windows. Программа должна спросить пользователя какая программа ему интересна, также спросить какую ОС он использует, а после вывести в консоль необходимую ссылку. Если программа с таким названием не существует выводит сообщение в консоль, о том что такой программы не существует. Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том что такой ОС не существует.*/

    public static void main(String[] args) {
        /*Under construction*/
        Scanner inputString = new Scanner(System.in);
        System.out.println("Введіть назву програми для завантаження - IDEA, Git, Java:");
        String softName = inputString.nextLine(); //Сюди вводимо назву програми
        String osNameInput;                       //Сюди будемо записувати назву ОС
        /*Усі введені з клавіатури назви приводимо до нижнього регістру.
         * Порівнюєм із назвами програм, потім переходимо на вибір ОС для кожної програми.
         * У випадку невідповідності виводимо повідомлення про помилку.*/
        switch (softName.toLowerCase()) {
            case "idea":
                System.out.println("Введіть тип ОС - Linux, macOS, Windows:");
                osNameInput = inputString.nextLine();
                switch (osNameInput.toLowerCase()) {
                    case "linux":
                        System.out.println("Link to download IntelliJ IDEA for Linux");
                        break;
                    case "macos":
                        System.out.println("Link to download IntelliJ IDEA for Mac OS");
                        break;
                    case "windows":
                        System.out.println("Link to download IntelliJ IDEA for Windows");
                        break;
                    default:
                        System.out.println("Такої ОС не існує!");
                }
                break;

            case "git":
                System.out.println("Введіть тип ОС - Linux, macOs, Windows:");
                osNameInput = inputString.nextLine();
                switch (osNameInput.toLowerCase()) {
                    case "linux":
                        System.out.println("Link to download Git for Linux");
                        break;
                    case "macos":
                        System.out.println("Link to download Git for Mac OS");
                        break;
                    case "windows":
                        System.out.println("Link to download Git for Windows");
                        break;
                    default:
                        System.out.println("Такої ОС не існує!");
                }
                break;

            case "java":
                System.out.println("Введіть тип ОС - Linux, macOs, Windows:");
                osNameInput = inputString.nextLine();
                switch (osNameInput.toLowerCase()) {
                    case "linux":
                        System.out.println("Link to download Java for Linux");
                        break;
                    case "macos":
                        System.out.println("Link to download Java for Mac OS");
                        break;
                    case "windows":
                        System.out.println("Link to download Java for Windows");
                        break;
                    default:
                        System.out.println("Такої ОС не існує!");
                }
                break;
            default:
                System.out.println("Такої програми не існує!");
        }
    }
}

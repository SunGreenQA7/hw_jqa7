package hw02_20240111;

public class Hw02Sect2 {
    /*Создать строку string = "Testing, is my favourite job".
Вывести на экран отдельно каждое слово и длину этого слова в след виде:
Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
и т.д.
Вывести на консоль true, если первое слово длиннее остальных, в
противном случае вывести false.
*/
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        string = string.replace(",", "");
        String[] stringArr = string.split(" ");

        System.out.println("Слово1 = " + stringArr[0] + ", Довжина цього слова = " + stringArr[0].length());
        System.out.println("Слово2 = " + stringArr[1] + ", Довжина цього слова = " + stringArr[1].length());
        System.out.println("Слово3 = " + stringArr[2] + ", Довжина цього слова = " + stringArr[2].length());
        System.out.println("Слово4 = " + stringArr[3] + ", Довжина цього слова = " + stringArr[3].length());
        System.out.println("Слово5 = " + stringArr[4] + ", Довжина цього слова = " + stringArr[4].length());
        System.out.println();
        System.out.print("Вывести на консоль true, если первое слово длиннее остальных, в\n" +
                "противном случае вывести false:  ");
        System.out.println(stringArr[0].length()>stringArr[1].length()&&
                stringArr[0].length()>stringArr[2].length()&&
                stringArr[0].length()>stringArr[3].length()&&
                stringArr[0].length()>stringArr[4].length());
        //System.out.println(string.split(" "));
    }
}

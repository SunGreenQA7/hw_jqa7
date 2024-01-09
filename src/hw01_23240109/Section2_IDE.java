package hw01_23240109;

public class Section2_IDE {
    /*  4)
   Coздать две переменные типа int:
   int a = 7;
   int b = 9;
   Поменять между собой значения переменных a и b.
   Создавать новые переменные нельзя.
   Можно применять только арифметические действия к перемнным a и b.
   Вывести в консоль значения переменных a и b после их переопределения.
    * */

    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        System.out.println("origin a = " + a);
        System.out.println("origin b = " + b);
        System.out.println("=============");
        a = a + b; // combine both vars
        b = a - b; // set "b" an "a" value by removing "b" part from combination. Thus "b" has an "a" value.
        a = a - b; // set "a" a "b" value by removing former "a" (now "b") value from combination.
        System.out.println("flipped a = " + a);
        System.out.println("flipped b = " + b);
    }
}

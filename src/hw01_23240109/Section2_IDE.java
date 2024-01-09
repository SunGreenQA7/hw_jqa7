package hw01_23240109;
/*Раздел 1. Не делаем его в среде разработки:

1)
 mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
   volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
   opel = mercedes%volvo;
   Необходимо вычислить значения mersedes, volvo и opel.

     mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
	 mercedes = (1 + (-6)%3 + (4)*2)+(-2)*3;
	 mercedes = (1 + 0 + 8)+(-6);
	 mercedes = 3;

	 volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
     volvo = 3*3 - 9%3 + 16-(-3);
	 volvo = 9 - 0 + 19;
	 volvo = 28;

	 opel = mercedes%volvo;
	 opel = 3%28;
	 opel = 3;

It is impossible to calculate the value of "mersedes" variable ;)
Also the values of other variables are:
	 mercedes = 3;
     volvo = 28;
     opel = 3;

   2)
   int x = 3;
   int y = ++x*2;
   x+=-y*3 + ++x + --y;
   y+=(-x++)%3;
   int z = x + y;
   Необходимо вычислить значения x, y и z.

   int x = 3;

   int y = ++x*2;
		y = (x + 1)*2;
		y = (3 + 1)*2;
		x = 4;
		y = 8;

   x+=-y*3 + ++x + --y;
		x = x + (-y*3 + (x + 1) + (y - 1));
		x = 4 + (-8*3 + (4 + 1) + (8 - 1));
		x = 4 + (-24 + 5 + 7);
		x = -8;
		y = 7;

   y+=(-x++)%3;
	   y = y + (-x)%3; // x=x+1
	   y = 7 + (-8)%3; // x=9
	   y = 7 + (-2);
	   y = 5;
	   x = 9;

   int z = x + y;
	   z = 9 + 5;
	   z = 14;


3)
   boolean a = (85/5 + (19-25%3))==(-3)*(-2+14/(-2))&&(2%7-1)*3<=2;
   boolean b = !a||a&&!a;
   boolean c = false&&!true||!((23%3+14)%3==7);
   Необходимо вычислить значения a, b и c.

   boolean a = (85/5 + (19-25%3))==(-3)*(-2+14/(-2))&&(2%7-1)*3<=2;
		boolean a = (85/5 + (19-1))==(-3)*(-9)&&(1)*3<=2;
		boolean a = 35==27&&3<=2;
		boolean a = false&&false;
		boolean a = false;

   boolean b = !a||a&&!a;
	   boolean b = true||false&&true;
	   boolean b = true||false;
	   boolean b = true;

    boolean c = false&&!true||!((23%3+14)%3==7);
		   boolean c = false&&!true||!(16%3==7);
		   boolean c = false&&!true||!(1==7);
		   boolean c = false&&!true||!false;
		   boolean c = false||true;
		   boolean c = true;

* */

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

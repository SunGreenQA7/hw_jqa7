package hw07_20240123;

/*3)                  Создать класс Конспект. Класс должен содержать следующие поля:

ФИО студента;
Название предмета;
Количество страниц;
Год выпуска;
Цвет обложки.
Название заведения, где учится студент;*/
public class Hw07sect3Conspekt {

    public String nameSurname;
    public String subjectName;
    public int numberOfPages;
    public int yearOfFinishing;
    public int[] colorInRGB;//Масив [3] для задання кольору у RGB форматі
    public String nameOfHighSchool;


    public static void main(String[] args) {
        Hw07sect3Conspekt hw07sect3Conspekt = new Hw07sect3Conspekt();
        hw07sect3Conspekt.colorInRGB = new int[]{255, 255, 255};
        hw07sect3Conspekt.nameOfHighSchool = "Dan IT school";
        hw07sect3Conspekt.nameSurname = "Zabolotny Wolodymyr";
        hw07sect3Conspekt.numberOfPages = 100;
        hw07sect3Conspekt.yearOfFinishing = 2024;
        hw07sect3Conspekt.subjectName = "Automated tester";
    }
}

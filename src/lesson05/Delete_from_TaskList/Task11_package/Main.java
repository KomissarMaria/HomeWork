package lesson05.Delete_from_TaskList.Task11_package;

/**
 * Изменить иерархию классов «Фигуры» с учетом знаний о полиморфизме
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2, 5);
        System.out.println("S = " + rec.findsquare());
        rec.print();
        System.out.println("Сумма длинн сторон = " + rec.sumside());
        System.out.println();

        Triangle tr = new Triangle(5);
        System.out.println("S = " + tr.findsquare());
        tr.print();
        System.out.println("Сумма длинн сторон = " + tr.sumside());
        System.out.println();

        Circle cr = new Circle(10);
        System.out.println("S = " + cr.findsquare());
        cr.print();
        System.out.println("Длина окружности = " + cr.sumside());
    }
}

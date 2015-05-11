package lesson05.Task4_package;

/**
 * Написать иерархию классов «Фигуры». Фигура -> Треугольник, Прямоугольник, Круг.
 * Реализовать ф-ю отрисовки и подсчета площади для каждого типа фигуры.
 */

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 8);
        System.out.println(rec.findsquare());
        rec.print();

        Triangle tr = new Triangle(5);
        System.out.println(tr.findsquare());
        tr.print();

        Circle cr = new Circle(10);
        System.out.println(cr.findsquare());

    }

}

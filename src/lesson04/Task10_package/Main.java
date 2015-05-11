package lesson04.Task10_package;

import java.util.Scanner;

/**
 * Описать класс «Triangle». В качестве свойств возьмите длинны сторон треугольника. Реализуйте метод который будет возвращать площадь этого треугольника. Создайте несколько объектов этого класса и протестируйте их
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangle tr = new Triangle();
        System.out.println("Введите 1-ю сторону треугольника");
        tr.setSide1(scanner.nextInt());
        System.out.println("Введите 2-ю сторону треугольника");
        tr.setSide2(scanner.nextInt());
        System.out.println("Введите 3-ю сторону треугольника");
        tr.setSide3(scanner.nextInt());
        System.out.println("Площадь треугольника = " + tr.square());

        Triangle tr2 = new Triangle();
        System.out.println("Введите 1-ю сторону треугольника");
        int sd1 = scanner.nextInt();
        System.out.println("Введите 2-ю сторону треугольника");
        int sd2 = scanner.nextInt();
        System.out.println("Введите 3-ю сторону треугольника");
        int sd3 = scanner.nextInt();
        System.out.println("Площадь треугольника = " + tr2.square());
    }
}

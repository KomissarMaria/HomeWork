package lesson04.Task6_package;

import java.util.Scanner;

/**
 * Написать метод класса Rectangle, который будет возвращать площадь прямоугольника
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rec1 = new Rectangle();
        System.out.println("Площадь прямоугольника со строронами " + rec1.getHeight() + " и " + rec1.getWidth() + " равна " + rec1.square());

        Rectangle rec2 = new Rectangle();
        System.out.println("Введите высоту для второго прямоугольника:");
        rec2.setHeight(scanner.nextInt());
        System.out.println("Введите ширину для второго прямоугольника:");
        rec2.setWidth(scanner.nextInt());
        System.out.println("Площадь прямоугольника со строронами " + rec2.getHeight() + " и " + rec2.getWidth() + " равна " + rec2.square());

        Rectangle rec3 = new Rectangle();
        System.out.println("Высота третьего прямоугольника = 5, введите ширину для третьего прямоугольника:");
        rec3.setWidth(scanner.nextInt());
        System.out.println("Площадь прямоугольника со строронами " + rec3.getHeight() + " и " + rec3.getWidth() + " равна " + rec2.square());

        Rectangle rec4 = new Rectangle();
        System.out.println("Ширина четвертого прямоугольника = 10, введите высоту для четвертого прямоугольника:");
        rec4.setHeight(scanner.nextInt());
        System.out.println("Площадь прямоугольника со строронами " + rec4.getHeight() + " и " + rec4.getWidth() + " равна " + rec2.square());
    }
}

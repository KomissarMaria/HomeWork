package lesson06.Task3_package;

import java.util.Random;
import java.util.Arrays;

/**
 * Создать список из нескольких фигур (2 прямоугольника, 4 окружности и тд.). Реализовать сортировку списка по возрастанию площади фигуры
 */
public class Main {
    public static void main(String[] args) {
        Figure[] array = new Figure[10];
        Random random = new Random();

        //создаем массив фигур при помощи random
        for (int i = 0; i < 10; i++) {
            int figure = random.nextInt(3);
            switch (figure) {
                case 0:
                    array[i] = new Rectangle(random.nextInt(10), random.nextInt(20));
                    break;
                case 1:
                    array[i] = new Triangle(random.nextInt(30));
                    break;
                case 2:
                    array[i] = new Circle(random.nextInt(25));
                    break;
            }
        }

        Arrays.sort(array, new FigureComparator());
        for (Figure h : array) System.out.println(h.getSquare());
    }
}

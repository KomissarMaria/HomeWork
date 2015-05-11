package lesson04.Task7_package;

import java.util.Random;

/**
 * Написать класс, который умеет считать количество созданных объектов этого класса (подсказка: нужно прибегнуть к static)
 */
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int dl = random.nextInt(20);

        for (int i = 0; i < dl; i++) {
            Count c1 = new Count();
        }

        System.out.println("Количество созданных объектов = " + Count.amount);
    }

}

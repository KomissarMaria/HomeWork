package lesson06.Task7_package;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Придумать свое исключение, которое могло бы стать часто используемым в решениях задач.
 * Написать соответствующий класс и использующий его код
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Введите число:");
            try {
                int elem = scanner.nextInt();
                if (newelement(elem, array, i)) i++;
            } catch (MyException ex) {
                System.err.print(ex);
            }
        }
        System.out.println(Arrays.toString(array));

    }

    public static boolean newelement(int elem, int[] array, int pos) throws MyException {
        boolean rezult = false;
        if (elem > 0) {
            array[pos] = elem;
            rezult = true;
        } else {
            throw new MyException("Вы ввели 0 или отрицательное число!");
        }
        return rezult;
    }
}


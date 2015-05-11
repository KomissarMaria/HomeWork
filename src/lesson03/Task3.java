package lesson03;

import java.util.Arrays;

/**
 * Заполнить массив числами от 100 до 0
 */
public class Task3 {
    public static void main(String[] args) {

        int[] array = new int[101];

        for (int i = 100, j = 0; i >= 0 & j <= 100; i--, j++) {
            array[j] = i;
        }

        System.out.println("Вывод массива, заполненного числами от 100..0:");
        System.out.println(Arrays.toString(array));
    }
}

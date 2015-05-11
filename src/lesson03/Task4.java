package lesson03;

import java.io.*;

/**
 * Дано массив из 10 целых чисел. Вывести на экран сумму всех его элементов кроме первого и последнего
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        int sum = 0;

        System.out.println("Введите 10 целых чисел:");

        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 1; i < array.length - 1; i++) {
            sum += array[i];
        }

        System.out.println("Сумма всех элементов массива, кроме 1-го и последнего: " + sum);
    }
}

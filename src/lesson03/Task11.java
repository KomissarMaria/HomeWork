package lesson03;

import java.io.*;
import java.util.Arrays;

/**
 * Написать метод, который принимает массив чисел в качестве аргумента, увеличивает его первые 3 элемента на 1 и возвращает их сумму как результат.
 * После изменения массив и сумму надо вывести на экран
 */
public class Task11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размер массива:");
        int size = Integer.parseInt(reader.readLine());

        int[] array = new int[size];

        System.out.println("Введите " + size + " чисел:");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println(sum(array));
        System.out.println(Arrays.toString(array));
    }

    public static int sum(int[] array) {
        int summa = 0;

        for (int i = 0; i < 3; i++) {
            array[i] += 1;
            summa += array[i];
        }
        return summa;
    }
}

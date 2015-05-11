package lesson02;

import java.io.*;
import java.util.Arrays;

/**
 * 1. Задать массив целых чисел длинной 10 эл.
 * 2. Отсортировать числа в массиве
 * 3. Вывести на экран результат.
 * 4. Сделать возможность наполнения массива с клавиатуры
 */
public class Task2 {

    public static void main(String[] args) throws Exception {

        int[] arr = new int[10];
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 10 чисел:");

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(rd.readLine());
        }

        Arrays.sort(arr);
        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(arr));

    }
}

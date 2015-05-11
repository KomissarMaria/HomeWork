package lesson02;

import java.io.*;
import java.util.Arrays;

/**
 * 1. Задать массив целых чисел длинной N эл.
 * 2. Поменять 1-й и последний элемент местами.
 * 3. Вывести массив на экран.
 */
public class Task3 {

    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите длину массива:");
        int N = Integer.parseInt(rd.readLine());
        int[] arr = new int[N];
        System.out.println("Введите " + N + " чисел:");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(rd.readLine());
        }

        int tmp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = tmp;

        System.out.println("Массив после перемещения 1-го и последнего элементов:");
        System.out.println(Arrays.toString(arr));

    }

}

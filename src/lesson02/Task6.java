package lesson02;

import java.io.*;
import java.util.Arrays;

/**
 * 1. Ввести с клавиатуры массив из 10 чисел.
 * 2. Разбить его на 2 массива равной длинны.
 * 3. Отсортировать каждую из половинок и вывести их содержимое на экран.
 */
public class Task6 {

    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        System.out.println("Введите 10 чисел:");

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(rd.readLine());
        }

        System.arraycopy(arr, 0, arr1, 0, 5);
        System.arraycopy(arr, 5, arr2, 0, 5);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("1-й массив после сортировки:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("2-й массив после сортировки");
        System.out.println(Arrays.toString(arr2));
    }
}
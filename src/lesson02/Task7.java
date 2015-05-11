package lesson02;

import java.io.*;
import java.util.Arrays;

/**
 * Среднее арифметическое элементов массива
 */
public class Task7 {

    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину массива:");

        int N = Integer.parseInt(rd.readLine());
        int[] arr = new int[N];
        double sa;
        int sum = 0;

        System.out.println("Введите " + N + " чисел:");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(rd.readLine());
            sum += arr[i];
        }

        System.out.println("Среднее афирметическое элементов массива: " + (double) sum / N);
    }
}

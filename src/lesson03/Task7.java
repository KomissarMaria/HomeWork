package lesson03;

import java.io.*;
import java.util.Arrays;

/**
 * Написать метод, который заполнит массив произвольного размера числами по возрастанию, начиная с центра массива, например, [5,4,3,2,1,0,1,2,3,4,5] для N = 6
 */
public class Task7 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите целое число:");
        int N = Integer.parseInt(reader.readLine());

        int size = N * 2 - 1;
        int[] array = new int[size];

        for (int i = 0; i < N; i++) {
            array[i] = N - 1 - i;
            array[size - 1 - i] = N - 1 - i;
        }

        System.out.println(Arrays.toString(array));

    }
}

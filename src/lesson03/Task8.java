package lesson03;

import java.io.*;
import java.util.Arrays;

/**
 * Найти в массиве число, которое повторяется наибольшее количество раз, не применяя сортировку
 */
public class Task8 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размер массива:");
        int size = Integer.parseInt(reader.readLine());

        int[] array = new int[size];

        System.out.println("Введите " + size + " чисел");

        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int number = array[1], amount = 0;

        for (int i = 0; i < size; i++) {
            int amt = 1;
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j])
                    amt++;
            }
            if (amt > amount) {
                amount = amt;
                number = array[i];
            }
        }
        System.out.println("Число, которое повторяется наибольшее количество раз: " + number);
    }
}

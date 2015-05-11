package lesson02;

import java.io.*;

/**
 * Написать программу, которая позволит задать длину массива с клавиатуры, наполнить его элементами, а затем выводить нужный элемент по его индексу на консоль
 */
public class Task9 {

    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите длину массива:");

        int N = Integer.parseInt(rd.readLine());
        int[] arr = new int[N];

        System.out.println("Введите " + N + " чисел:");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(rd.readLine());
        }

        while (true) {
            System.out.println("Введите индекс элемента массива или 'end' для окончания работы программы");
            String st = rd.readLine();

            if (st.equals("end") == true)
                break;

            try {
                int index = Integer.parseInt(st);
                if (index > -1 & index < N) {
                    System.out.println(index + "-й элемент массива: " + arr[index]);
                } else
                    System.out.println("Данные индекс выходит за границы массива!");
            } catch (NumberFormatException e) {
                System.err.println("Неверный формат индекса массива!");
            }
        }
    }

}

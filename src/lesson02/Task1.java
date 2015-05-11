package lesson02;

import java.io.*;

/**
 * Упражнение «Конкатенация строк»
 * a) Прочитать 3 строки в переменные s1, s2, s3
 * b) Вывести на экран конкатенацию:
 * 1. S1 + s3
 * 2. S3 + s2 + s1
 * 3. S1 + s2 + s3
 */
public class Task1 {

    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 3 строки:");

        String s1 = rd.readLine();
        String s2 = rd.readLine();
        String s3 = rd.readLine();

        System.out.println("Строка 1 + Строка 2:   " + s1 + s3);
        System.out.println("Строка 3 + Строка 2 + Строка 1:   " + s3 + s2 + s1);
        System.out.println("Строка 1 + Строка 2 + Строка 3:   " + s1 + s2 + s3);

    }
}

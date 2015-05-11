package lesson03;

import java.io.*;

/**
 * Реализовать метод, который принимает в качестве аргументов одну строку a, целое число b и число с плавающей точкой c и возвращает как результат строку в виде: s = a + b + c.
 * Какого типа данных будут аргументы, и какой тип следует выбрать для возвращаемого значения?
 */
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку:");
        String a = reader.readLine();

        System.out.println("Введите целое число:");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Введите число c плавающей запятой:");
        double c = Double.parseDouble(reader.readLine());

        System.out.println(sum(a, b, c));
    }

    public static String sum(String a, int b, double c) {
        String str = a + b + c;
        return str;
    }
}

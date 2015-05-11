package lesson03;

import java.io.*;

/**
 * Модифицировать задачу про «калькулятор» так, чтобы каждое математическое действие выполнялось в отдельном методе (add, sub, mul etc.)
 */
public class Task6 {
    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 2 числа:");

        int number1 = Integer.parseInt(rd.readLine());
        int number2 = Integer.parseInt(rd.readLine());

        System.out.println("Сумма чисел: " + number1 + " + " + number2 + " = " + add(number1, number2));
        System.out.println("Разность чисел: " + number1 + " - " + number2 + " = " + sub(number1, number2));
        System.out.println("Разность чисел " + number2 + " - " + number1 + " = " + sub(number2, number1));
        System.out.println("Произведение чисел: " + number2 + " * " + number1 + " = " + mul(number2, number1));
        System.out.println("Частное чисел: " + number1 + " / " + number2 + " = " + div(number1, number2));
        System.out.println("Частное чисел: " + number2 + " / " + number1 + " = " + div(number2, number1));

    }

    public static int add(int number1, int number2) {
        return (number1 + number2);
    }

    public static int sub(int number1, int number2) {
        return (number1 - number2);
    }

    public static int mul(int number1, int number2) {
        return (number1 * number2);
    }

    public static double div(int number1, int number2) {
        return (number1 / number2);
    }
}

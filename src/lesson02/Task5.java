package lesson02;

import java.io.*;

/** Упражнение «Калькулятор Четырех Операций»
 * a) Прочитать с консоли число 1
 * b) Прочитать с консоли число 2
 * c) Вывести сумму, разность, произведение и частное введенных чисел.
 */
public class Task5 {

    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 2 числа:");

        int number1 = Integer.parseInt(rd.readLine());
        int number2 = Integer.parseInt(rd.readLine());

        System.out.println("Сумма чисел: " + number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println("Разность чисел: " + number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println("Разность чисел " + number2 + " - " + number1 + " = " + (number2 - number1));
        System.out.println("Произведение чисел: " + number2 + " * " + number1 + " = " + (number2 * number1));
        System.out.println("Частное чисел: " + number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println("Частное чисел: " + number2 + " / " + number1 + " = " + (number2 / number1));

    }
}

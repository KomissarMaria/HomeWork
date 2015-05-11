package lesson06;

import java.util.Random;
import java.util.Scanner;

/**
 * Продемонстрировать бросание и обработку исключений: ArithmeticException, ClassCastException, IndexOutOfBoundsException, NullPointerException.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Object cat = null;
        int[] array = {-2, -1, 0};
        int end = 0;

        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println(number + " / array[" + i + "] = " + number / array[i]);
            } catch (ArithmeticException ex) {
                System.out.println("Деление на 0!");
            }
        }

        while (true) {
            System.out.println("Введите код символа: ");
            int pos = scanner.nextInt();
            char s1 = (char) pos;
            Object sym = new Character(s1);
            try {
                System.out.println("Символ " + sym + " 'это - " + (Byte) sym);
            } catch (ClassCastException ex) {
                System.out.println("Символ " + s1 + " не возможно преобразовать в тип byte");
                break;
            }
        }

        while (true && end < 5) {
            int i = random.nextInt(4);
            end++;
            try {
                System.out.println("array[" + i + "] = " + array[i]);
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Выход за границы массива!");
                break;
            }
        }

        try {
            if (cat.equals("null")) System.out.println("Hello, cat");
        } catch (NullPointerException ex) {
            System.out.println("Объект = null!");
        }
    }
}

package lesson06;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Найти в стандартной библиотеке 3 метода, бросающих исключения.
 * Написать код, создающий ситуацию при которой методы генерируют исключения и продемонстрировать их обработку
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int times = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arraycopy = new int[array.length];

        while (true && times < 5) {
            System.out.println("Введите строку для преобразования в целое число:");
            String stroka = scanner.nextLine();
            try {
                int num = Integer.parseInt(stroka);
                System.out.println("Строка преобрзована в число:)");
                times++;
            } catch (Exception ex) {
                System.out.println("Вы ввели строку или дробное число!");
                break;
            }
        }

        System.out.println("--------------------------------------------------");

        times = 0;
        while (true && times < 5) {
            try {
                System.out.println("Введите целое число:");
                int stroka = scanner.nextInt();
                times++;
            } catch (Exception ex) {
                System.out.println("Вы ввели строку или дробное число!");
                break;
            }
        }

        System.out.println("--------------------------------------------------");

        times = 0;
        while (true && times < 5) {
            try {
                int num = random.nextInt(array.length * 2);
                // Arrays.copyOf(array,0,arraycopy,num);
                System.arraycopy(array, 0, arraycopy, 0, num);
                System.out.println("Копия массива N" + times + " - " + Arrays.toString(arraycopy));
                times++;
            } catch (Exception ex) {
                System.out.println("Не удалось скопировать массив " + Arrays.toString(array));
                break;
            }
        }

    }
}

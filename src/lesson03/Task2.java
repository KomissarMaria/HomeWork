package lesson03;

/**
 * Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Числа, которые делятся на 3 без остатка в диапазоне от 1 до 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }
    }
}

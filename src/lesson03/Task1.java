package lesson03;

/**
 * Вывести на экран числа от 10 до 20 с помощью всех известных циклов
 */
public class Task1 {
    public static void main(String[] args) {

        System.out.println("Вывод через цикл for:");
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("Вывод через цикл while:");
        int i = 10;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }

        System.out.println("Вывод через цикл do-while:");
        int j = 10;
        do {
            System.out.println(j);
            j++;
        } while (j <= 20);

        System.out.println("Вывод через цикл for-each:");
        int[] array = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int x : array)
            System.out.println(x);

        System.out.println("Вывод через цикл while с оператором break:");
        int k = 10;
        while (true) {
            System.out.println(k);
            k++;
            if (k == 21)
                break;
        }
    }
}

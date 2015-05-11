package lesson13;

import java.util.ArrayList;

/**
 * Написать метод для конвертации массива строк или чисел в список
 */
public class Task1 {
    public static void main(String[] args) {
        String[] arrayString = {"hello", "good morning", "hi", "good evening", "good night"};
        Integer[] arrayInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<String> listString = convert(arrayString);
        System.out.println(listString.toString());
        ArrayList<Integer> listInteger = convert(arrayInteger);
        System.out.println(listInteger.toString());
    }

    public static <E> ArrayList<E> convert(E[] array) {
        ArrayList<E> list = new ArrayList<E>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }
}

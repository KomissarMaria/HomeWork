package lesson02;

import java.util.Arrays;

/**
 * Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1)
 */
public class Task8 {

    public static void main(String[] args) throws Exception {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int dl = arr.length, tmp;

        for (int i = 0; i < dl / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[dl - 1 - i];
            arr[dl - 1 - i] = tmp;
        }

        System.out.println("Массив после зеркального переворота: " + Arrays.toString(arr));
    }

}

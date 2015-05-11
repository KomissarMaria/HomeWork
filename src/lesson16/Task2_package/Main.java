package lesson16.Task2_package;

/**
 * Написать код для многопоточного подсчета суммы элементов массива целых чисел. Сравнить скорость подсчета с простым алгоритмом.
 */
public class Main {

    public static void main(String[] args) {
        int N = 80000000;
        ArrayClass arrayClass = new ArrayClass(N);
        long start = System.currentTimeMillis();
        int sum = arrayClass.sumofarray();
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения обычным способом = " + (finish - start) + " мс, результат = " + sum);

        long start1 = System.currentTimeMillis();
        Start(N, arrayClass);
        long finish1 = System.currentTimeMillis();
        System.out.println("Время выполнения с помощью потоков = " + (finish1 - start1) + " мс, результат = " + arrayClass.sum);
    }

    public static void Start(int N, ArrayClass arrayclass) {
        int numbers = arrayclass.array.length / 4;
        int pos = 0;
        int nextpos = numbers;
        SumThread[] tr = new SumThread[4];
        for (int i = 0; i < tr.length; i++) {
            tr[i] = new SumThread(pos, nextpos, arrayclass);
            tr[i].start();
            pos += numbers;
            if (i == 2) nextpos = arrayclass.array.length;
            else nextpos += numbers;
        }
        for (int i = 0; i < tr.length; i++) {
            try {
                tr[i].join();
            } catch (InterruptedException e) {
            }
        }
    }
}

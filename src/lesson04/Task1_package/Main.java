package lesson04.Task1_package;

/**
 * Написать класс MaxBox с полем экземпляра для хранения одного целого числа
 */
public class Main {
    public static void main(String[] args) {
        MaxBox box = new MaxBox();

        box.setA(10);
        System.out.println(box.getA());
    }
}


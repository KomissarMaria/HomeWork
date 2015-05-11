package lesson04.Task2_package;

/**
 * Модифицировать класс так, чтобы в объект этого класса можно было сохранить только неотрицательное число, причем при попытках последующего сохранения различных чисел, объект запоминал и возвращал только наибольшее из них
 */
public class Main {
    public static void main(String[] args) {
        MaxBox box = new MaxBox();

        box.setA(10);
        box.setA(-30);
        System.out.println("Значение поля а = " + box.getA());

        box.setA(2);
        box.setA(-50);
        System.out.println("Значение поля а = " + box.getA());

        box.setA(100);
        box.setA(140);
        box.setA(-1000);
        System.out.println("Значение поля а = " + box.getA());
    }
}



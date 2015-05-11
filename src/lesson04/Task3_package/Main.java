package lesson04.Task3_package;

/**
 * Добавить в класс константу MAX_VALUE = 1024, при попытке сохранить в объект число, превышающее MAX_VALUE, сохранять значение равное MAX_VALUE
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
        box.setA(1025);
        System.out.println("Значение поля а = " + box.getA());

        box.setA(140);
        box.setA(-1000);
        System.out.println("Значение поля а = " + box.getA());
    }
}


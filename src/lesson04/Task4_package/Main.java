package lesson04.Task4_package;

/**
 * Модифицировать класс так, чтобы объект этого класса было невозможно создать с помощью операции new в коде другого класса (сделать конструктор приватным), т.е. при попытке создать объект происходит ошибка компиляции:
 * MaxBox box = new MaxBox(); Error: private access ...
 * Вместо этого, для создания объекта использовать метод самого класса (метод должен создавать и возвращать объект):
 * MaxBox box = MaxBox.newInstance();
 */
public class Main {
    public static void main(String[] args) {
        MaxBox box = MaxBox.newInstance();

        box.setA(10);
        box.setA(-30);
        System.out.println("Значение поля а = " + box.getA());

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



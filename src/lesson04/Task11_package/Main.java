package lesson04.Task11_package;

/**
 * Описать класс «Cat» (в качестве образца можно взять домашнего питомца). Наделить его свойствами и методами. Создать несколько экземпляров объектов этого класса. Использовать эти объекты
 */
public class Main {
    public static void main(String[] args) {
        Cat dog = new Cat("Жучка", 7, "собака");
        dog.aboutCat();
        dog.say();

        Cat cat = new Cat("Мурчик", 3, "черный", 5, "кот");
        cat.aboutCat();
        cat.say();

        Cat mouse = new Cat("Хомка", 1, "серая", "мышь");
        mouse.aboutCat();
        mouse.say();
    }
}


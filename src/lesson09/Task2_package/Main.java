package lesson09.Task2_package;

/**
 * Написать класс «человек». Реализовать его методы clone, equals, hashCode, toString
 */

public class Main {
    public static void main(String[] args) {
        Human man = new Human("man", "Dima", 29);
        Human man1 = new Human("man", "Dima", 29);
        Human man2 = new Human("man", "Dima", 30);

        System.out.println(man.toString());
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println("------------------------");

        System.out.println("HashCode man " + man.hashCode());
        System.out.println("HashCode man1 " + man1.hashCode());
        System.out.println("HashCode man2 " + man2.hashCode());
        System.out.println("------------------------");

        System.out.println("Man equals man1 = " + man.equals(man1));
        System.out.println("Man equals man2 = " + man.equals(man2));
        System.out.println("Man1 equals man2 = " + man1.equals(man2));
        System.out.println("------------------------");

        Human woman = new Human("woman", "Nadia", 29);
        System.out.println(woman.toString());
        System.out.println(woman.hashCode());
        System.out.println("------------------------");


        try {
            Human woman1 = (Human) woman.clone();
            System.out.println("Clone of woman - " + woman1.toString());
            System.out.println("HashCode clone woman " + woman1.hashCode());
            System.out.println("Woman equals clone woman = " + woman.equals(woman1));

        } catch (CloneNotSupportedException e) {
            System.out.println("error");
        }

    }
}

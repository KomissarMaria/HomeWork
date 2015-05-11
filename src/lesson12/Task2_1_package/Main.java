package lesson12.Task2_1_package;

import java.util.Arrays;

/**
 * Добавить в класс «человек» константы: пол, темперамент
 */
public class Main {
    public static void main(String[] args) {
        Human[] list = {new Human(7, Sex.man, Temperament.choleric), new Human(40, Sex.woman, Temperament.melancholiac), new Human(60, Sex.woman, Temperament.sanguine), new Human(20, Sex.man, Temperament.phlegmatic)};
        Arrays.sort(list, new HumanComparator());
        for (Human h : list) System.out.println(h.getAge());

    }
}

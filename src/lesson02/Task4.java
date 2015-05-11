package lesson02;

/**
 * Скорость первого автомобиля 50 км/ч, второго — 30 км/ч, расстояние между ними 80 км.
 * Какое расстояние (вывести на экран) будет между ними через t ч, если автомобили движутся в разные стороны?
 * Переменные и константа t (любое значение) задаются литералами в коде. Формула: s1=s+(v1+v2)t
 */
public class Task4 {

    public static void main(String[] args) {

        final int PERIOD = 6;
        int speed1 = 50, speed2 = 80, distance;

        distance = 80 + (speed1 + speed2) * PERIOD;
        System.out.println("Расстояние между автомобилями через " + PERIOD + " часов будет " + distance + " км.");

    }
}

package lesson04.Task9_package;

import java.util.Scanner;

/**
 * Описать класс «Vector3D» (т.е. он должен описывать вектор в 3-х мерной, декартовой системе координат). В качестве свойств этого класса возьмите координаты вектора. Для этого класса реализовать методы сложения, и скалярного и векторного произведения векторов. Создайте несколько объектов этого класса и протестируйте их
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            Vector3D vectorA = new Vector3D();
            vector(vectorA, "A:");

            Vector3D vectorB = new Vector3D();
            vector(vectorB, "B:");

            System.out.println("А + В = " + vectorA.sum(vectorA, vectorB));
            System.out.println("Скалярное произведение А * В = " + vectorA.scalarmul(vectorA, vectorB));
            System.out.println("Векторное произведение А * В = " + vectorA.vectormul(vectorA, vectorB));
            System.out.println();
        }
    }

    public static Vector3D vector(Vector3D vectorA, String sym) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты x,y,z для вектора " + sym);
        vectorA.setX(scanner.nextInt());
        vectorA.setY(scanner.nextInt());
        vectorA.setZ(scanner.nextInt());

        return vectorA;
    }
}

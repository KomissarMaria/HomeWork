package lesson09.Task3_package;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Придумать свой класс и набор объектов этого класса.
 * Реализовать консольные операции над набором объектов по их номеру: сравнение двух, клонирование, сортировка.
 */
public class Main {
    public static void main(String[] args) {
        MyClass[] array = {new MyClass(MyClass.CPU.Intel_Core_i5, 8, "Sony", 17.1), new MyClass(MyClass.CPU.Intel_Core_i7, 16, "Apple", 13.3), new MyClass(MyClass.CPU.Intel_Core_i3, 16, "Acer", 15.6), new MyClass(MyClass.CPU.Intel_Core_i3, 4, "HP", 15.6), new MyClass(MyClass.CPU.AMD_A4, 4, "Asus", 10.1)};
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("_____________________________________________");

        UserCommand cmd;

        while (!"".equals((cmd = obtainCommand(scanner)).getName())) {
            switch (cmd.getName()) {
                case "exit":
                    return;
                case "compare":
                    int idfirst = Integer.valueOf(cmd.getParam(0));
                    int idsecond = Integer.valueOf(cmd.getParam(1));
                    System.out.println("Сompare " + array[idfirst] + " to the " + array[idsecond] + " -> " + array[idfirst].equals(array[idsecond]));
                    System.out.println("_____________________________________________");
                    break;
                case "clone":
                    int idclone = Integer.valueOf(cmd.getParam(0));
                    try {
                        MyClass cl = (MyClass) array[idclone].clone();
                        System.out.println("Clone is: " + cl);
                        System.out.println("_____________________________________________");
                    } catch (CloneNotSupportedException e) {
                        System.out.println("Error!");
                    }
                    break;
                case "sort":
                    Arrays.sort(array, new MyClassComparator());
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }
                    System.out.println("_____________________________________________");
                    break;
                default:
                    System.out.println("Input mismatch, please try again");
            }
            //cmd, processing
        }
    }

    private static UserCommand obtainCommand(Scanner sc) {
        // System.out.println("Please enter the command you would like to execute");
        return new UserCommand(sc.nextLine().trim());
    }

}

package lesson12.Task3_package;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Реализовать возможность сериализации для класса «человек»
 */
public class Main {
    public static void main(String[] args) {
        String foldername = input("Введите папку, в которую сохраниться файл с объектом:");
        String fname = foldername + "Human";

        Human Dmitry = new Human(7, Sex.man, Temperament.choleric);
        System.out.println("Объект создан : " + Dmitry.toString());
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(fname);
            out = new ObjectOutputStream(fos);
            out.writeObject(Dmitry);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        FileInputStream fos1 = null;
        ObjectInputStream out1 = null;
        Human DmitryHuman = null;
        try {
            fos1 = new FileInputStream(fname);
            out1 = new ObjectInputStream(fos1);
            DmitryHuman = (Human) out1.readObject();
            out1.close();
        } catch (IOException ex) {
        } catch (ClassNotFoundException e) {
        }
        System.out.println("Объект восстановлен из файла : " + DmitryHuman.toString());
    }

    public static String input(String zamena) {
        Scanner scanner = new Scanner(System.in);
        String inputdir, inputdirnew;
        while (true) {
            System.out.println(zamena);
            inputdir = scanner.nextLine();
            File dirf = new File(inputdir);
            if (dirf.exists()) break;
            else System.out.println("Такого каталога не существует!");
        }
        inputdirnew = (inputdir.lastIndexOf('/') != inputdir.length()) ? inputdir + '/' : inputdir;
        return inputdirnew;
    }

}

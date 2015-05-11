package lesson10.Task4_package;

import java.io.File;
import java.util.Scanner;

/**
 * Добавить в проект ф-ю мониторинга более одного файла
 */
public class Main {
    public static void main(String[] args) {
        String foler = input("Введите каталог, в котором ожидается создание файлов");

        Scanner scanner = new Scanner(System.in);
        String[] list = new String[3];

        System.out.println("Введите 3 имени файла для мониторинга");
        for (int i = 0; i < list.length; i++) {
            list[i] = foler + scanner.nextLine();
        }

        Monitor m = new Monitor(list, new FileEvent());
        m.start();
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
package lesson10.Delete_from_TaskList.Task8_package;

import java.io.File;
import java.util.Scanner;

/**
 * Монитор ждет пока указанный файл будет создан,
 * после чего выполнение завершается.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла:");
        String filename = scanner.nextLine();
        String foler = input("Введите каталог, в котором ожидается создание файла");
        Monitor m = new Monitor(foler + filename, new FileEvent());
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

package lesson10.Task6_package;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Написать код для мониторинга каталога. Выводить на экран предупреждение если в каталог добавляется текстовый файл (*.txt).
 */
public class Main {
    public static void main(String[] args) {
        try {
            String folder = input("Введите каталог для мониторинга:");
            Monitor m = new Monitor(folder, new FileEvent(), ".txt");
            m.start();
        } catch (IOException s) {
        }
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

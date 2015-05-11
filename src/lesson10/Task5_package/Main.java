package lesson10.Task5_package;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Модифицировать проект FindFiles так, чтобы программа искала в каталоге все файлы с расширениями из списка.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] FileExtension = new String[5];

        System.out.println("Введите 5 расширений для файлов в виде: '.txt' и т.д:");
        for (int i = 0; i < FileExtension.length; i++) {
            FileExtension[i] = scanner.nextLine();
        }

        String folder = input("Введите каталог, в котором нужно искать файлы с расширениями из списка");
        for (int i = 0; i < FileExtension.length; i++) {
            ArrayList<String> list = new ArrayList<String>();
            try {
                findFiles(folder, FileExtension[i], list);
            } catch (IOException ex) {
            }
            for (String s : list) System.out.println(s);
        }
    }

    private static void findFiles(String srcPath, String ext, ArrayList<String> list) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles(new MyFileFilter(ext));
        for (int i = 0; i < files.length; i++) {
            list.add(srcPath + files[i].getName());
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

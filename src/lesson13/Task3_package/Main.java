package lesson13.Task3_package;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/**
 * Написать ф-ю, которая сохранит содержимое каталога в список и выведет первые 5 элементов на экран.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String dirfrom = input("Введите католог, из которого нужно выгрузить папки/файлы:");
        ArrayList<String> list = new ArrayList<String>();
        findFiles(dirfrom, list);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
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
        inputdirnew = (inputdir.lastIndexOf('/') != inputdir.length() - 1) ? inputdir + '/' : inputdir;
        return inputdirnew;
    }

    private static void findFiles(String srcPath, ArrayList<String> fileslist) throws Exception {
        File dir = new File(srcPath);
        File[] filesDirectories = dir.listFiles(new MyFileFilter(true));
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (!files[i].getCanonicalPath().contains(".DS_Store")) { //проверка только для MacOs, потому как при создании папки создается файл  .DS_Stor из за которого вылетает прога
                fileslist.add(files[i].getCanonicalPath());
            }
        }
        for (int i = 0; i < filesDirectories.length; i++) {
            if (!filesDirectories[i].getCanonicalPath().contains(".DS_Store")) { //проверка только для MacOs, потому как при создании папки создается файл  .DS_Stor из за которого вылетает прога
                String newsrcPath = filesDirectories[i] + "/";
                findFiles(newsrcPath, fileslist);
            }
        }
    }
}

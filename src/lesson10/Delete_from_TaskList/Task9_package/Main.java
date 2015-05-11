package lesson10.Delete_from_TaskList.Task9_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Написать программу для копирования всех файлов из одного каталога в другой.
 */
public class Main {
    public static void main(String[] args) throws IOException, Exception {
        String dirfrom = input(" из которого ");
        String dirto = input(" в ");
        findFiles(dirfrom, dirto);
    }

    public static String input(String zamena) {
        Scanner scanner = new Scanner(System.in);
        String inputdir, inputdirnew;
        while (true) {
            System.out.println("Введите католог" + zamena + "нужно скопировать файлы:");
            inputdir = scanner.nextLine();
            File dirf = new File(inputdir);
            if (dirf.exists()) break;
            else System.out.println("Такого каталога не существует!");
        }
        inputdirnew = (inputdir.lastIndexOf('/') != inputdir.length()) ? inputdir + '/' : inputdir;
        return inputdirnew;
    }

    public static void copyFile2(String src, String dest) throws Exception {
        String text = "";
        RandomAccessFile in = new RandomAccessFile(src, "r");
        try {
            RandomAccessFile out = new RandomAccessFile(dest, "rw");
            try {
                int b = in.read();
                while (b != -1) {
                    text += (char) b;
                    b = in.read();
                }
                out.seek(0);
                out.write(text.getBytes());
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

    private static void findFiles(String srcPath, String srcPathto) throws IOException, FileNotFoundException, Exception {
        File dir = new File(srcPath);
        File[] filesDirectories = dir.listFiles(new MyFileFilter(true));
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (!files[i].getCanonicalPath().contains(".DS_Store")) { //проверка только для MacOs, потому как при создании папки создается файл  .DS_Stor из за которого вылетает прога
                if (files[i].isDirectory()) {
                    int pos = files[i].getCanonicalPath().lastIndexOf('/');
                    String name = files[i].getCanonicalPath().substring(pos + 1, files[i].getCanonicalPath().length());
                    String filename = srcPathto + name;
                    File dirto = new File(filename);
                    dirto.mkdir();
                } else {
                    int pos = files[i].getCanonicalPath().lastIndexOf('/');
                    String name = files[i].getCanonicalPath().substring(pos + 1, files[i].getCanonicalPath().length());
                    String filename = srcPathto + name;
                    copyFile2(files[i].getCanonicalPath(), filename);
                }
            }
        }
        for (int i = 0; i < filesDirectories.length; i++) {
            if (!filesDirectories[i].getCanonicalPath().contains(".DS_Store")) { //проверка только для MacOs, потому как при создании папки создается файл  .DS_Stor из за которого вылетает прога
                int pos = filesDirectories[i].getCanonicalPath().lastIndexOf('/');
                String name = filesDirectories[i].getCanonicalPath().substring(pos + 1, filesDirectories[i].getCanonicalPath().length());
                String filename = srcPathto + name;
                String newsrcPath = filesDirectories[i] + "/";
                String newsrcPathto = filename + "/";
                findFiles(newsrcPath, newsrcPathto);
            }
        }
    }
}

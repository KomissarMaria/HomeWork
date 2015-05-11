package lesson11.Task1_package;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Написать программу, которая создаст текстовый файл и запишет в него список файлов (путь, имя, дата создания) из заданного каталога.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название создаваемого файла:");
        String name = scanner.nextLine();
        String Namedir = input("Введите каталог для поиска файлов:");
        String text = "";
        FileOutputStream os = new FileOutputStream(Namedir + name);
        String forwrite = findFiles(Namedir, text);
        try {
            os.write(forwrite.getBytes());
        } catch (IOException e) {
        } finally {
            os.close();
        }
    }

    private static String findFiles(String srcPath, String text) throws IOException, FileNotFoundException {
        File dir = new File(srcPath);
        File[] filesDirectories = dir.listFiles(new MyFileFilter(true));
        File[] files = dir.listFiles();
        boolean stop = false;
        if (files.length == 0)
            for (int i = 0; i < files.length; i++) {
                SimpleDateFormat sdf = new SimpleDateFormat("d/MM/yyyy hh:mm:ss");
                text += files[i].getCanonicalPath() + " date of create " + sdf.format(new Date(files[i].lastModified())) + "\n";
            }
        for (int i = 0; i < filesDirectories.length; i++) {
            String newsrcPath = filesDirectories[i] + "/";
            text = findFiles(newsrcPath, text);
        }
        return text;
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

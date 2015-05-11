package lesson15.Task5_package;

import java.io.*;
import java.util.Scanner;

/**
 * Копирование файла блоками (1 поток на блок).
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String filetocopy = input("Введите файл, который необходимо скопировать");
        String newfile = filetocopy.substring(0, filetocopy.lastIndexOf('.')) + "Copy" + filetocopy.substring(filetocopy.lastIndexOf('.'), filetocopy.length());
        CopyFile copyofFile = new CopyFile(filetocopy, newfile);
        copyofFile.Copy();
    }

    public static String input(String zamena) {
        Scanner scanner = new Scanner(System.in);
        String inputfile;
        while (true) {
            System.out.println(zamena);
            inputfile = scanner.nextLine();
            File file = new File(inputfile);
            if (file.exists()) break;
            else System.out.println("Такого файла не существует!");
        }
        return inputfile;
    }
}

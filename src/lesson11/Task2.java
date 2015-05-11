package lesson11;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.util.Scanner;

/**
 * Разобраться с java.io.BufferedInputStream и java.io. BufferedOutputStream. Подумать как улучшить программу No3 с помощью этих классов.
 */
public class Task2 {
    public static void main(String[] args) {
        try {
            String filefrom = input("Введите файл, который нужно скопировать:", false);
            String fileto = input("Введите имя нового файла:", true);
            copyFile(filefrom, fileto);
        } catch (Exception e) {
            System.out.println("Не удалось скопировать файл!");
        }

    }

    public static void copyFile(String src, String dest) throws Exception {
        InputStream from = new BufferedInputStream(new FileInputStream(src));
        OutputStream to = new BufferedOutputStream((new FileOutputStream(dest)));
        byte[] buf = new byte[1024];
        int r = 0;
        while ((r = from.read(buf)) != -1) {
            to.write(buf, 0, r);
        }
        from.close();
        to.close();
    }

    public static String input(String zamena, boolean newfile) {
        Scanner scanner = new Scanner(System.in);
        String inputfile;
        while (true) {
            System.out.println(zamena);
            inputfile = scanner.nextLine();
            File filef = new File(inputfile);
            if ((filef.exists() && !newfile) || newfile) break;
            else System.out.println("Такого файла не существует!");
        }
        return inputfile;
    }

}

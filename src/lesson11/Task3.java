package lesson11;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

/**
 * Написать программу, которая скопирует несколько файлов в один. Подумать как для этого использовать java.io.SequenceInputStream.
 */
public class Task3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Vector<InputStream> inputStreams = new Vector<InputStream>();
        FileOutputStream rez = new FileOutputStream(input("Введите имя файла, в который необходимо скопировать несколько файлов:", true));

        for (int i = 0; i < 3; i++) {
            String namefile = input("Введите имя файла, который необходимо скопировать:", false);
            FileInputStream f = new FileInputStream(namefile);
            inputStreams.add(f);
        }

        SequenceInputStream sis = new SequenceInputStream(inputStreams.elements());
        int b;
        while (true) {
            b = sis.read();
            if (b == -1)
                break;
            rez.write(b);
        }
        sis.close();
        rez.close();
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

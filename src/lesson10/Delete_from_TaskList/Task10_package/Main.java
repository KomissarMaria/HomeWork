package Task2_FindHello_package;
/**
 * Написать программу, которая считает текстовый файл, заменит в нем все слова “Hello” на “1234” и запишет изменения в тот-же файл
*/
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "";
        String filename = input("Введите полное имя файла для замены Hello на 1234");
        try {
            RandomAccessFile in = new RandomAccessFile(filename, "rw");
            try {
                int b = in.read();
                // побитово читаем символы и плюсуем их в строку
                while (b != -1) {
                    text = text + (char) b;
                    b = in.read();
                }
                text = text.replace("hello","1234");
                in.seek(0);
                in.write(text.getBytes());
            } finally {
                in.close();
            }
        } catch (Exception ex) {
        }
    }

    public static String input(String zamena) {
        Scanner scanner = new Scanner(System.in);
        String inputfile;
        while (true) {
            System.out.println(zamena);
            inputfile = scanner.nextLine();
            File fl = new File(inputfile);
            if (fl.exists()) break;
            else System.out.println("Такого файла не существует!");
        }
        return inputfile;
    }

}

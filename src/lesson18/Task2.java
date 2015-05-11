package lesson18;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Скачать все HTML файлы, доступные по ссылкам в отдельный каталог.
 */
public class Task2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path = input("Введите папку для сохранения файлов:");
        System.out.println("Введите ссылку:");
        StringBuilder HTMLStr = HTMLDoc(scanner.nextLine(), path + "OurLinks.html");
        ArrayList<String> massiv = new ArrayList<>();
        findlinks(HTMLStr, massiv);
        savedocs(massiv, path);
    }

    private static void findlinks(StringBuilder file, ArrayList<String> massiv) {
        Pattern p = Pattern.compile("http://[a-zA-Z0-9.]*");
        Matcher m = p.matcher(file);
        while (m.find()) {
            String ref = m.group();
            massiv.add(ref);
        }
    }

    private static StringBuilder HTMLDoc(String urladress, String filename) throws Exception {
        String HTMLString;
        URL url = new URL(urladress);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000];
            int r;
            do {
                if ((r = br.read(buf)) > 0)
                    sb.append(new String(buf, 0, r));
            } while (r > 0);
            HTMLString = sb.toString();
            try (FileOutputStream fos = new FileOutputStream(filename)) {
                fos.write(HTMLString.getBytes());
            }
        } finally {
            http.disconnect();
        }
        return sb;
    }

    private static String input(String zamena) {
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

    private static void savedocs(ArrayList<String> massiv, String path) throws Exception {
        for (String elem : massiv) {
            try {
                StringBuilder newdoc = HTMLDoc(elem, newName(elem, path));
            } catch (IOException ex) {
                System.out.println("Не удалось скачать файл по ссылке: " + elem);
            }
        }
    }


    private static String newName(String elem, String path) {
        String newnamewithpath;
        String namenew = "";
        if (elem.startsWith("http://")) {
            if (elem.startsWith("http://")) namenew = elem.substring(7, elem.length());
        } else namenew = elem;
        String end = (namenew.endsWith(".html")) ? "" : ".html";
        newnamewithpath = path + namenew + end;

        return newnamewithpath;
    }

}

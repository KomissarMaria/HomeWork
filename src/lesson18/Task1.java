package lesson18;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Вывести на экран все ссылки, которые содержатся в скачанном HTML документе.
 */

public class Task1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ссылку:");
        StringBuilder HTMLStr = HTMLDoc(scanner.nextLine());
        findandprint(HTMLStr);
    }

    public static void findandprint(StringBuilder file) {
        Pattern p = Pattern.compile("http://[a-zA-Z0-9.]*");
        Matcher m = p.matcher(file);
        while (m.find()) {
            String ref = m.group();
            System.out.println(ref);
        }
    }

    public static StringBuilder HTMLDoc(String urladress) throws Exception {
        URL url = new URL(urladress);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        StringBuilder HTMLString = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000];
            int r;
            do {
                if ((r = br.read(buf)) > 0)
                    HTMLString.append(new String(buf, 0, r));
            } while (r > 0);
        } finally {
            http.disconnect();
        }
        return HTMLString;
    }
}

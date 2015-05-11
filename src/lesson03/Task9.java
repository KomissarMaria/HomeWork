package lesson03;

import java.io.*;

/**
 * С помощью консоли пользователь вводит математическое выражение типа “1+33-4*7”.
 * Написать программу для подсчета его значения. Приоритет операций не учитывается
 */
public class Task9 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите математическое выражение:");
        String str = reader.readLine();

        char[] stroka = str.toCharArray();
        double rezult = 0.0, number;
        int i = 0;
        String strnum;

        while (i < stroka.length) {
            switch (stroka[i]) {
                case '+':
                    strnum = findnumber(stroka, i + 1);
                    number = Double.parseDouble(strnum);
                    rezult += number;
                    i += strnum.length() + 1;
                    break;
                case '-':
                    strnum = findnumber(stroka, i + 1);
                    number = Double.parseDouble(strnum);
                    rezult -= number;
                    i += strnum.length() + 1;
                    break;
                case '*':
                    strnum = findnumber(stroka, i + 1);
                    number = Double.parseDouble(strnum);
                    rezult *= number;
                    i += strnum.length() + 1;
                    break;
                case '/':
                    strnum = findnumber(stroka, i + 1);
                    number = Double.parseDouble(strnum);
                    rezult /= number;
                    i += strnum.length() + 1;
                    break;
                case '=':
                    i++;
                    break;
                default:
                    strnum = findnumber(stroka, i);
                    number = Double.parseDouble(strnum);
                    rezult += number;
                    i += strnum.length();
                    break;
            }
        }

        System.out.println("Математическое выражение =  " + rezult);
    }

    public static String findnumber(char[] stroka, int j) {
        String str = "";
        while (stroka[j] != '+' & stroka[j] != '-' & stroka[j] != '*' & stroka[j] != '/' & j < stroka.length) {
            str += stroka[j];
            j++;
            if (j == stroka.length) break;
        }
        return str;
    }

}

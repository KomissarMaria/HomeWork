package lesson06;

import java.io.*;

/**
 * Добавить исключения в задачу про вычисление значения выражения вида «1+23*3-5»
 */
public class Task6 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите математическое выражение:");
        String str = reader.readLine();

        char[] stroka = str.toCharArray();
        double rezult = 0.0, number;
        String strnum;
        int i = 0;
        boolean exit = false;

        while (i < stroka.length) {
            switch (stroka[i]) {
                case '+':
                    strnum = findnumber(stroka, i + 1);
                    try {
                        number = Double.parseDouble(strnum);
                        rezult += number;
                        i += strnum.length() + 1;
                    } catch (NumberFormatException ex) {
                        i = stroka.length;
                        exit = true;
                        System.out.println("Вы ввели буквы/символы в числовое выражение!");
                    }
                    break;
                case '-':
                    strnum = findnumber(stroka, i + 1);
                    try {
                        number = Double.parseDouble(strnum);
                        rezult -= number;
                        i += strnum.length() + 1;
                    } catch (NumberFormatException ex) {
                        i = stroka.length;
                        exit = true;
                        System.out.println("Вы ввели буквы/символы в числовое выражение!");
                    }
                    break;
                case '*':
                    strnum = findnumber(stroka, i + 1);
                    try {
                        number = Double.parseDouble(strnum);
                        rezult *= number;
                        i += strnum.length() + 1;
                    } catch (NumberFormatException ex) {
                        i = stroka.length;
                        exit = true;
                        System.out.println("Вы ввели буквы/символы в числовое выражение!");
                    }
                    break;
                case '/':
                    strnum = findnumber(stroka, i + 1);
                    try {
                        number = Double.parseDouble(strnum);
                        rezult /= number;
                        i += strnum.length() + 1;
                    } catch (NumberFormatException ex) {
                        i = stroka.length;
                        exit = true;
                        System.out.println("Вы ввели буквы/символы в числовое выражение!");
                    }
                    break;
                case '=':
                    i++;
                    break;
                default:
                    strnum = findnumber(stroka, i);
                    try {
                        number = Double.parseDouble(strnum);
                        rezult += number;
                        i += strnum.length();
                    } catch (NumberFormatException ex) {
                        i = stroka.length;
                        exit = true;
                        System.out.println("Вы ввели буквы/символы в числовое выражение!");
                    }
                    break;
            }
        }
        if (!exit) System.out.println("Математическое выражение =  " + rezult);
        else System.out.println("Из-за неправильного формата числовой строки невозможно подсчитать значение");
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

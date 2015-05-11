package lesson14.Task2_package;

import java.util.Scanner;

/**
 * Написать программу переводчик, которая будет переводить текст, написанный на одном языке, на другой язык согласно заранее составленному словарю.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите путь к файлу для загрузки словаря: ");
        String path = sc.nextLine();
        System.out.print("Введите язык для перевода 'eng' или 'rus': ");
        String lang = sc.nextLine();
        Language language = (lang.contains("eng")) ? Language.ENGLISH : Language.RUSSIAN;
        System.out.print("Введите текст для перевода: ");
        String text = sc.nextLine();
        Translate dic = new Translate(language, path);
        System.out.println("Перевод:  " + dic.translation(text));
    }

}

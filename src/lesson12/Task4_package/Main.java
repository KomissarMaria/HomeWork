package lesson12.Task4_package;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Написать программу, которая запросит ввести с консоли информацию о 10 людях, запишет ее на диск, а при следующем старте прочитает записи и выведет сохраненные данные на экран.
 * Одинаковые записи должны игнорироваться (Set + equals*)
 */
public class Main {
    public static void main(String[] args) {
        String path = input("Введите каталог, куда будет сохранен файл с объектами:") + "HumanArray";
        File f = new File(path);
        Set<Human> people = new HashSet<Human>();

        if (f.exists()) {
            FileInputStream readfrom = null;
            ObjectInputStream objectfrom = null;
            Set<Human> arraypeople = null;
            try {
                readfrom = new FileInputStream(path);
                objectfrom = new ObjectInputStream(readfrom);
                arraypeople = (HashSet<Human>) objectfrom.readObject();
                objectfrom.close();
            } catch (IOException ex) {
            } catch (ClassNotFoundException e) {
            }
            Iterator<Human> iter = arraypeople.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next().toString());
            }
        } else {
            inputpeople(people);
            FileOutputStream writeto = null;
            ObjectOutputStream objectto = null;
            try {
                writeto = new FileOutputStream(path);
                objectto = new ObjectOutputStream(writeto);
                objectto.writeObject(people);
                objectto.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static String inputstring(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(str);
        return scanner.nextLine();
    }

    public static int inputint(String str, boolean forsex) {
        Scanner scanner = new Scanner(System.in);
        int input;
        if (forsex) {
            while (true) {
                System.out.println(str);
                input = scanner.nextInt();
                if (input == 1 || input == 0) break;
                else System.out.println("Неправильный ввод для определения пола!");
            }
        } else {
            System.out.println(str);
            input = scanner.nextInt();
        }
        return input;
    }

    public static void inputpeople(Set<Human> people) {
        int i = 0;
        while (i < 3) {
            String surname = inputstring("Введите фамилию");
            String name = inputstring("Введите имя");
            int age = inputint("Введите возраст:", false);
            int s = inputint("Введите пол: 0 - мужчина, 1 - женщина", true);
            Sex sex = (s == 0) ? Sex.man : Sex.woman;
            Human newpeople = new Human(name, surname, age, sex);
            if (chek(people, newpeople))
                System.out.println("Такой человек уже есть! Введите другие данные!");
            else {
                people.add(new Human(name, surname, age, sex));
                i++;
            }
        }
    }

    public static boolean chek(Set<Human> people, Human newpeople) {
        boolean rez = false;
        Iterator<Human> iter = people.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals(newpeople)) {
                rez = true;
                break;
            }
        }
        return rez;
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

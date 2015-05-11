package lesson13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Написать метод, который создаст список, положит в него 10 элементов, затем удалит первые два и последний, а затем выведет результат на экран.
 */
public class Task2 {
    public static void main(String[] args) throws IOException{
        ArrayList<String> str = AddDel();
        System.out.println(str.toString());
    }

    public static ArrayList<String> AddDel() throws IOException{
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>(10);
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
        }

        list.remove(0);
        list.remove(0);
        list.remove(list.size() - 1);

        return list;
    }

}

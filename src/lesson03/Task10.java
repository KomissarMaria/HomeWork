package lesson03;

import java.util.Random;
import java.util.Scanner;

/**
 * Написать консольную игру «Крестики нолики» используя двухмерные массивы
 */
public class Task10 {
    public static void main(String[] args) {

        char[][] array = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = '_';
            }
        }

        while (winner(array) == ' ' & chek(array)) {
            stepgamer(array);
            stepcomputer(array);
            print(array);
        }

        System.out.println((winner(array) == '_' && !chek(array)) ? "Ничья!" : (winner(array) == 'X') ? "Вы выиграли!" : "Выиграл компьютер!");
    }

    public static void print(char[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char winner(char[][] array) {
        char whowin = ' ';
        //поиск одинаковых элементов по горизонтали
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] & array[i][1] == array[i][2] & array[i][0] != '_') {
                whowin = array[i][0];
                break;
            }
        }
        if (whowin == ' ') {
            //поиск одинаковых элементов по вертикали
            for (int i = 0; i < 3; i++) {
                if (array[0][i] == array[1][i] & array[0][i] == array[2][i] & array[0][i] != '_') {
                    whowin = array[0][i];
                    break;
                }
            }
        }

        if (whowin == ' ') {
            //поиск одинаковых элементов по главной диагонали
            if (array[0][0] == array[1][1] & array[0][0] == array[2][2] & array[0][0] != '_') {
                whowin = array[0][0];
            }
        }

        if (whowin == ' ') {
            //поиск одинаковых элементов по побочной диагонали
            if (array[2][0] == array[1][1] & array[2][0] == array[0][2] & array[2][0] != '_') {
                whowin = array[2][0];
            }
        }

        return whowin;
    }

    public static void stepcomputer(char[][] array) {
        boolean rez = false;
        Random random = new Random();
        int x = random.nextInt(3);
        int y = random.nextInt(3);

        while (array[x][y] != '_') {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }

        array[x][y] = '0';
    }

    public static void stepgamer(char[][] array) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите координаты Вашего хода в виде: номер столбца, номер строки");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (array[x][y] == '_') {
                array[x][y] = 'X';
                break;
            } else
                System.out.println("Вы ввели неправильные координаты для хода!");
        }
    }

    public static boolean chek(char[][] array) {
        boolean empty = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == '_') {
                    empty = true;
                    break;
                }
            }
            if (empty) {
                break;
            }
        }

        return empty;
    }
}

package lesson03;

import java.io.*;
import java.util.Arrays;

/**
 * Написать группу методов, каждый из которых принимает на вход массив чисел и возвращает его длину в байтах как результат
 */
public class Task12 {
    public static void main(String[] args) {
        byte[] ArrayByte = {10, 11, 12, 13, 14};
        System.out.println("Длина массива типа Byte " + arraylength(ArrayByte) + " байт");

        short[] ArrayShort = {10, 11, 12, 13, 14};
        System.out.println("Длина массива типа Short " + arraylength(ArrayShort) + " байт");

        int[] ArrayInt = {10, 11, 12, 13, 14};
        System.out.println("Длина массива типа Integer " + arraylength(ArrayInt) + " байт");

        long[] ArrayLong = {10L, 11L, 12L, 13L, 14L};
        System.out.println("Длина массива типа Long " + arraylength(ArrayLong) + " байт");

        float[] ArrayFloat = {10.0f, 11.1f, 12.2f, 13.3f, 14.4f};
        System.out.println("Длина массива типа Float " + arraylength(ArrayFloat) + " байт");

        double[] ArrayDouble = {10.0, 11.1, 12.2, 13.3, 14.4};
        System.out.println("Длина массива типа Double " + arraylength(ArrayDouble) + " байт");
    }

    public static int arraylength(int[] array) {
        int dlina = array.length * 4;
        return dlina;
    }

    public static int arraylength(byte[] array) {
        int dlina = array.length;
        return dlina;
    }

    public static int arraylength(double[] array) {
        int dlina = array.length * 8;
        return dlina;
    }

    public static int arraylength(float[] array) {
        int dlina = array.length * 4;
        return dlina;
    }

    public static int arraylength(short[] array) {
        int dlina = array.length * 2;
        return dlina;
    }

    public static int arraylength(long[] array) {
        int dlina = array.length * 8;
        return dlina;
    }
}

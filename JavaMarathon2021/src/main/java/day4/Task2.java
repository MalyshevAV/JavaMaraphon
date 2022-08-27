package day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000 + 1);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива " + array.length);
        int max = Integer.MIN_VALUE;
        for (int maxValue : array)
            if (maxValue > max) {
                max = maxValue;
            }
        System.out.println("Максимальный элемент в массиве   " + max);

        int min = Integer.MAX_VALUE;
        for (int minValue : array)
            if (minValue < min) {
                min = minValue;
            }
        System.out.println("Минимальный элемент в массиве   " + min);

        int counterEnds0 = 0;
        for (int value : array)
            if (value % 10 == 0) {
                counterEnds0++;
            }
        System.out.println("Число элементов оканчивающихся на 0  " + counterEnds0);

            int sumEnds0 = 0;
        for (int value : array)
            if (value % 10 == 0) {
                sumEnds0 = sumEnds0 + value;
            }
        System.out.println("сумма элементов оканчивающихся на 0  " + sumEnds0);
    }
}



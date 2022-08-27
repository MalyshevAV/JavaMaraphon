package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        int maxValue = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                if (array[i][j] > maxValue)
                    maxValue = array[i][j];
        }
        System.out.println(maxValue);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[j];
            }
        }
        System.out.println(sum);
    }
}
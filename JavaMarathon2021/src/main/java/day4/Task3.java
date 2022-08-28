package day4;

import java.util.Arrays;

public class Task3 {
    //    Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
//    Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
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
//        В консоль вывести индекс строки, сумма чисел в которой максимальна.
//        Если таких строк несколько, вывести индекс последней из них.
        int maxValue = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                if (array[i][j] > maxValue)
                    maxValue = array[i][j];
        }
        System.out.println("Максимальный элемент в массиве :" + maxValue);

        // считаем сумму в каждой строке
        int[] sums = Arrays.stream(array)
                .mapToInt(row -> Arrays.stream(row).sum())
                // возвращаем массив
                .toArray();
        System.out.println("Сумма элементов в каждой строке " + Arrays.toString(sums));

        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < sums.length; i++) {
            if (sums[i] > sums[indexOfMax]) {
                indexOfMax = i;
            } else if (sums[i] < sums[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println("Индекс строки с максимальной суммой " + indexOfMax);
    }
}

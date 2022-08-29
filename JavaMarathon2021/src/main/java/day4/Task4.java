package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
//        Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//        Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой
//        выведите значение суммы и индекс первого элемента тройки.
        int [] array = new int [100];
        for (int i = 0; i < array.length; i++ )
            array[i] = (int) (Math.random() * 10000 + 1);
        System.out.println(Arrays.toString(array));

        int maxSum = 0;
        int maxSumIndex = 0;
        int arrayLenght= 3;
        for (int i = 0; i <= array.length - arrayLenght;  i++) {
            int sum = 0;
            for (int j = i; j < i + arrayLenght; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println(maxSumIndex);
        System.out.println(maxSum);
    }
}

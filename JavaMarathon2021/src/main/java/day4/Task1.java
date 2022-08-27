package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        1. С клавиатуры вводится число n - размер массива. Необходимо создать
//        массив указанного размера и заполнить его случайными числами от 0 до 10 (включительно).
//            Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль
//        информацию о:
//        а) Длине массива
//        б) Количестве чисел больше 8
//        в) Количестве чисел равных 1
//        г) Количестве четных чисел
//        д) Количестве нечетных чисел
//        е) Сумме всех элементов массива
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива " + array.length);
        int count8 = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > 8) {
                count8++;
            }
        System.out.println("Количество элементов в массиве больше 8  " + count8);

        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                count++;
            }
        System.out.println("Количество элементов в массиве равное 1  " + count);

        int countChet = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0) {
                countChet++;
            }
        System.out.println("Количество четных элементов в массиве   " + countChet);

    int countNeChet = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 != 0) {
        countNeChet++;
    }
        System.out.println("Количество нечетных элементов в массиве   " + countNeChet);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
        System.out.println("Количество четных элементов в массиве   " + sum);
    }
}

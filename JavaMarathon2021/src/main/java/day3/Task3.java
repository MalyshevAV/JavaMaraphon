package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attamp = 4;
        while (attamp >= 0){
            double delimoe = scanner.nextDouble();
            double delitel = scanner.nextDouble();
            attamp--;

            if (delitel == 0){
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(delimoe / delitel);
        }
    }
}

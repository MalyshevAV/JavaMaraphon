package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flour = scanner.nextInt();
       if (flour >0 && flour <= 4){
           System.out.println("Малоэтажный дом");
       } else if (flour >=5  && flour <= 8) {
           System.out.println("Среднеэтажный дом");
       } else if (flour >= 9) {
           System.out.println("Многоэтажный дом");
       } else {
           System.out.println( "Ошибка ввода");
       }
    }
}

package homework4;

import java.util.Scanner;

public class ScannerOneTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10");

        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (i >= 0 && i <= 10) {
                System.out.println("Положительное число от 0 до 10");
            } else {
                System.out.println(" Отрицательное число или больше 10");
            }
        }
    }
}
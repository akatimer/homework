package homework3;

import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.print("Введите второе целое число:");
            if (sc.hasNextInt()) {
                int j = sc.nextInt();
                System.out.println("Сумма введенных вами чисел:" + (i + j));
            } else {
                System.out.println("Вы ввели не целое число");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
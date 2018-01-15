package homework3;

import java.util.Scanner;

public class IfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (i % 2 == 0) {
                System.out.println("Введенное вами число является четным");
            } else {
                System.out.println("Введенное вами число является не четным");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
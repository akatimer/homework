package homework7;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first = sc.nextInt();
        System.out.println("Введите второе число: ");
        int second = sc.nextInt();
        System.out.println(doFromAtoB(first, second));
    }

    public static String doFromAtoB(int a, int b) {
        if (a < b) {
            if (a == b) {
                return Integer.toString(a);
            } else {
                return a + " " + doFromAtoB(a + 1, b);
            }
        } else {
            if (a == b) {
                return Integer.toString(a);
            } else {
                return a + " " + doFromAtoB(a - 1, b);
            }
        }
    }
}
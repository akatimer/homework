package homework3;

import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        int i =nextInteger();
        System.out.print("Введите второе целое число: ");
        int j =nextInteger();
        System.out.println("Сумма введенных вами чисел " + (i+j));
    }
    public static int nextInteger(){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            return sc.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
            System.exit(2);
        }
        return 0;
    }
}
package homework3;

import java.util.Scanner;

public class LessModuleTernar {

    public static void main(String[] args) {
        System.out.println("Число " + doMinAbs(doImput(), doImput(), doImput()) + " меньшее по модулю");
    }

    public static int doImput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Вы ввели не целое число. Установлено значение по умолчанию ");
            return 0;
        }
    }

    public static int doAbs(int var) {
        return var < 0 ? -var : var;
    }

    public static int doMinAbs(int var1, int var2, int var3) {
        if (doAbs(var1) < doAbs(var2) && doAbs(var1) < doAbs(var3)) {
            return var1;
        } else {
            if (doAbs(var2) < doAbs(var3)) {
                return var2;
            } else {
                return var3;
            }
        }
    }
}
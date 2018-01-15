package homework3;

public class NechetArgument {
    public static void main(String[] args) {
        if (Integer.parseInt(args[0]) > 0) {
            if (Integer.parseInt(args[0]) % 2 == 0) {
                System.out.println("Введенное вами число является четным");
            } else {
                System.out.println("Введенное вами число является не четным " + args[0]);
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
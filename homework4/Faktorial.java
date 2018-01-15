package homework4;

public class Faktorial {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        System.out.println("Cлучайное число " + n);
        System.out.println("Факториал числа равен " + factorialRamdomTen(n));
    }

    private static int factorialRamdomTen(int n) {
        int rez = 1;
        for (int i = 1; i <= n; i++) {
            rez = rez * i;
        }
        return rez;
    }
}
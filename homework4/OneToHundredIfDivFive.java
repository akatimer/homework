package homework4;

public class OneToHundredIfDivFive {
    public static void main(String[] args) {
        int n = 1;
        do {
            if (n % 5 == 0) {
                System.out.println(n + " делится на 5");
            }
            n++;
        } while (n <= 100);
    }
}
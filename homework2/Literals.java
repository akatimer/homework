package homework2;

public class Literals {

    public static void main(String[] args) {
        boolean b1 = false;
        System.out.println(b1);
        String s1 = "строка";
        System.out.println(s1);
        int two = 0b101;
        System.out.println(two);
        int eight = 010;
        System.out.println(eight);
        int ten = 10;
        System.out.println(ten);
        int sixteen = 0x0007;
        System.out.println(sixteen);
        float f1 = 71.56f;
        System.out.println(f1);
        double d1 = 57.32;
        System.out.println(d1);
        int s = sum(5, 8);
        System.out.println(s);
    }

    public static int sum(int i, int j) {
        return i + j;
    }
}
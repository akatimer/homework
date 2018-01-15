package homework3;

public class MidleArgument {
    public static void main(String[] args) {
        double sum = 0;
        int i = 0;
        for (String str : args) {
            i++;
            sum = sum + Double.parseDouble(str);
        }
        System.out.println(sum / i);
    }
}
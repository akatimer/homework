package homework5;

public class Array3x6 {
    public static void main(String[] args) {
        String[][] strD = new String[3][6];
        char c = 'a';
        for (int i = 0; i < 3; i++, c++) {
            for (int j = 0; j < 6; j++) {
                strD[i][j] = c + "" + (j + 1);

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(strD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
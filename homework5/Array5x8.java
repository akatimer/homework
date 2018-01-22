package homework5;

import java.util.Arrays;

public class Array5x8 {
    public static void main(String[] args) {

        int[][] arr = {{4, 6, 3, 8, 1, 4, 3, 7},
                {5, 6, 9, 3, 8, 3, 5, 9},
                {2, 6, 4, 8, 7, 3, 6, 8},
                {3, 5, 6, 1, 0, 3, 7, 5},
                {6, 3, 7, 7, 8, 5, 7, 1},

        };
        int[][] result = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            result[i][0] = findMin(arr[i]);
            result[i][1] = findMax(arr[i]);
        }
        System.out.println(Arrays.deepToString(result));
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

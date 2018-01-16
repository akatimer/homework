package homework5;

import java.util.Arrays;

public class BubbleSort {
        public static void main(String[] args) {

            int[] arr = {4, 6, 3, 8, 1, 9};
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }

        public static void sort(int[] array) {
            for (int i = array.length - 1; i > 0; i--) {
                boolean flag = false;
                for (int j = 0; j < i; j++) {
                    if (array[j + 1] > array[j]) {
                        int tmp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = tmp;
                        flag = true;
                    }
                }
                if (!flag) {
                    break;
                }
            }
        }
    }
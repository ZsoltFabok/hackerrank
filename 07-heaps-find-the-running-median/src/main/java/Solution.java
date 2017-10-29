import java.util.Scanner;
import java.util.Arrays;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] array = new int[]{};
        for (int i = 0; i < n; i++) {
            array = insert(array, a[i]);

            int index = Math.round(array.length / 2);
            if (array.length % 2 == 0) {
                double median = (array[index] + array[index - 1]) / 2.0;
                System.out.printf("%.1f%n", median);
            } else {
                System.out.printf("%d.0%n", array[index]);
            }
        }
    }

    private static int[] insert(int[] array, int value) {
        int index = Arrays.binarySearch(array, value);
        if (index < 0) {
            index = -index - 1;
        }
        int[] tmp = new int[array.length + 1];
        System.arraycopy(array, 0, tmp, 0, index);
        System.arraycopy(array, index, tmp, index + 1, array.length - index);
        tmp[index] = value;
        return tmp;
    }
}
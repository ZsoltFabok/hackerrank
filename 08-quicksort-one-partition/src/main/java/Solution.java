import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        System.out.println(toString(quicksort(a)));
    }

    static int[] quicksort(int[] a) {
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        quicksort(b, 0, b.length - 1);
        return b;
    }

    private static void quicksort(int[] a, int startIndex, int endIndex) {
        // pivot is the first element (startIndex)
        int leftIndex = startIndex + 1;
        int rightIndex = endIndex;

        while (rightIndex > leftIndex) {
            while (leftIndex < endIndex && a[leftIndex] < a[startIndex]) {
                leftIndex++;
            }
            while (rightIndex > startIndex && a[rightIndex] > a[startIndex]) {
                rightIndex--;
            }

            if (rightIndex > leftIndex) {
                swap(a, rightIndex, leftIndex);
                rightIndex--;
                leftIndex++;
            }
        }

        // put pivot to its final place
        if (a[rightIndex] < a[startIndex]) {
            swap(a, rightIndex, startIndex);
        }

        if (startIndex < rightIndex - 1) {quicksort(a, startIndex, rightIndex - 1);}
        if (rightIndex + 1 < endIndex) {quicksort(a, rightIndex + 1, endIndex);}

    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }

    private static String toString(int[] a) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < a.length - 1; i++) {
            builder.append(a[i]).append(" ");
        }
        builder.append(a[a.length - 1]);
        return builder.toString();
    }
}

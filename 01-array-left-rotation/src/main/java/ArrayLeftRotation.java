import java.util.Scanner;


public class ArrayLeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int shift = k % n;

        int[] b = new int[n];
        System.arraycopy(a, 0, b, n - shift, shift);
        System.arraycopy(a, shift, b, 0, n - shift);
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] output;
        output = arrayLeftRotation(a, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }

        System.out.println();
    }
}

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Arrays;


public class HeapsFindTheRunningMedian {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        printMedianWithHeaps(a);
    }

    private static void printMedianWithHeaps(int[] numbers) {
        PriorityQueue<Integer> left = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<>();

        for (int number: numbers) {
            // put the next number to either to the left or to the right
            if (!left.isEmpty() && number <= left.peek()) {
                left.offer(number);
            } else {
                right.offer(number);
            }

            // balance queues
            while (left.size() > right.size()) {
                right.offer(left.poll());
            }
            while (right.size() - left.size() > 1) {
                left.offer(right.poll());
            }

            // calculate the median
            double median;
            if (left.size() == right.size()) {
                median = (left.peek() + right.peek()) / 2.0;
            } else {
                median = right.peek();
            }
            System.out.printf("%.1f%n", median);
        }
    }

    /**
     * The first version which is slow according to hackerrank.
     */
    @SuppressWarnings({"java:S2185", "java:S1144", "java:S2184"})
    private static void printMedian(int[] numbers) {
        int[] array = new int[]{};
        for (int number : numbers) {
            array = insert(array, number);

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

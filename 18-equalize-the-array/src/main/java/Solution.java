import java.util.Arrays;


public class Solution {
    static int equalizeArray(int[] arr) {
        Arrays.sort(arr);

        int prev = arr[0];
        int max = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != prev) {
                if (count > max) {
                    max = count;
                }
                count = 1;
            } else {
                count++;
            }
            prev = arr[i];
        }

        if (count > max) {
            max = count;
        }

        return arr.length - max;
    }
}

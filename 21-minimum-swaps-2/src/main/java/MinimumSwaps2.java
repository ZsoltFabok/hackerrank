
public class MinimumSwaps2 {
    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        int i = 0;
        while(i < arr.length) {
            if (arr[i] != i + 1) {
                int j = i + 1;
                while(arr[j] != i + 1) {
                    j++;
                }
                arr[j] = arr[i];
                arr[i] = i + 1;
                swaps++;
            }
            i++;
        }
       return swaps;
    }
}

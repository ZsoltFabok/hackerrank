import java.util.HashMap;
import java.util.Map;

public class ArrayManipulation {
    /* works, but slow */
    static long arrayManipulation(int n, int[][] queries) {
        long max = 0L;

        long[] data = new long[n + 1];

        for (int[] query : queries) {
            for (int j = query[0]; j <= query[1]; j++) {
                data[j] += query[2];
                if (data[j] > max) {
                    max = data[j];
                }
            }
        }
        return max;
    }

    /* worked, but slow */
    static long arrayManipulation2(int[][] queries) {
        long max = 0L;

        Map<Integer, Long> data = new HashMap<>();

        for (int[] query : queries) {
            for (int j = query[0]; j <= query[1]; j++) {
                if (!data.containsKey(j)) {
                    data.put(j, (long) query[2]);
                } else {
                    data.put(j, data.get(j) + query[2]);
                }
                if (data.get(j) > max) {
                    max = data.get(j);
                }
            }
        }
        return max;
    }

}

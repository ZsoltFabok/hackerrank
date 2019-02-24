import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        int counter = 0;
        Map<Integer, Integer> socks = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if (!socks.containsKey(ar[i]) || socks.get(ar[i]) == 0) {
                socks.put(ar[i], 1);
            } else {
                socks.put(ar[i], 0);
                counter++;
            }
        }
        return counter;
    }
}

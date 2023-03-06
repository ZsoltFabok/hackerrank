import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class Pairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        System.out.println(numberOfPairs(a, k));
    }

    static int numberOfPairs(int[] array, int k) {
        Map<Integer, Integer> cache = new HashMap<>();
        int count = 0;
        for (int number : array) {
            // store number in cache
            // map::merge could be a good alternative
            cache.putIfAbsent(number, 0);
            cache.computeIfPresent(number, (key, value) -> cache.get(key) + 1);

            // Check for pairs in the cache, and increase counter
            // with the current occurrences of the the pair
            // if number is 3, and k is 2, the possible pairs are (1, 3) and (3, 5)
            // Check how many ones and fives are in the cache and count them.
            if (cache.containsKey(number - k)) {
                count += cache.get(number - k);
            }
            if (cache.containsKey(number + k)) {
                count += cache.get(number + k);
            }
        }
        return count;
    }
}

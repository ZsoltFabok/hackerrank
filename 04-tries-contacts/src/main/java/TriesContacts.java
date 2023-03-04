import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TriesContacts {
    public static void main(String[] args) {
        Map<String, Integer> cache = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();
            if ("add".equals(op)) {
                for (int i = 0; i < contact.length(); i++) {
                    String entry = contact.substring(0, i + 1);
                    if (!cache.containsKey(entry)) {
                        cache.put(entry, 0);
                    }
                    cache.put(entry, cache.get(entry) + 1);
                }
            } else if ("find".equals(op)) {
                Integer v = cache.get(contact);
                if (v == null) {
                    v = 0;
                }
                System.out.println(v);
            }
        }
    }
}

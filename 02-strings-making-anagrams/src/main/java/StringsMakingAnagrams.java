import java.util.Scanner;

public class StringsMakingAnagrams {
    public static int numberNeeded(String first, String second) {
        String shorter = first;
        String longer = second;
        if (first.length() > second.length()) {
            shorter = second;
            longer = first;
        }

        for (int i = 0; i < shorter.length(); i++) {
            String c = shorter.substring(i, i + 1);
            if(longer.contains(c)) {
                shorter = shorter.replaceFirst(c, "");
                longer = longer.replaceFirst(c, "");
                // well this is not nice, but will work
                i--;
            }
        }

        return shorter.length() + longer.length();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

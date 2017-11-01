import java.util.Scanner;


public class Solution {

    static int makingAnagrams(String s1, String s2) {
        String longer;
        String shorter;

        if (s1.length() < s2.length()) {
            shorter = s1;
            longer = s2;
        } else {
            shorter = s2;
            longer = s1;
        }

        int counter = 0;
        for (String s: shorter.split("")) {
            if (longer.contains(s)) {
                counter++;
                longer = longer.replaceFirst(s, "");
            }
        }

        return longer.length() + shorter.length() - counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}

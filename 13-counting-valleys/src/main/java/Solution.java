public class Solution {

    static int countingValleys(int n, String s) {
        int height = 0;
        int valleyCount = 0;
        for(int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D') {
                height--;
            } else {
                if (height == -1) {
                    valleyCount++;
                }
                height++;
            }
        }
        return valleyCount;
    }
}

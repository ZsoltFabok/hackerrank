public class JumpingOnTheClouds {
    static int jumpingOnClouds(int[] c) {
        int passedClouds = 0;
        int jumps = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == 0) {
                passedClouds++;
            } else {
                jumps += passedClouds / 2 + 1;
                passedClouds = 0;
            }
        }
        jumps += passedClouds / 2  + passedClouds % 2;
        return jumps;
    }
}

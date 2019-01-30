import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void sample01() {
        int[] socks = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        assertEquals(3, Solution.sockMerchant(socks.length, socks));
    }

    @Test
    public void test01() {
        int[] socks = new int[]{10, 20, 20};
        assertEquals(1, Solution.sockMerchant(socks.length, socks));
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SockMerchantTest {
    @Test
    public void sample01() {
        int[] socks = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        assertEquals(3, SockMerchant.sockMerchant(socks.length, socks));
    }

    @Test
    public void test01() {
        int[] socks = new int[]{10, 20, 20};
        assertEquals(1, SockMerchant.sockMerchant(socks.length, socks));
    }
}

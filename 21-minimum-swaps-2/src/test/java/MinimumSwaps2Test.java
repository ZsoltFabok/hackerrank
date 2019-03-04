import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MinimumSwaps2Test {
    @Test
    public void sample00() {
        int[] array = new int[]{7, 1, 3, 2, 4, 5, 6};

        assertEquals(5, MinimumSwaps2.minimumSwaps(array));
    }

    @Test
    public void sample01() {
        int[] array = new int[]{4, 3, 1, 2};

        assertEquals(3, MinimumSwaps2.minimumSwaps(array));
    }

    @Test
    public void sample02() {
        int[] array = new int[]{2, 3, 4, 1, 5};

        assertEquals(3, MinimumSwaps2.minimumSwaps(array));
    }

    @Test
    public void sample03() {
        int[] array = new int[]{1, 3, 5, 2, 4, 6, 7};

        assertEquals(3, MinimumSwaps2.minimumSwaps(array));
    }
}

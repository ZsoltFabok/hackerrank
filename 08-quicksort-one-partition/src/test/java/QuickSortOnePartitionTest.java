import common.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class QuickSortOnePartitionTest extends BaseTest {
    @Test
    public void sample01() {
        setInput("5\n4 5 3 7 2\n");
        QuickSortOnePartition.main(null);
        assertEquals("2 3 4 5 7\n", getOutput());
    }

    @Test
    public void sample02() {
        setInput("9\n0 -3 6 4 -10 8 -5 2 -7\n");
        QuickSortOnePartition.main(null);
        assertEquals("-10 -7 -5 -3 0 2 4 6 8\n", getOutput());
    }

    @Test
    public void input01() {
        int[] a = new int[]{54, 26, 93, 17, 77, 31, 44, 55, 20};
        int[] expected =  new int[]{17, 20, 26, 31, 44, 54, 55, 77, 93};
        assertArrayEquals(expected, QuickSortOnePartition.quicksort(a));
    }

    @Test
    public void input02() {
        int[] a = new int[]{17, 26, 20};
        int[] expected =  new int[]{17, 20, 26};
        assertArrayEquals(expected, QuickSortOnePartition.quicksort(a));
    }

    @Test
    public void foo() {
        int[] a = new int[]{8, 4, 2, 6};
        int[] expected =  new int[]{2, 4, 6, 8};
        assertArrayEquals(expected, QuickSortOnePartition.quicksort(a));
    }
}

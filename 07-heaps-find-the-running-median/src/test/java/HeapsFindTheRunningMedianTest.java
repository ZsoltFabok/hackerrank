import common.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeapsFindTheRunningMedianTest extends BaseTest {
    @Test
    public void sample1() {
        setInput("6\n12\n4\n5\n3\n8\n7");
        HeapsFindTheRunningMedian.main(null);
        assertEquals("12.0\n8.0\n5.0\n4.5\n5.0\n6.0\n", getOutput());
    }
}

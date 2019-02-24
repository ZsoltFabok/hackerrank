import common.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PerformanceTest extends BaseTest {

    @Test
    public void performance05() throws Exception {
        useFileInput("input05.txt");
        HeapsFindTheRunningMedian.main(null);
        assertEquals(getReferenceOutputFromFile("output05.txt"), getOutput());
    }
}

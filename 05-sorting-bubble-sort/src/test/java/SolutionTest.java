
import common.BaseTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest extends BaseTest {

    @Test
    public void sample1() throws Exception {
        setInput("3\n1 2 3");
        Solution.main(null);
        assertSortProperly(getOutput(), 0, 1, 3);
    }

    @Test
    public void sample2() throws Exception {
        setInput("3\n3 2 1");
        Solution.main(null);
        assertSortProperly(getOutput(), 3, 1, 3);
    }

    private void assertSortProperly(String output, int expectedSwaps, int first, int last) {
        assertEquals("Array is sorted in " + expectedSwaps + " swaps.\n"
                + "First Element: " + first + "\n"
                + "Last Element: " + last + "\n", output);
    }
}
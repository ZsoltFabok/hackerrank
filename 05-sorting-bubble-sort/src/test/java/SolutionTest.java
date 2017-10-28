

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    private InputStream origIn;
    private PrintStream origOut;

    @Before
    public void setup() {
        origIn = System.in;
        origOut = System.out;
    }

    @After
    public void teardown() {
        System.setOut(origOut);
        System.setIn(origIn);
    }

    @Test
    public void sample1() throws Exception {
        String input = "3\n1 2 3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Solution.main(null);

        assertSortProperly(out.toString(), 0, 1, 3);
    }

    @Test
    public void sample2() throws Exception {
        String input = "3\n3 2 1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Solution.main(null);

        assertSortProperly(out.toString(), 3, 1, 3);
    }

    private void assertSortProperly(String output, int expectedSwaps, int first, int last) {
        assertEquals("Array is sorted in " + expectedSwaps + " swaps.\n"
                + "First Element: " + first + "\n"
                + "Last Element: " + last + "\n", output);
    }
}
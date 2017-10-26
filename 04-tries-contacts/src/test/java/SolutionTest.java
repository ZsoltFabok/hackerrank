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
    public void basic() throws Exception {
        String input = "4\nadd hack\nadd hackerrank\nfind hac\nfind hak";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Solution.main(null);

        assertEquals("2\n0\n", out.toString());
    }
}

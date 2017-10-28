import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest extends common.BaseTest {


    @Test
    public void basic() throws Exception {
        setInput("4\nadd hack\nadd hackerrank\nfind hac\nfind hak");

        Solution.main(null);

        assertEquals("2\n0\n", getOutput());
    }
}

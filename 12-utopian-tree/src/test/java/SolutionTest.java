import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void sample01() {
        assertEquals(1, Solution.utopianTree(0));
    }

    @Test
    public void sample02() {
        assertEquals(2, Solution.utopianTree(1));
    }

    @Test
    public void sample03() {
        assertEquals(7, Solution.utopianTree(4));
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void sample00() {
        assertEquals(2, Solution.equalizeArray(new int[]{1, 2, 2, 3}));
    }

    @Test
    public void sample01() {
        assertEquals(2, Solution.equalizeArray(new int[]{3, 3, 2, 1, 3}));
    }
}

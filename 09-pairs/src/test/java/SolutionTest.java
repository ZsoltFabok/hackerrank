import common.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest extends BaseTest {
    @Test
    public void sample01() {
        setInput("5 2\n1 5 3 4 2\n");
        Solution.main(null);
        assertEquals("3\n", getOutput());
    }

    @Test
    public void sample02() {
        setInput("10 1\n363374326 364147530 61825163 1073065718 1281246024 1399469912 428047635 491595254 879792181 1069262793\n");
        Solution.main(null);
        assertEquals("0\n", getOutput());
    }

    @Test
    public void testInput01() {
        assertEquals(3, Solution.numberOfPairs(new int[]{1,5,3,4,2}, 2));
    }

    @Test
    public void testInput02() {
        assertEquals(4, Solution.numberOfPairs(new int[]{3,3,7,7}, 4));
    }
}

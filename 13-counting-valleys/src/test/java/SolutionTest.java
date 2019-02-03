import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void sample01() {
        String path = "UDDDUDUU";
        assertEquals(1, Solution.countingValleys(path.length(), path));
    }

    @Test
    public void sample02() {
        String path = "DDUUUUDD";
        assertEquals(1, Solution.countingValleys(path.length(), path));
    }

}

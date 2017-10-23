import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void basic() {
        assertEquals(4, Solution.numberNeeded("cde", "abc"));
    }

    @Test
    public void fullAnagram() {
        assertEquals(0, Solution.numberNeeded("abdc", "abcd"));
    }
}

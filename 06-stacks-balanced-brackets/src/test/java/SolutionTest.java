import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    @Test
    public void sample1() {
        assertTrue(Solution.isBalanced("{[()]}"));
    }

    @Test
    public void sample2() {
        assertFalse(Solution.isBalanced("{[(])}"));
    }

    @Test
    public void sample3() {
        assertTrue(Solution.isBalanced("{{[[(())]]}}"));
    }

    @Test
    public void onlyOpen() {
        assertFalse(Solution.isBalanced("(("));
    }

    @Test
    public void simpleOpenCloseSeveralTimes() {
        assertTrue(Solution.isBalanced("()(){}[]"));
    }

    @Test
    public void justClosing() {
        assertFalse(Solution.isBalanced("]]"));
    }
}

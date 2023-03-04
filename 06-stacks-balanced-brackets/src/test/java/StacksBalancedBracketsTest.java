import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StacksBalancedBracketsTest {

    @Test
    public void sample1() {
        assertTrue(StacksBalancedBrackets.isBalanced("{[()]}"));
    }

    @Test
    public void sample2() {
        assertFalse(StacksBalancedBrackets.isBalanced("{[(])}"));
    }

    @Test
    public void sample3() {
        assertTrue(StacksBalancedBrackets.isBalanced("{{[[(())]]}}"));
    }

    @Test
    public void onlyOpen() {
        assertFalse(StacksBalancedBrackets.isBalanced("(("));
    }

    @Test
    public void simpleOpenCloseSeveralTimes() {
        assertTrue(StacksBalancedBrackets.isBalanced("()(){}[]"));
    }

    @Test
    public void justClosing() {
        assertFalse(StacksBalancedBrackets.isBalanced("]]"));
    }
}

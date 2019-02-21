import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void sample01() {
        assertEquals("5 1 2 3 4", Solution.leftRotation(new int[]{1, 2, 3, 4, 5}, 4));
    }

    @Test
    public void test01() {
        assertEquals("5", Solution.leftRotation(new int[]{5}, 1));
    }

    @Test
    public void test02() {
        assertEquals("3 4 5 1 2", Solution.leftRotation(new int[]{1, 2, 3, 4, 5}, 2));
    }

    @Test
    public void test03() {
        assertEquals("1 2 3 4 5", Solution.leftRotation(new int[]{1, 2, 3, 4, 5}, 5));
    }
}

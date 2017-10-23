import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void rotateByFour() {
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, Solution.arrayLeftRotation(new int[]{1, 2, 3, 4, 5}, 5, 4));
    }
}
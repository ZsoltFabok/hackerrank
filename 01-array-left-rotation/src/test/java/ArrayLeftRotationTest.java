import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayLeftRotationTest {
    @Test
    public void rotateByFour() {
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, ArrayLeftRotation.arrayLeftRotation(new int[]{1, 2, 3, 4, 5}, 5, 4));
    }
}
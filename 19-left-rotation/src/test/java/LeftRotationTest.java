import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftRotationTest {
    @Test
    public void sample01() {
        assertEquals("5 1 2 3 4", LeftRotation.leftRotation(new int[]{1, 2, 3, 4, 5}, 4));
    }

    @Test
    public void test01() {
        assertEquals("5", LeftRotation.leftRotation(new int[]{5}, 1));
    }

    @Test
    public void test02() {
        assertEquals("3 4 5 1 2", LeftRotation.leftRotation(new int[]{1, 2, 3, 4, 5}, 2));
    }

    @Test
    public void test03() {
        assertEquals("1 2 3 4 5", LeftRotation.leftRotation(new int[]{1, 2, 3, 4, 5}, 5));
    }
}

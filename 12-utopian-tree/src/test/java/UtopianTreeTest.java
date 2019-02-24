import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UtopianTreeTest {
    @Test
    public void sample01() {
        assertEquals(1, UtopianTree.utopianTree(0));
    }

    @Test
    public void sample02() {
        assertEquals(2, UtopianTree.utopianTree(1));
    }

    @Test
    public void sample03() {
        assertEquals(7, UtopianTree.utopianTree(4));
    }
}

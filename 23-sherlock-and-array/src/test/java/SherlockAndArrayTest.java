import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class SherlockAndArrayTest {


    @Test
    public void sample01() {
        assertEquals("NO", SherlockAndArray.balancedSums(Arrays.asList(1, 2, 3)));
    }

    @Test
    public void sample02() {
        assertEquals("YES", SherlockAndArray.balancedSums(Arrays.asList(1, 2, 3, 3)));
    }

    @Test
    public void sample03() {
        assertEquals("YES", SherlockAndArray.balancedSums(Arrays.asList(1, 1, 4, 1, 1)));
    }

    @Test
    public void sample04() {
        assertEquals("YES", SherlockAndArray.balancedSums(Arrays.asList(2, 0, 0, 0)));
    }

    @Test
    public void sample05() {
        assertEquals("YES", SherlockAndArray.balancedSums(Arrays.asList(0, 0, 2, 0)));
    }
}

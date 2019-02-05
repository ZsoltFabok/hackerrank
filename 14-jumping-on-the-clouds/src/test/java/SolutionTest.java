import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void sample01() {
        int[] clouds = {0, 0, 1, 0, 0, 1, 0};
        assertEquals(4, Solution.jumpingOnClouds(clouds));
    }

    @Test
    public void sample02() {
        int[] clouds = {0, 0, 0, 1, 0, 0};
        assertEquals(3, Solution.jumpingOnClouds(clouds));
    }

    @Test
    public void test01() {
        int[] clouds = {0, 0, 0, 0, 1, 0};
        assertEquals(3, Solution.jumpingOnClouds(clouds));
    }

    @Test
    public void test02() {
        int[] clouds = {0, 0, 0, 1, 0, 1};
        assertEquals(3, Solution.jumpingOnClouds(clouds));
    }

    @Test
    public void test03() {
        int[] clouds = {0, 1, 0, 1, 0, 1, 0};
        assertEquals(3, Solution.jumpingOnClouds(clouds));
    }

    @Test
    public void test04() {
        int[] clouds = {0, 1, 0};
        assertEquals(1, Solution.jumpingOnClouds(clouds));
    }

    @Test
    public void test05() {
        int[] clouds = {0, 0, 1, 0};
        assertEquals(2, Solution.jumpingOnClouds(clouds));
    }

    @Test
    public void test06() {
        int[] clouds = {0, 1, 0, 0};
        assertEquals(2, Solution.jumpingOnClouds(clouds));
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TwoDArraysDsHourglassTest {
    @Test
    public void sample01() {
        int[][] data = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        assertEquals(19, TwoDArraysDsHourglass.hourglassSum(data));
    }

    @Test
    public void test01() {
        int[][] data = new int[][]{
                {1, 1, 1},
                {0, 1, 0},
                {1, 1, 1}};
        assertEquals(7, TwoDArraysDsHourglass.hourglassSum(data));
    }

    @Test
    public void test02() {
        int[][] data = new int[][]{
                {-1, -1, -1},
                {0, -1, 0},
                {-1, -1, -1}};
        assertEquals(-7, TwoDArraysDsHourglass.hourglassSum(data));
    }
}

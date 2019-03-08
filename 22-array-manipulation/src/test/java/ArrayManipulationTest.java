import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ArrayManipulationTest {
    @Test
    public void sample00() {
        int[][] queries = new int[][]{
                {1, 5, 3},
                {4, 8, 7},
                {6, 9, 1}};
        assertEquals(10, ArrayManipulation.arrayManipulation(10, queries));
    }

    @Test
    public void sample01() {
        int[][] queries = new int[][]{
                {1, 2, 100},
                {2, 5, 100},
                {3, 4, 100}};
        assertEquals(200, ArrayManipulation.arrayManipulation(5, queries));
    }

    @Test
    public void sample03() {
        int[][] queries = new int[][]{
                {2, 6, 8},
                {3, 5, 7},
                {1, 8, 1},
                {5, 9, 15}};
        assertEquals(31, ArrayManipulation.arrayManipulation(10, queries));
    }


}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingValleysTest {
    @Test
    public void sample01() {
        String path = "UDDDUDUU";
        assertEquals(1, CountingValleys.countingValleys(path.length(), path));
    }

    @Test
    public void sample02() {
        String path = "DDUUUUDD";
        assertEquals(1, CountingValleys.countingValleys(path.length(), path));
    }

}

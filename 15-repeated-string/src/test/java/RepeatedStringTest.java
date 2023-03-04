import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedStringTest {
    @Test
    public void sample01() {
        assertEquals(7L, RepeatedString.repeatedString("aba", 10));
    }

    @Test
    public void sample02() {
        assertEquals(1000000000000L, RepeatedString.repeatedString("a", 1000000000000L));
    }
}

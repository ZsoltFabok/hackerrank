import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EqualizeTheArrayTest {
    @Test
    public void sample00() {
        assertEquals(2, EqualizeTheArray.equalizeArray(new int[]{1, 2, 2, 3}));
    }

    @Test
    public void sample01() {
        assertEquals(2, EqualizeTheArray.equalizeArray(new int[]{3, 3, 2, 1, 3}));
    }
}

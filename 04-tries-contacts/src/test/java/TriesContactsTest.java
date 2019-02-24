import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriesContactsTest extends common.BaseTest {


    @Test
    public void basic() throws Exception {
        setInput("4\nadd hack\nadd hackerrank\nfind hac\nfind hak");

        TriesContacts.main(null);

        assertEquals("2\n0\n", getOutput());
    }
}

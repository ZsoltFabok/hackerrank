import common.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriesContactsTest extends BaseTest {

    @Test
    public void basic() {
        setInput("4\nadd hack\nadd hackerrank\nfind hac\nfind hak");

        TriesContacts.main(null);

        assertEquals("2\n0\n", getOutput());
    }
}

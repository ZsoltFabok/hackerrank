import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsMakingAnagramsTest {

    @Test
    public void basic() {
        assertEquals(4, StringsMakingAnagrams.numberNeeded("cde", "abc"));
    }

    @Test
    public void fullAnagram() {
        assertEquals(0, StringsMakingAnagrams.numberNeeded("abdc", "abcd"));
    }
}

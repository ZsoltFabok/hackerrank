import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakingAnagramsTest {
    @Test
    public void sample01() {
        assertEquals(4, MakingAnagrams.makingAnagrams("cde", "abc"));
    }

    @Test
    public void test01() {
        assertEquals(30, MakingAnagrams.makingAnagrams("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }
}

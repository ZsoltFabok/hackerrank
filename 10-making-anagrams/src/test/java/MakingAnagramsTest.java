import org.junit.Test;

import static org.junit.Assert.assertEquals;


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

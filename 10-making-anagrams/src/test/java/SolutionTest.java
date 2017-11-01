import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void sample01() {
        assertEquals(4, Solution.makingAnagrams("cde", "abc"));
    }

    @Test
    public void test01() {
        assertEquals(30, Solution.makingAnagrams("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }
}

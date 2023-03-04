import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class AcmIcpcTeamTest {
    @Test
    public void sample01() {
        String[] topic = new String[]{
                "10101",
                "11100",
                "11010",
                "00101"
        };
        assertArrayEquals(new int[]{5, 2}, AcmIcpcTeam.acmTeam(topic));
    }

    @Test
    public void sample02() {
        String[] topic = new String[]{
                "11101",
                "10101",
                "11001",
                "10111",
                "10000",
                "01110"
        };
        assertArrayEquals(new int[]{5, 6}, AcmIcpcTeam.acmTeam(topic));
    }


}

import org.junit.Test;

import java.io.IOException;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class ComparePlayerTest {

    @Test
    public void comparePlayerTest() throws IOException, InterruptedException {
        final ComparePlayer comparePlayer = new ComparePlayer();

        final String[] players = new String[]{"Filip", "Maya", "Marcio", "Martin", "Tiago"};
        final Integer[] scores = new Integer[]{100, 50, 50, 25, 1};

        final Map<String, Integer> result = comparePlayer.comparePlayers(players, scores);

        assertEquals(5, result.size());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void comparePlayerExceptionTest() throws IOException, InterruptedException {
        final ComparePlayer comparePlayer = new ComparePlayer();

        final String[] players = new String[]{"Filip", "Maya", "Marcio", "Martin", "Tiago"};
        final Integer[] scores = new Integer[]{100, 50, 50, 25};

        comparePlayer.comparePlayers(players, scores);
    }
}

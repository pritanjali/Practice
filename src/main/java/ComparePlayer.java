import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ComparePlayer {

    Map<String, Integer> comparePlayers(final String players[], final Integer[] scores) throws IOException, InterruptedException {

        final HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();

        for (int i = 0; i < players.length; i++) {
            scoreMap.put(players[i], scores[i]);
        }

        final List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(scoreMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (!(o2.getValue()).equals(o1.getValue())) {
                    return o2.getValue().compareTo(o1.getValue());
                }
                else {
                    return String.CASE_INSENSITIVE_ORDER.compare(o2.getKey(), o1.getKey());
                }
            }
        });

        scoreMap.clear();

        for (final Map.Entry entry : list) {
            scoreMap.put((String) entry.getKey(), (Integer) entry.getValue());
        }

        return scoreMap;
    }

}
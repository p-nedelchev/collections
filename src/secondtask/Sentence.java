package secondtask;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Created by clouway on 03.06.16.
 */
public class Sentence {

    Map.Entry<Character, Integer> entry;

    public Map<Character, Integer> getCharFreq(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chararray = s.toCharArray();
        for (char i : chararray) {
            map.put(i, map.get(i) == null ? 1 : map.get(i) + 1);
        }

        return map;
    }

    public List<Character> maximumOccurringChars(String str) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> occurrences = new ArrayList<>();
        int maxOccurring = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

            if (map.get(ch) > maxOccurring) {
                maxOccurring = map.get(ch);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxOccurring) {
                occurrences.add(entry.getKey());
            }
        }

        return occurrences;
    }
}






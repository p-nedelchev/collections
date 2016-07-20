package frequencytask;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ReadString {
    private String string;

    public ReadString(String string) {

        this.string = string;
    }

    public Map<Character, Integer> charFreq() {
        Map<Character, Integer> map = new HashMap<>();
        for (Character each : string.toCharArray()) {
            map.put(each, map.get(each) == null ? 1 : map.get(each) + 1);
        }
        return map;
    }

    public Character mostFreqChar() {
        Map<Character, Integer> freq = charFreq();
        Integer mostfreq = Collections.max(freq.values());
        for (Character each : freq.keySet()) {
            if (freq.get(each).equals(mostfreq)) {
            return each;
            }
        }
        return null;
    }
}

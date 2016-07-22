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
            if (map.containsKey(each)) {
                Integer newValue = map.get(each) + 1;
                map.put(each, newValue);
                continue;
            }
            map.put(each,1);
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

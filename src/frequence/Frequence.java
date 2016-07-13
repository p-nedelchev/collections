package frequence;

import java.util.*;

/**
 * Created by clouway on 11.07.16.
 *
 * @author Denis Dimitrov(@denis.k.dimitrov@gmail.com)
 */
public class Frequence {
    private final String text;

    public Frequence(String text) {
        this.text = text;
    }

    public Map<Character, Integer> charFrequence() {
        Map<Character, Integer> result = new LinkedHashMap<>();
        for (Character each : text.toCharArray()) {
            result.put(each, result.get(each) == null ? 1 : result.get(each) + 1);
        }
        return result;
    }

    public Character mostFrequentCharacter() {
        Map<Character, Integer> freqChar = charFrequence();
        Integer maxValue = Collections.max(freqChar.values());
        for (Character each : freqChar.keySet()) {
            if (freqChar.get(each).equals(maxValue)) {
                return each;
            }
        }
        Optional<Integer> possible = Optional.of(maxValue);
        possible.isPresent();
        return null;
    }

    public Map<String, Integer> wordFrequence(String text) {
        String[] split = text.split(" ");
        Map<String, Integer> result = new LinkedHashMap<>();
        for (String each : split) {
            result.put(each, result.get(each) == null ? 1 : result.get(each) + 1);
        }
        return result;
    }
}
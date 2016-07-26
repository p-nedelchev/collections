package frequences;

import java.util.*;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class FrequenciesCounter {

    /**
     * Finds the frequencies of the words in text
     * @param text String text that needs to be analysed
     * @return Map map containing all words as String keys and their
     * frequencies as values.
     */
    public Map<String, Integer> countWords (String text) {
        Map<String, Integer> frequencies = new LinkedHashMap<>();
        Arrays.stream(text.split(" ")).forEach(e -> frequencies.put(e, Collections.frequency(Arrays.asList(text.split(" ")),e)));
        return frequencies;
    }

    /**
     * Finds the most frequent character in text
     * @param text String text
     * @return char most frequent character in text
     */
    public String countCharacters (String text) {
        Map<String, Integer> frequencies = new LinkedHashMap<>();
        Arrays.stream(text.replaceAll("\\s","").split("")).forEach(e -> frequencies.put(e, Collections.frequency(Arrays.asList(text.split("")),e)));
        int max = Collections.max(frequencies.values());
        for (String key : frequencies.keySet()) {
            if (frequencies.get(key) == max) return key;
        }
        return text;
    }
}

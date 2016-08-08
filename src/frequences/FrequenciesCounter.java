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
        String [] words = text.split(" ");
        for (String word : words) {
            int wordFrequency = Collections.frequency(Arrays.asList(words), word);
            frequencies.put(word , wordFrequency);
        }
        return frequencies;
    }

    /**
     * Finds the most frequent character in text
     * @param text String text
     * @return char most frequent character in text
     */
    public String countCharacters (String text) {
        Map<String, Integer> frequencies = new LinkedHashMap<>();
        String [] characters = text.replaceAll("\\s", "").split("");
        for (String character : characters) {
            int charFrequency = Collections.frequency(Arrays.asList(characters), character);
            frequencies.put(character, charFrequency);
        }
        int max = Collections.max(frequencies.values());
        for (String key : frequencies.keySet()) {
            if (frequencies.get(key) == max) return key;
        }
        return text;
    }
}

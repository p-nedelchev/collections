import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.Map;


/**
 * Created by clouway on 08.06.16.
 *
 * @author alexandervladimirov1902@gmail.com
 *         (Alexander Vladimirov)
 */
public class Text {

  private final String text;

  public Text(String text) {
    this.text = text;
  }

  /**
   * Using map collection to find frequency of words in given text.
   * @return Map collection of word and frequency of it in given text.
   */
  public Map<String, Integer> wordsFrequency() {

    String[] content = text.split("\\s+");
    Map<String, Integer> words = Maps.newLinkedHashMap();

    for (String word : content ) {
        Integer freq = words.get(word);
      words.put(word, (freq == null) ? 1 : freq + 1);
    }
    return words;
  }

  /**
   * Traverse character frequency to return the most common character in given text.
   * @return most common character.
   */
  public Character mostCommonCharacter() {
    Integer maxValue = Collections.max(charactersFrequency().values());
    Map<Character, Integer> charactersFrequency = charactersFrequency();
    for (Character eachCharacter : charactersFrequency.keySet()) {

      if (charactersFrequency.get(eachCharacter).equals(maxValue)) {
        return eachCharacter;
      }
    }
    return null;
  }

  /**
   * Traverse given text and returns character frequency.
   * @return Map of character frequency.
   */
  private Map<Character, Integer> charactersFrequency() {
    String[] content = text.split("");
    Map<Character, Integer> characters = Maps.newLinkedHashMap();
    for (String eachWord : content) {

      for (Character eachCharacter : eachWord.toCharArray()) {
        Integer freq = characters.get(eachCharacter);
        characters.put(eachCharacter, (freq == null) ? 1 : freq + 1);
      }
    }
    return characters;
  }
}
package src.com.clouway.collections.sentencesprocessor;

import java.util.Map;
import java.util.HashMap;

public class SentencesProcessor {

  /**
   * Counting the words in a sentence.
   *
   * @param sentence
   * @return
   */
  public String wordCount(String sentence) {
    Map<String, Integer> map = new HashMap<>();
    String[] strarr = sentence.split(" ");
    for (String str : strarr) {
      Integer n = map.get(str);
      if (n != null) {
        n++;
        map.put(str, n);
      } else {
        map.put(str, 1);
      }
    }
    return (map.entrySet() + "").replaceAll("[\\[\\]]", "").replaceAll("=", ": ");
  }

  /**
   * Returns the most frequent letter in a sentence.
   *
   * @param sentence
   * @return
   */
  public String letterCount(String sentence) {
    char[] charArray = sentence.replaceAll(" +", "").toCharArray();
    Map<Character, Integer> map = new HashMap<>();
    for (char c : charArray) {
      Integer n = map.get(c);
      if (n != null) {
        n++;
        map.put(c, n);
      } else {
        map.put(c, 1);
      }
    }
    Map<Character, Integer> sorted = new HashMap<>(map);
    return (sorted.entrySet().iterator().next() + "").replaceAll("=", ": ");
  }

  /**
   * Cleaning up a sentence from punctuation.
   *
   * @param str
   * @return
   */
  public String cleanup(String str) {
    return str.toLowerCase().replaceAll("[\\p{Digit}\\p{Punct}]", "").replaceAll(" +", " ");
  }
}

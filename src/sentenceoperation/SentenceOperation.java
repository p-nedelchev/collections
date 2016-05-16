package sentenceoperation;


import java.util.LinkedHashMap;
import java.util.Map;


/**
 * @author Vasil Mitov (v.mitov.clouway@gmail.com)
 */
public class SentenceOperation {

  public String countWords(String sentence) {
    String[] words;
    LinkedHashMap<String, Integer> wordcount = new LinkedHashMap();
    words = sentence.split("\\s+");
    for (int i = 0; i < words.length; i++) {
      words[i] = words[i].replaceAll("[^\\w]", "").toLowerCase();
    }
    for (int j = 0; j < words.length; j++) {
      Integer counter = 0;
      String currentword = words[j];
      for (int i = 0; i < words.length; i++) {
        if (currentword.equals(words[i])) {
          counter++;
        }
      }
      wordcount.put(currentword, counter);
    }

    return wordcount.toString().replaceAll("=", ": ").replaceAll("[\\{\\}]", "");

  }

  public String mostCommonChar(String sentence) {
    String charecter = "";
    Integer charcount = 0;
    char[] sentenceasarray = sentence.replaceAll(" +", "").toCharArray();
    LinkedHashMap<Character, Integer> lettercount = new LinkedHashMap();
    for (int j = 0; j < sentenceasarray.length; j++) {
      Integer counter = 0;
      char currentchar = sentenceasarray[j];
      for (int i = 0; i < sentenceasarray.length; i++) {
        if (currentchar == sentenceasarray[i]) {
          counter++;
        }
      }
      lettercount.put(currentchar, counter);
    }
    for (Map.Entry<Character, Integer> entry : lettercount.entrySet()) {
      if (entry.getValue() > charcount) {
        charcount = entry.getValue();
        charecter = String.valueOf(entry.getKey());

      }
    }
    return "Most common char is '" + charecter + "' seen " + charcount + "  times.";
  }
}


package secondtask;

import java.util.*;

/**
 * Created by clouway on 03.06.16.
 */
public class Demo {
    public static void main(String[] args) {
        Sentence sentence = new Sentence();
        String s = "aleksandarhristov";
        Map<Character, Integer> frequence = sentence.getCharFreq(s);
        List<Character> mostFrequent = sentence.maximumOccurringChars(s);
        System.out.println("frequence of characters" + frequence);
        System.out.println("most frequent character is : " + mostFrequent);
    }

}


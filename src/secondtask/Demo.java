package secondtask;

import java.util.*;

/**
 * Created by clouway on 03.06.16.
 */
public class Demo {
    public static void main(String[] args) {
        Sentence sentence = new Sentence();
        Map<Character,Integer> frequence = sentence.getCharFreq("aleksandarhristov");
        Character mostFrequent = sentence.mostFrequent("aleksandarhristov");

    }

}


package secondtask;


import java.util.HashMap;
import java.util.Map;




/**
 * Created by clouway on 03.06.16.
 */
public class Characters {

        public  Map<Character,Integer> getCharFreq(String s) {
            Map<Character,Integer> charFreq = new HashMap<>();
            if (s != null) {
                for (Character c : s.toCharArray()) {
                    Integer count = charFreq.get(c);
                    int newCount = (count==null ? 1 : count+1);
                    charFreq.put(c, newCount);
                }
            }
            return charFreq;
        }



}



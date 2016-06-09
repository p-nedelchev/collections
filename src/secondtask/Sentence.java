package secondtask;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Created by clouway on 03.06.16.
 */
public class Sentence {
    private Map<Character, Integer> map = new HashMap<>();
    private Map.Entry<Character,Integer> entry ;

    public Map<Character, Integer> getCharFreq(String s) {
        char[] chararray = s.toCharArray();
        for (char i : chararray) {
            map.put(i, map.get(i) == null ? 1 : map.get(i) + 1);
        }
        for (Character key : map.keySet()) {
            System.out.println(" " + key + ":" + map.get(key));
        }
        return map;
    }

    public Character mostFrequent(String s) {
        int maxValueInTheMap = (Collections.max(map.values()));
        for (Map.Entry<Character,Integer> entry : map.entrySet())
            if (entry.getValue() == maxValueInTheMap) {
                System.out.println(entry.getValue());
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        return entry.getKey();
    }
}







package secondtask;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.security.Key;
import java.util.*;

/**
 * Created by clouway on 03.06.16.
 */
public class Demo {
    public static void main(String[] args) {
        Characters rofl = new Characters();
        String s = "aaccaaffgghhff";
        char[] chararray = s.toCharArray();
        System.out.println("The Given String is : " + s);
        {
            Map<Character, Integer> map = new HashMap<Character, Integer>();
                for(char i : chararray){
                    map.put(i,map.get(i) == null ? 1 : map.get(i) + 1);
                }
            for (Character key : map.keySet()) {
                String sex = key.toString();
                System.out.println(" " + key +  ":"+ map.get(key));
                    }

        int maxValueInTheMap = (Collections.max(map.values()));
        Map.Entry<Character,Integer> maxEntry =  null;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == maxValueInTheMap) {
                System.out.println(entry.getKey());
            }
            }

            }
        }
    }

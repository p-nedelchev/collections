package frequences;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Demo {
    public static void main(String[] args) {

        FrequenciesCounter counter = new FrequenciesCounter();
        Map count = new LinkedHashMap();
        count = counter.countWords("I am very very proud of you. Indeed let's count the word frequencies in this text text text");
        for (Object o : count.keySet()) {
            System.out.println(o +": " + count.get(o));
        }
        System.out.println(counter.countCharacters("Hello World"));
}
}

/**
 * Created by clouway on 08.06.16.
 *
 * @author alexandervladimirov1902@gmail.com
 *         (Alexander Vladimirov)
 */
public class Demo {
  public static void main(String[] args) {
    String inputSentence =  "asdfsadf weqrqwer eeeeeeee     eeee ee e e";
    Text sentence = new Text(inputSentence);

    System.out.println("Words Frequency: " + sentence.wordsFrequency());
    System.out.println("Most common character: " + sentence.mostCommonCharacter());
     }
}

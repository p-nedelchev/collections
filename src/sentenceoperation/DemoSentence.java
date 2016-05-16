package sentenceoperation;

/**
 * @author Vasil Mitov (v.mitov.clouway@gmail.com)
 */
public class DemoSentence {
  public static void main(String[] args) {
    Sentence test = new Sentence("Da vidim da li raboti raboti raboti li     zadachata?    Zadachata raboti.  ");
    System.out.println(test.wordsCount());
    System.out.println(test.mostCommonChar());
  }
}

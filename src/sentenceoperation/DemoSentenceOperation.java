package sentenceoperation;

/**
 * @author Vasil Mitov (v.mitov.clouway@gmail.com)
 */
public class DemoSentenceOperation {
  public static void main(String[] args) {
    SentenceOperation test = new SentenceOperation();
    System.out.println(test.countWords("Da vidim da li raboti raboti raboti li     zadachata?    zadachata raboti  "));
    System.out.println(test.mostCommonChar("Da vidim da li raboti raboti raboti li     zadachata?    zadachata raboti  "));
  }
}

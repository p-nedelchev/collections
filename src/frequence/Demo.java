package frequence;

/**
 * Created by clouway on 11.07.16.
 *
 * @author Denis Dimitrov(@denis.k.dimitrov@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        Frequence frequence = new Frequence("Ники Илиев");
        Character mostFrequentCharacter = frequence.mostFrequentCharacter();
        System.out.println(String.format("Most frequent char from the text 'Ники Илиев' is: %c ", mostFrequentCharacter));
        System.out.println();
        System.out.println("Each word equals to how many times it is met");
        System.out.println(frequence.wordFrequence("aa cc aa ff gg hh ff"));

    }
}

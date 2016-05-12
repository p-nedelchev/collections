package com.clouway.collections.sentencesprocessor;

public class Demo {
  public static void main(String[] args) {
    SentencesProcessor sp = new SentencesProcessor();
    String sentence = "Aaa baa1 aaa bhe bbb baa aaa bhe rew, 123 sap baa# aaa3 &* ~ / \\ bbb qwerty dsa      dwd.";
    System.out.println("\nThe sentence:\n" + sentence);
    System.out.println("\nFrequency of every word in the sentence.");
    System.out.println(sp.wordCount(sp.cleanup(sentence)));
    System.out.println("\nThe most frequent letter in the sentence.");
    System.out.println(sp.letterCount((sp.cleanup(sentence))));
  }
}

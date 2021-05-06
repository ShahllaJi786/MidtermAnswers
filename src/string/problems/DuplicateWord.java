package string.problems;

import java.util.*;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

       DuplicateWord.duplicateWords(st);
    }

    public static Set<String> duplicateWords(String sentence) {

        List<String> duplicateWordArray = Arrays.asList(sentence.split(" "));
        Set<String> wordsSet = new LinkedHashSet<>(duplicateWordArray);
        for (String word : wordsSet) {
            int occurence = Collections.frequency(duplicateWordArray,word);
            int wordlength = word.length();

            System.out.println(word + " occurs " + occurence + " times. "+ "The length of the word is " + wordlength + ".");

            //System.out.println("Word: "+word+ "     Occurence: " +occurence+ "     Word Length: " +wordlength);

        }
        return wordsSet;
    }

}

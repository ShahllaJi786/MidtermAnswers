package string.problems;

import com.sun.org.apache.xpath.internal.objects.XRTreeFragSelectWrapper;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        String[] word = s.split(" ");
        String longword = " ";
        for (int i = 0; i < word.length; i++)
            for (int j = 2 + i; j < word.length; j++)
                if (word[i].length() >= word[j].length())
                    longword = word[i];

        System.out.println(longword.length()+" "+longword);


    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        return map;
    }
    }

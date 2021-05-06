package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String str1="java";
        String str2="avaj";

        System.out.println("Both strings are anagrams: "+anagramCheck(str1,str2));
    }

    public static boolean anagramCheck(String str1, String str2){
        char[] charArrayFromString1=str1.toCharArray();
        char[] charArrayFromString2=str2.toCharArray();
        Arrays.sort(charArrayFromString1);
        Arrays.sort(charArrayFromString2);

        return Arrays.equals(charArrayFromString1,charArrayFromString2);
    }
}

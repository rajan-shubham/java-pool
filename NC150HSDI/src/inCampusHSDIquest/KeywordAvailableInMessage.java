package inCampusHSDIquest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KeywordAvailableInMessage {
    /*
    The aim of this task is to clean up a not text message present in a from words which are dictionary, we are is, dictionary that contains given two strigngs, dictionary. all valid words seperated by a string spaus and a text from which words that are ing message we by single contains need to remove all not present in the dictionary. Both strings, re made of whads seperated seperated by by single space characters! All words are made of English alphabet letters lowercase from the All words in the dictionary start with uppercase letter followed by message start with either uppercase or lowercase letters followed by lowercase letters. If the word is is not present letters. And words in the in the dictionary replace with ###
    Write a function solution that given the string dichonary and the string message return! message with words pla replaced return the appropriately.

    Lengths of input strings are at least one and at most 1000 characters

    All words in the dictionary are unique.
    lengthe of strings dictionary and message are within the range [1..1,000]:

    all words in stringe dictionary and message are made of English letters, and are separated by single spaces();

    all words in the string dictionary start with an uppercase letter, followed by lowercase letters;

    all words in dictionary are unique;

    all words in the string message start with either an uppercase or a lowercase letter, followed by lowercase letters.
     */
    public String solution(String dictionary, String message) {
        // Step 1: Split dictionary into a Set for O(1) lookups
        String[] dictArray = dictionary.split(" ");
        Set<String> dictSet = new HashSet<>(Arrays.asList(dictArray));

        // Step 2: Split the message into individual words
        String[] words = message.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Step 3: Check if word is in dictionary.
            // Note: We check if the word as-is exists in the set.
            if (dictSet.contains(word)) {
                result.append(word);
            } else {
                result.append("###");
            }

            // Add a space between words, but not after the last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        KeywordAvailableInMessage sol = new KeywordAvailableInMessage();

        String dict = "Apple Banana Cherry";
        String msg = "I ate an Apple and a Banana";

        // Expected Output: ### ### ### Apple ### ### ### Banana
        System.out.println(sol.solution(dict, msg));
    }
}

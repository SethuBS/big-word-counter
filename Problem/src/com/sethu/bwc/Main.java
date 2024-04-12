package com.sethu.bwc;


public class Main {

    public static int wordCounter(String inputString, String wordToCount) {
        // Split the inputString into words using whitespace as delimiter
        String[] words = inputString.split("\\s+");

        // Initialize a counter to count occurrences of wordToCount
        int count = 0;

        // Iterate through each word in the words array
        for (String word : words) {
            // Check if the current word matches wordToCount (case insensitive)
            if (word.equalsIgnoreCase(wordToCount)) {
                count++; // Increment the counter if there is a match
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String inputString = "This is a big string containing big words. Can you count all of the big words? You BIG champ you! Big ups!";
        String wordToCount = "big";

        int count = wordCounter(inputString, wordToCount);
        System.out.println("Number of occurrences of \"" + wordToCount + "\": " + count);

    }
}
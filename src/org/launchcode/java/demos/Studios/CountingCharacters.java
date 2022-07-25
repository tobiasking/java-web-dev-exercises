package org.launchcode.java.demos.Studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String excerpt = input.nextLine();
        
        char[] charsFromString = excerpt.replaceAll("[^a-zA-Z0-9]+","").toLowerCase().toCharArray();
        HashMap<Character, Integer> breakdown = new HashMap<>();

        // Add characters one by one to HashMap
        for (char oneChar : charsFromString) {
            if (breakdown.containsKey(oneChar)) {
                breakdown.put(oneChar, breakdown.get(oneChar) + 1);
            } else {
                breakdown.put(oneChar, 1);
            }
        }

        
        for (Map.Entry<Character, Integer> charCount : breakdown.entrySet()) {
            System.out.println(charCount.getKey() + ": " + charCount.getValue());
        }
    }
}

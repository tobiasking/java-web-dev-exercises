package launchcode.java.collectionexercises;

import java.sql.SQLOutput;
import java.util.Arrays;

//Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
public class ArrayPractice {
    public static void main(String[] args) {


        int[] ex = {1, 1, 2, 3, 5, 8};

        for (int num: ex) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));
        String[] sentenceArray = phrase.split("\\.");
        System.out.println(Arrays.toString(sentenceArray));;
    }

}


//This class applies one of the methods of day 16 (of the "new" players guide, Players_guide_230714) to day 14

import java.util.Arrays;
import java.util.Scanner;

public class Day14Improved {
    public static void main(String[] args) {
        // Makes empty array with length of five elements
        int[] numbers1 = new int[5];
        // Lets user input the five elements
        String question = new String("Please input an integer and press enter.");
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = askForNumber(question);
        }
        // Makes a new array with same length and elements as the first array
        int[] numbers2 = new int[numbers1.length];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = numbers1[i];
        }
        //prints contents of the arrays to allow for verification of the copying process
        System.out.println("Array 1: " + Arrays.toString(numbers1));
        System.out.println("Array 2: " + Arrays.toString(numbers2));
    }

    static int askForNumber(String question) {
        System.out.println(question);
        Scanner myScanner = new Scanner(System.in);
        return myScanner.nextInt();
    }
}



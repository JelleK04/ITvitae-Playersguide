import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // Makes empty array with length of five elements
        int[] numbers1 = new int[5];
        // Lets user input the five elements
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("Please insert an integer and press enter.");
            numbers1[i] = myScanner.nextInt();
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
}

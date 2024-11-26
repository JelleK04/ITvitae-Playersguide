//This class applies one of the methods of day 16 (of the "new" players guide, Players_guide_230714) to day 12

import java.util.Scanner;

public class Day12Improved {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int number;
        number = askForNumberInRange("Player 1, enter a number ranging for 0 to 100.", 0, 100);
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        System.out.print("User 2, guess the number. ");
        int guess;
        do {
            guess = myScanner.nextInt();
            if (guess == number) {
                System.out.println("You guessed the number!");
            } else if (guess < number) {
                System.out.println(guess + " is too low.");
                System.out.println("What is your next guess?");
            } else  {
                System.out.println(guess + " is too high.");
                System.out.println("What is your next guess?");
            }
        }
        while (guess != number);
    }
    static int askForNumberInRange(String text, int min, int max) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(text);
        int number = myScanner.nextInt();
        while (number < min || number > max) {
            System.out.println(number + " falls outside the specified range, try again.");
            number = myScanner.nextInt();
        }
        return number;
}
}

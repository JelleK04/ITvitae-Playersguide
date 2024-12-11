import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Pilot, enter a number ranging from 0 to 100");
            number = myScanner.nextInt();
        }
        while (number < 0 || number > 100);
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        System.out.println("User 2, guess the number.");
        int guess;
        do {
            guess = myScanner.nextInt();
             if (guess < number) {
                System.out.println(guess + " is too low.");
                System.out.println("What is your next guess?");
             }
            if (guess > number)  {
                System.out.println(guess + " is too high.");
                System.out.println("What is your next guess?");
            }
        }
        while (guess != number);
        System.out.println("You guessed the number!");
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Player 1, enter a number between 0 and 100");
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
            if (guess == number) {
                System.out.println("You guessed the number!");
            } else if (guess < number) {
                System.out.println(guess + " is too low.");
            } else  {
                System.out.println(guess + " is too high.");
            }
        }
        while (guess != number);
    }
}
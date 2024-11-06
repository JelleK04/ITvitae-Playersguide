public class Main {

    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_BLUE = "\u001B[34m";
    static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
                // checks if i is divisible by 3 nor by 5
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i + ": Normal");
                // checks if i is divisible by 3 but not by 5
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i + ": " + ANSI_RED + "Fire" + ANSI_RESET);
                //checks if i is divisible by 6 but not by 3
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println(i + ": " + ANSI_BLUE + "Electric" + ANSI_RESET);
                //only activates when i is divisible by 3 and 5
            } else {
                System.out.println(i + ": " + ANSI_PURPLE + "Electric Fire" + ANSI_RESET);
            }
        }
    }
}

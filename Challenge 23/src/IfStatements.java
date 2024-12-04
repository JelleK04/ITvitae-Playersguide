import java.util.Scanner;
public class IfStatements {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        State chestState = State.LOCKED;
        String input;
        while (true) {
            if (chestState == State.OPEN) {
                System.out.println("The chest is open. What do you want to do?");
                input = myScanner.nextLine();
                if (input.equals("close")) {
                    chestState = State.CLOSED;
                }
            }
            if (chestState == State.CLOSED) {
                System.out.println("The chest is closed. What do you want to do?");
                input = myScanner.nextLine();
                if (input.equals("open")) {
                    chestState = State.OPEN;
                }
                if (input.equals("lock")) {
                    chestState = State.LOCKED;
                }
            }
            if (chestState == State.LOCKED) {
                System.out.println("The chest is locked. What do you want to do?");
                input = myScanner.nextLine();
                if (input.equals("unlock")) {
                    chestState = State.CLOSED;
                }
            }
        }
    }
}



import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        State chestState = State.LOCKED;
        String input;
        while (1 == 1) {
            switch (chestState) {
                case OPEN:
                    System.out.println("The chest is open. What do you want to do?");
                    input = myScanner.nextLine();
                    if (input.equals("close")) {
                        chestState = State.CLOSED;
                    }
                    break;
                case CLOSED:
                    System.out.println("The chest is closed. What do you want to do?");
                    input = myScanner.nextLine();
                    if (input.equals("open")) {
                        chestState = State.OPEN;
                    }
                    if (input.equals("lock")) {
                        chestState = State.LOCKED;
                    }
                    break;
                case LOCKED:
                    System.out.println("The chest is locked. What do you want to do?");
                    input = myScanner.nextLine();
                    if (input.equals("unlock")) {
                        chestState = State.CLOSED;
                    }
            }
        }
    }
}

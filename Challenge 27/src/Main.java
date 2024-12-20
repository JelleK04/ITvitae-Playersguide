// Vraag stellen in de les over het moment van aanmaken van de Arrow instantie!!!!!!(Challenge 25 objective 2, Challenge 27 objective 2)

import java.util.Scanner;
public class Main {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Arrow yourArrow = null;
        while (yourArrow == null) {
            System.out.println("What type of arrow do you want?");
            showArrowTypes();
            String input = myScanner.nextLine();
            yourArrow = createArrowOnInput(input);
        }
        // false error message. program does in fact compile
        System.out.println("your arrow costs " + yourArrow.getCost(yourArrow.getArrowhead(), yourArrow.getFletching(), yourArrow.getLengthInCm()) + " gold.");
    }

    static void showArrowTypes() {
        System.out.println("Elite arrow: a steel arrow with plastic fletching, 95 centimetres long.");
        System.out.println("Beginner arrow: a wooden arrow with a fletching made of goosefeathers, 75 centimetres long.");
        System.out.println("Marksman arrow: a steel arrow with a fletching made of goosefeathers, 65 centimeters long");
        System.out.println("We also offer custom arrows.");
    }

    static Arrow createArrowOnInput(String input) {
        switch (input.toLowerCase().trim()) {
            case "elite":
                return Arrow.createEliteArrow();
            case "beginner":
                return Arrow.createBeginnerArrow();
            case "marksman":
                return Arrow.createMarksmanArrow();
            case "custom":
                return Arrow.createCustomArrow();
            default:
                return null;
        }
    }
}

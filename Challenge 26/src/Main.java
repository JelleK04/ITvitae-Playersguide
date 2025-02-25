import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What arrowhead do you want?");
        System.out.println("We offer steel, wood and obsidian.");
        String arrowheadInput = myScanner.nextLine();
        System.out.println("What fletching type do you want?");
        System.out.println("We offer plastic, turkeyfeathers and goosefeathers.");
        String flethingInput = myScanner.nextLine();
        System.out.println("How long do you want your arrow to be?");
        float lengthInCmInput;
        do {
            System.out.println("We can make it 60 to 100 cm long.");
            lengthInCmInput = myScanner.nextFloat();
        }
        while (lengthInCmInput < 60 || lengthInCmInput > 100);
        Arrow yourArrow = new Arrow(arrowheadInput, flethingInput, lengthInCmInput);
        System.out.println("your arrow costs " + yourArrow.getCost(yourArrow.getArrowhead(), yourArrow.getFletching(), yourArrow.getLengthInCm()) + " gold.");
    }
}

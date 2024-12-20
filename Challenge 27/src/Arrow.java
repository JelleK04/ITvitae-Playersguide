import java.util.InputMismatchException;

public class Arrow {
    public enum Arrowhead {
        STEEL,
        WOOD,
        OBSIDIAN,
    }

    public enum Fletching {
        PLASTIC,
        TURKEYFEATHERS,
        GOOSEFEATHERS,
    }

    private Arrow.Arrowhead arrowhead;
    private Arrow.Fletching fletching;
    private float lengthInCm;

    Arrow (String arrowheadInput, String fletchingInput, float lengthInCmInput) {
        switch (arrowheadInput.toLowerCase().trim()) {
            case "steel":
                arrowhead = Arrow.Arrowhead.STEEL;
                break;
            case "wood":
                arrowhead = Arrow.Arrowhead.WOOD;
                break;
            case "obsidian":
                arrowhead = Arrow.Arrowhead.OBSIDIAN;
                break;
        }
        switch (fletchingInput.toLowerCase().trim()) {
            case "plastic":
                fletching = Arrow.Fletching.PLASTIC;
                break;
            case "turkeyfeathers":
                fletching = Arrow.Fletching.TURKEYFEATHERS;
                break;
            case "goosefeathers":
                fletching = Arrow.Fletching.GOOSEFEATHERS;
                break;
        }
        lengthInCm = lengthInCmInput;
    }
    public static Arrow createEliteArrow() {
        return new Arrow("steel","plastic", 95 );
    }

    public static Arrow createBeginnerArrow() {
        return new Arrow("wood", "goosefeathers", 75);
    }

    public static Arrow createMarksmanArrow() {
        return new Arrow("steel", "goosefeathers", 65);
    }

    public static Arrow createCustomArrow() {
        String arrowheadInput;
        String fletchingInput;
        float lengthInCmInput;
        do {
            System.out.println("What arrowhead do you want?");
            System.out.println("We offer steel, wood and obsidian.");
            arrowheadInput = Main.myScanner.nextLine().trim().toLowerCase();
        } while (!arrowheadInput.equals("steel") && !arrowheadInput.equals("wood") && !arrowheadInput.equals("obsidian"));

        do {
            System.out.println("What fletching type do you want?");
            System.out.println("We offer plastic, turkeyfeathers and goosefeathers.");
            fletchingInput = Main.myScanner.nextLine();
        } while (!fletchingInput.equals("plastic") && !fletchingInput.equals("turkeyfeathers") && !fletchingInput.equals("goosefeathers"));

        System.out.println("How long do you want your arrow to be?");
        do {
            System.out.println("We can make it 60 to 100 cm long.");
            try {
                lengthInCmInput = Main.myScanner.nextFloat();
            }
            catch (InputMismatchException e) {
                lengthInCmInput = -1;
                Main.myScanner.nextLine();
            }
        }
        while (lengthInCmInput < 60 || lengthInCmInput > 100);
        return new Arrow(arrowheadInput, fletchingInput, lengthInCmInput);
    }

    public Arrowhead getArrowhead () {
        return arrowhead;
    }

    public Fletching getFletching () {
        return fletching;
    }

    public float getLengthInCm () {
        return lengthInCm;
    }

    float getCost(Arrowhead arrowhead, Fletching fletching, float length) {
        float gold = 0f;
        switch (arrowhead) {
            case STEEL:
                gold = 10;
                break;
            case WOOD:
                gold = 3;
                break;
            case OBSIDIAN:
                gold = 5;
                break;
        }
        switch (fletching) {
            case PLASTIC:
                gold = gold + 10;
                break;
            case TURKEYFEATHERS:
                gold = gold + 5;
                break;
            case GOOSEFEATHERS:
                gold = gold + 3;
                break;
        }
        gold = (gold + (length * 0.05f));
        return gold;
    }
}
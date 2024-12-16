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

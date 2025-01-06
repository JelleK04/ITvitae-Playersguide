// answer to question (final objective): Enumerations are used instead of a seperate color class because the color is a
// property of the card. In the previous Challenge the Colors were a seperate entity.

public class Card {
    public enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW
    }

    public enum Rank {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        DOLLAR,
        PERCENTAGE,
        CARET,
        AMPERSAND
    }

    private Card.Color color;
    private Card.Rank rank;

    Card (Color color, Rank rank) {
        this.color = color;
        this.rank = rank;
    }

    Color getColor () {
        return this.color;
    }

    Rank getRank () {
        return this.rank;
    }

    // Returns String in format 'Color Rank' (only first letter capitalized)
    public String toString() {
        StringBuilder colorStr = new StringBuilder(color.toString());
        colorStr.replace(1, colorStr.length(), color.toString().substring(1).toLowerCase());
        StringBuilder rankStr = new StringBuilder(rank.toString());
        rankStr.replace(1, rankStr.length(), rank.toString().substring(1).toLowerCase());
        return colorStr + " " + rankStr;
    }

    /* Two seperate methods because the objectives states to add methods (plural)
    that tell you if card is a number or a symbol card.
     */
    public boolean isNumber() {
        switch (rank) {
            case DOLLAR:
            case PERCENTAGE:
            case CARET:
            case AMPERSAND:
                return false;
            default:
                return true;
        }
    }
    public boolean isSymbol() {
        switch (rank) {
            case DOLLAR:
            case PERCENTAGE:
            case CARET:
            case AMPERSAND:
                return true;
            default:
                return false;
        }
    }
}

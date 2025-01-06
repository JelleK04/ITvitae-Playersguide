import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> deck = new ArrayList<>();
        for (Card.Color color : Card.Color.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck.add(new Card(color, rank));
                System.out.println("The " + deck.get(deck.size()-1).toString());
                System.out.println("Is number? " + deck.get(deck.size()-1).isNumber());
                System.out.println("Is symbol? " + deck.get(deck.size()-1).isSymbol());
            }
        }
    }
}


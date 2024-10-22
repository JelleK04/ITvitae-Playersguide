import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);
        String thing = input.next(); // Stores object/thing
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String description = input.next(); // Stores property/description of thing
        System.out.println("The " + description + " " + thing + " of Doom 3000!");

    }
}

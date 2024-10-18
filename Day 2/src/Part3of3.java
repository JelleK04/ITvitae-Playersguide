import java.util.Scanner;
public class Part3of3 {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Bread is ready.");
        System.out.println("Who is the bread for?");
        String name = myScanner.nextLine();
        System.out.println("Noted: " + name + " got bread.");
    }
}

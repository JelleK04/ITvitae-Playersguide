import java.util.Scanner;
public class Part1of2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("1. Rope");
        System.out.println("2. Torches");
        System.out.println("3. Climbing Equipment");
        System.out.println("4. Clean Water");
        System.out.println("5. Machete");
        System.out.println("6. Canoe");
        System.out.println("7. Food Supplies");
        System.out.println("What number do you want to see the price of?");

        switch (myScanner.nextInt()) {
            case 1:
                System.out.println("The rope costs 10 gold.");
                break;
            case 2:
                System.out.println("Torches cost 15 gold.");
                break;
            case 3:
                System.out.println("Climbing Equipment costs 25 gold.");
                break;
            case 4:
                System.out.println("Clean Water costs 1 gold.");
                break;
            case 5:
                System.out.println("The Machete costs 20 gold.");
                break;
            case 6:
                System.out.println("The Canoe costs 200 gold.");
                break;
            case 7:
                System.out.println("Food Supplies cost 1 gold");
                break;


        }
    }
}

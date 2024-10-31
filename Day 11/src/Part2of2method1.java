import java.util.Scanner;
public class Part2of2method1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("1. Rope");
        System.out.println("2. Torches");
        System.out.println("3. Climbing Equipment");
        System.out.println("4. Clean Water");
        System.out.println("5. Machete");
        System.out.println("6. Canoe");
        System.out.println("7. Food Supplies");
        String nameDiscount = "Jelle Kruijt";
        System.out.println("What is your name?");
        String name = myScanner.nextLine();
        System.out.println("What number do you want to see the price of?");

        if (name.equals(nameDiscount)) {
            switch (myScanner.nextInt()) {
                case 1:
                    System.out.println("The rope costs 5 gold.");
                    break;
                case 2:
                    System.out.println("Torches cost 7,5 gold.");
                    break;
                case 3:
                    System.out.println("Climbing Equipment costs 12,5 gold.");
                    break;
                case 4:
                    System.out.println("Clean Water costs 0,5 gold.");
                    break;
                case 5:
                    System.out.println("The Machete costs 10 gold.");
                    break;
                case 6:
                    System.out.println("The Canoe costs 100 gold.");
                    break;
                case 7:
                    System.out.println("Food Supplies cost 0.5 gold");
                    break;
            }
        } else  {
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
}


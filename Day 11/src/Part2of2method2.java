import java.util.Scanner;

public class Part2of2method2 {

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
        float discount = 1F;
        System.out.println("What item do you want to see the price of?");
        int input = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("What is your name?");
        String name = myScanner.nextLine();
        if (name.equals(nameDiscount)) {
            discount = 0.5F;
        }


        switch (input) {
            case 1:
                System.out.print("The rope cost " + discount * 10 + " gold");
                break;
            case 2:
                System.out.print("Torches cost " + discount * 15 + " gold.");
                break;
            case 3:
                System.out.print("Climbing Equipment costs " + discount * 25 + " gold.");
                break;
            case 4:
                System.out.print("Clean Water costs " + discount * 1 + " gold.");
                break;
            case 5:
                System.out.print("The Machete costs " + discount * 20 + " gold.");
                break;
            case 6:
                System.out.print("The Canoe costs " + discount * 200 + " gold.");
                break;
            case 7:
                System.out.print("Food Supplies cost " + discount * 1 + " gold");
                break;
        }
    }
}

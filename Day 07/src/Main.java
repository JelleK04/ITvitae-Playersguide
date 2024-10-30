import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many estates do you have?");
        int estatePoints = myScanner.nextInt();
        System.out.println("How many duchies do you have?");
        int duchyPoints = myScanner.nextInt() * 3;
        System.out.println("How many provinces do you have?");
        int provincePoints = myScanner.nextInt() * 6;
        System.out.println("You have " + (estatePoints + duchyPoints + provincePoints) + " points");
    }
}

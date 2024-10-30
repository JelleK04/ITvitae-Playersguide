import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input a number.");
        int remainder = (myScanner.nextInt()%2);
        if (remainder == 0) {
            System.out.println("Tick");
        } else {
            System.out.println("Tock");
        }
    }
}


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner =  new Scanner(System.in);
        System.out.println("Target column?");
        int targetColumn = myScanner.nextInt();
        System.out.println("Target row?");
        int targetRow = myScanner.nextInt();
        System.out.println("Deploy to:");
        System.out.println("(" + targetColumn + ", " + (targetRow - 1) + ")");
        System.out.println("(" + targetColumn+ ", " + (targetRow + 1) + ")");
        System.out.println("(" + (targetColumn -1) + ", " + targetRow + ")" );
        System.out.println("(" + (targetColumn + 1) + ", " + targetRow + ")"  );
    }
}

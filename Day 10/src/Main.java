import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What are the x-coordinates of the enemy?");
        int enemyX = myScanner.nextInt();
        System.out.println("What are the y-coordinates of the enemy?");
        int enemyY = myScanner.nextInt();
        System.out.print("The enemy is ");
        if (enemyY < 0) {
            System.out.print("to the south");
        }
        if (enemyY > 0) {
            System.out.print("to the north");
        }
        if (enemyX < 0) {
            System.out.print("west");
        }
        if (enemyX > 0) {
            System.out.print("east");
        }
        if (enemyX == 0 && enemyY == 0) {
            System.out.print("here");
        }
        System.out.println("!");


    }
}

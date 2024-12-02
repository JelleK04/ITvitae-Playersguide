// Perhaps subdivide the program into more methods?
import java.util.Scanner;
public class Main {
    final static int cityHPStart = 15;
    static int cityHP = cityHPStart;
    static int manticoreHPStart = 10;
    static int manticoreHP = manticoreHPStart;
    static int round = 1;
    static int distanceCityManticore = -1;
    static int cannonDamage;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        while (distanceCityManticore < 0 || distanceCityManticore > 100) {
            System.out.print("Player 1, how far away from the city do you want to station the Manticore? ");
            distanceCityManticore = myScanner.nextInt();
        }
        for (int i = 0; i < 25; i++) {
            System.out.println();
        }

        System.out.println("\nPlayer 2, it's your turn.");
        while (cityHP > 0 && manticoreHP > 0) {
            System.out.println("---------------------------------------------");
            System.out.println("STATUS: " + "Round: " + round + " " + "City: " + cityHP + "/" + cityHPStart + " " + "Manticore: " + manticoreHP + "/" + manticoreHPStart + " ");
            cannonDamage = calculateDamage(round);
            System.out.println("The cannon is expected to deal " + cannonDamage + " damage");
            System.out.print("Enter desired cannon range: ");
            shootCannon(myScanner.nextInt(), distanceCityManticore, cannonDamage);
            if (manticoreHP > 0) {
                cityHP -= 1;
            }
            round += 1;
        }
        if (cityHP == 0) {
            System.out.println("The city of Consolas has been destroyed!");
        }
        if (manticoreHP <= 0) {
            System.out.println("The Manticore has been destroyed! The city of Consolas has been saved!");
        }
    }

    static int calculateDamage(int round) {
        if (round % 3 == 0 && round % 5 == 0) {
            return 10;
        } else if (round % 3 == 0) {
            return 3;
        } else if (round % 5 == 0) {
            return 3;
        } else {
            return 1;
        }
    }

    static void shootCannon(int cannonRange, int distanceCityManticore, int cannonDamage) {
        if (cannonRange < distanceCityManticore) {
            System.out.println("That round FELL SHORT of the target.");
        } else if (cannonRange > distanceCityManticore) {
            System.out.println("That round OVERSHOT the target.");
        } else {
            manticoreHP = manticoreHP - cannonDamage;
            System.out.println("That round was a DIRECT HIT!");
        }
    }
}


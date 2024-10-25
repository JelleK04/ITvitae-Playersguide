import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many eggs have been gathered today?");
        int eggsTotal = myScanner.nextInt();
        int eggsPerSister = eggsTotal/4;
        int eggsDuckbear = eggsTotal%4;
        System.out.println("Each sister gets " + eggsPerSister + " eggs." );
        System.out.println("The duckbear gets " + eggsDuckbear + " eggs.");
    }
}

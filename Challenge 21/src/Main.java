// Continuation in the old players guide (players_guide_006) from Day 16 of the new players guide (players_guide_230714)
public class Main {
    public static void main(String[] args) {
        countdownAndPrint(10,1);
    }

    static void countdownAndPrint(int nStart, int nEnd) {
        if (nStart >= nEnd) {
            System.out.println(nStart);
            countdownAndPrint(nStart - 1, nEnd);
        }
    }
}
public class Main {
    public static void main(String[] args) {
    int[] array = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
    //calculates and prints smallest number in array
    int currentSmallest = Integer.MAX_VALUE;
    for (int i  : array) {
        if (i < currentSmallest) {
            currentSmallest = array[i];
        }
    }
        System.out.println(currentSmallest);
    //adds all number in the array up
    int total = 0;
    for (int j : array) {
        total += j;
    }
    //calculate and print average of all numbers in the array
        double average = (double)total / array.length;
        System.out.println(average);
    }
}






import java.util.Scanner;
public class Part2of2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the base of the triangle?");
        float base = myScanner.nextFloat();
        System.out.println("What is the height of the triangle?");
        float height = myScanner.nextFloat();
        System.out.println("The area of the triangle is " + base*height/2);
    }
}

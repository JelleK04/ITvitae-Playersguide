import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Soup YourSoup = new Soup();
        String input;
        boolean inputIsValid = false;
        while (!inputIsValid) {
            System.out.println("What kind of food do you want?");
            System.out.println("We offer soup, stew and gumbo");
            input = myScanner.nextLine();
            switch (input.toLowerCase().trim()) {
                case "soup":
                    YourSoup.type = Enums.Type.SOUP;
                    inputIsValid = true;
                    break;
                case "stew":
                    YourSoup.type = Enums.Type.STEW;
                    inputIsValid = true;
                    break;
                case "gumbo":
                    YourSoup.type = Enums.Type.GUMBO;
                    inputIsValid = true;
                    break;
            }
        }
        inputIsValid = false;
        while (!inputIsValid) {
            System.out.println("Which main ingredient would you like?");
            System.out.println("We offer mushrooms, chicken, carrots or potatoes. ");
            input = myScanner.nextLine();
            switch (input.toLowerCase().trim()) {
                case "mushrooms":
                    YourSoup.mainIngredient = Enums.MainIngredient.MUSHROOM;
                    inputIsValid = true;
                    break;
                case "chicken":
                    YourSoup.mainIngredient = Enums.MainIngredient.CHICKEN;
                    inputIsValid = true;
                    break;
                case "carrots":
                    YourSoup.mainIngredient = Enums.MainIngredient.CARROT;
                    inputIsValid = true;
                    break;
                case "potatoes":
                    YourSoup.mainIngredient = Enums.MainIngredient.POTATO;
                    inputIsValid = true;
                    break;
            }
        }
        inputIsValid = false;
        while (!inputIsValid) {
            System.out.println("What seasoning would you like?");
            System.out.println("We offer spicy, salty and sweet");
            input = myScanner.nextLine();
            switch (input.toLowerCase().trim()) {
                case "spicy":
                    YourSoup.seasoning = Enums.Seasoning.SPICY;
                    inputIsValid = true;
                    break;
                case "salty":
                    YourSoup.seasoning = Enums.Seasoning.SALTY;
                    inputIsValid = true;
                    break;
                case "sweet":
                    YourSoup.seasoning = Enums.Seasoning.SWEET;
                    inputIsValid = true;
                    break;
            }
        }
        System.out.println("You have chosen: ");
        System.out.println(YourSoup.seasoning + " " + YourSoup.mainIngredient + " " + YourSoup.type);
    }
}

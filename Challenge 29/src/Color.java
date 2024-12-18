public class Color {
    int red, green, blue;

    // Commonly used colors
    public final static Color WHITE = new Color(255, 255,255);
    public final static Color BLACK = new Color(0,0,0);
    public final static Color RED = new Color(255,0,0);
    public final static Color ORANGE = new Color(255,165,0);
    public final static Color YELLOW = new Color(255, 255, 0);
    public final static Color GREEN = new Color(0,128, 0);
    public final static Color BLUE = new Color(0, 0, 255);
    public final static Color PURPLE = new Color(128, 0, 128);

    // Calling the constructor with no arguments results in white (white is an arbitrary choice)
    Color() {
        this(255, 255, 255);
    }

    Color(int redInput, int greenInput, int blueInput) {
        this.red = redInput;
        this.green = greenInput;
        this.blue = blueInput;
    }

    // Returns a String in the format (red, green, blue)
    public String toString() {
        return "(" + red + ", " + green + ", " + blue + ")";
    }
}

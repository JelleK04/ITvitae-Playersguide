public class Point {
    /* The x and y variables are immutable. They are private and the class contains no setters.
    There is not enough context to say whether x and y should be mutable or immutable.
     */
    private int x;
    private int y;

    Point () {
        this(0, 0);
    }

    Point (int xInput, int yInput) {
        x = xInput;
        y = yInput;

    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // Return a String in the format (x, y)
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

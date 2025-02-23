package C51;

public class Point {
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
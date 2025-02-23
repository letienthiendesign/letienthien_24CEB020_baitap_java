package C45;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape(String color,boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Spuare[color=" + color  + ", filled=" + filled + "]";
    }
}

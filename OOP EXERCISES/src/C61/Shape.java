package C61;

public abstract class Shape {
    protected String color = "red";
    protected Boolean filled = true;

    public Shape(String color ,boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    public Boolean getFilled() {
        return filled;
    }

    public void isFilled(Boolean filled) {
        this.filled = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color +
                ", filled=" + filled +
                "]";
    }
}

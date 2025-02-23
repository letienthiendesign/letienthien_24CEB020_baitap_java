package C45;

public class Circle extends Shape{
    private double r =1;

    public Circle(String color, boolean filled, double r) {
        super(color, filled);
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double getArea(){
        return r*r*Math.PI;
    }
    public double getPerimeter(){
        return r*2*Math.PI;
    }

    @Override
    public String toString() {
        return"Spuare[Shape[color='" + getColor()  + ", filled=" + isFilled() + "]"+",[radius="+r+"]";
    }
}

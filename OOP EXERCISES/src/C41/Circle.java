package C41;

public class Circle {
    private double R = 1.0;
    private String Color = "red";

    public Circle(double r) {
        R = r;
    }
    public Circle(double r,String color) {
        R = r;
        Color = color;
    }

    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public double getR() {
        return R;
    }
    public void setR(double r) {
        R = r;
    }

    public double getArea(){
        return R*R*Math.PI ;
    }

    @Override
    public String toString() {
        return "Circle[Radius="+R+",Color="+Color+"]";
    }
}

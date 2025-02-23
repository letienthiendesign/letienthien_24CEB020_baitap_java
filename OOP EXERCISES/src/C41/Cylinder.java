package C41;

public class Cylinder extends Circle{
    private double Height;

    public Cylinder(double height){
        super(height);
        Height = 1;
    }
    public Cylinder(double height,double r){
        super(r);
        this.Height = height;
    }

    public double getHeight(){
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }
    public double getVolume(){
        return getArea()*Height;
    }
}

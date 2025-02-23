package C45;

public class testShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("blue",true);
        System.out.println(s1);

        Circle c1= new Circle("pink",true,3);
        System.out.println(c1);
        System.out.println("Area Circle = "+c1.getArea());
        System.out.println("Perimeter Circle = "+ c1.getPerimeter());

        rectangle r1 = new rectangle(3,2,"black",true);
        System.out.println(r1);
        System.out.println("Area rectangle = "+r1.getArea());
        System.out.println("Perimeter rectangle = "+ r1.getPerimeter());

        Square C2 = new Square(3,"brow",false);
        System.out.println(C2);
        System.out.println("Area Square = "+C2.getArea());
        System.out.println("Perimeter Square = "+ C2.getPerimeter());
    }
}

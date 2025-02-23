package C43;

public class testPoint2D {
    public static void main(String[] args) {
        Point2D P1 = new Point2D(1.1f, 3f);
        System.out.println(P1);

        Point3D P2 = new Point3D(1f,2f,3f);
        System.out.println(P2);

        P1.setXY(5.5f, 6.5f);
        System.out.println(P1);

        P2.setXYZ(7.7f, 8.8f, 9.9f);
        System.out.println(P2);
    }
}

package C51;

public class TestLineSub {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        System.out.println(p1);
        Point p2 = new Point(3,6);
        System.out.println(p2);

        LineSub l1 = new LineSub(p1,p2);
        System.out.println(l1);
        System.out.println(l1.getLength());
        System.out.println(l1.getGradient());
    }
}

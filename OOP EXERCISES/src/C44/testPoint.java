package C44;

public class testPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3.5f, 4.5f);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        p1.setXY(1.0f, 2.0f);
        System.out.println("p1 (sau khi setXY) = " + p1);

        MovablePoint mp1 = new MovablePoint();
        MovablePoint mp2 = new MovablePoint(2.0f, 3.0f, 0.5f, 1.0f);

        System.out.println("mp1 = " + mp1);
        System.out.println("mp2 = " + mp2);

        mp2.move();
        System.out.println("mp2 (sau khi move) = " + mp2);

        mp2.move().move();
        System.out.println("mp2 (sau khi move 2 lần nữa) = " + mp2);
    }
}


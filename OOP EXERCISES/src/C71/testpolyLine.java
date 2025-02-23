package C71;

public class testpolyLine {
        public static void main(String[] args) {
            System.out.println("==== Polyline của Points ====");
            polyLine polyline = new polyLine();

            // Thêm các điểm vào polyline
            polyline.addPoint(new Point(0, 0));
            polyline.addPoint(new Point(3, 4));
            polyline.addPoint(new Point(6, 8));
            polyline.addPoint(new Point(6, 0));

            System.out.println("Các điểm trong polyline: " + polyline);
            System.out.printf("Độ dài polyline: %.2f%n", polyline.getLength());
        }
    }


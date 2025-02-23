package C71;

import java.util.ArrayList;

public class polyLine {
        private ArrayList<Point> points;

        public polyLine() {
            points = new ArrayList<>();
        }
        public void addPoint(Point p) {
            points.add(p);
        }

        public double getLength() {
            double length = 0;
            for (int i = 1; i < points.size(); i++) {
                length += points.get(i - 1).distance(points.get(i));
            }
            return length;
        }

        @Override
        public String toString() {
            return points.toString();
        }
    }



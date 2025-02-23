package C51;

import C51.Point;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public int getBeginX() {
        return getX();
    }

    public void setBeginX(int x) {
        setX(x);
    }

    public int getBeginY() {
        return getY();
    }

    public void setBeginY(int y) {
        setY(y);
    }

    public void setBeginXY(int x, int y) {
        setXY(x, y);
    }
    public Point getEnd() {
        return end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "LineSub[begin=" + "("+getX()+","+getY()
                + ", end=" + end.toString()
                + "]";
    }
}

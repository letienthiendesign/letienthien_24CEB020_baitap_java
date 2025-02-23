package C36;

public class Ball {
    private float x;
    private float y;
    private int R;
    private float xDelta;
    private float yDelta;

    public Ball(float x,float y,int R,float xDelta,float yDelta) {
        this.x = x;
        this.y = y;
        this.R = R;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getyDelta() {
        return yDelta;
    }
    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public float getxDelta() {
        return xDelta;
    }
    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    public int getR() {
        return R;
    }
    public void setR(int r) {
        R = r;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }

    public void move(){
        x += xDelta;
        y += yDelta;
    }
    public  void reflectHorizontal(){
        xDelta = -xDelta;
    }
    public  void reflectVertical(){
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[("+x+","+y+"),speed=("+xDelta+","+yDelta+")]";
    }
}

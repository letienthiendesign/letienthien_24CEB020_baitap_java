package C37;

public class Ball {
    private float x;
    private float y;
    private float z;

    public Ball(float x,float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public float getY() {
        return y;
    }
    public float getX() {
        return x;
    }

    public void setXYZ(float x,float y,float z){

    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z +")";
    }
}

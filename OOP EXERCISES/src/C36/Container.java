package C36;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1,int y1,int x2,int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getW(){
        return x2 - x1 + 1;
    }
    public int getH(){
        return y2 - y1 + 1;
    }
    public int getY() {
        return y1;
    }

    public int getX() {
        return x1;
    }

//    public boolean collider(Ball ball){
//        int ballX = ball.getX();
//        int ballY = ball.getY();
//        int R = ball.getR();
//
//        return (ballX - R >= x1 && ballX + R <= x2 &&
//                ballY - R >= y1 && ballY + R <= y2);
//    }
    public boolean collidesWith(Ball ball) {
        if (ball.getX() - ball.getR() <= this.x1 ||
                ball.getX() - ball.getR() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ")]";
    }
}

//package C37;
//
//import C36.Ball;
//
//public class Player {
//    private int num;
//    private float x;
//    private float y;
//    private float z  = 0.0f;
//
//    public Player(int num ,float x,float y, float z) {
//        this.num = num;
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//    public void move(float xDisp,float yDisp){
//        this.x += xDisp;
//        this.y += yDisp;
//    }
//    public void jump(float zDisp){
//        this.z += zDisp;
//    }
//    public boolean near(Ball ball) {
//        float dx = this.x - ball.getX();
//        float dy = this.y - ball.getY();
//        float dz = this.z - ball.getZ();
//        double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
//        return distance < 8;
//    }
//
//    public void kick(Ball ball) {
//        ball.setXYZ(ball.getX() + 5, ball.getY(), ball.getZ());
//        System.out.println("Ball kicked to: " + ball);
//    }
//}

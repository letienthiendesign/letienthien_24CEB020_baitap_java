public class DeadlockExample {
    // Khai báo hai tài nguyên dùng chung
    static final Object resource1 = new Object();
    static final Object resource2 = new Object();

    public static void main(String[] args) {
        // Tạo luồng t1
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: da khoa resource 1");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (resource2) {
                    System.out.println("Thread 1: da khoa resource 2");
                }
            }
        });

        // Tạo luồng t2
        Thread t2 = new Thread(() -> {
            synchronized (resource2) { // Khóa resource2 trước
                System.out.println("Thread 2: da khoa resource 2");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (resource1) {
                    System.out.println("Thread 2: da khoa resource 1");
                }
            }
        });

      
        t1.start();
        t2.start();

        // Đảm bảo cả hai luồng hoàn thành
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

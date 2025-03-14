class Counter {
    private int count = 0; // Biến đếm 


    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class RaceConditionExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Tạo hai luồng cùng tăng biến count
        Thread t1 = new Thread(() -> {
           for (int i = 0; i < 1000; i++) counter.increment();
        });
 
        Thread t2 = new Thread(() -> {
           for (int i = 0; i < 1000; i++) counter.increment();
        });
 
        // Bắt đầu hai luồng
        t1.start();
        t2.start();

        // Đợi cả hai luồng kết thúc
        t1.join();
        t2.join();

        // In ra kết quả cuối cùng
        System.out.println("Final count: " + counter.getCount());
    }
}

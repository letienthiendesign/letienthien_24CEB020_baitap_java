public class StarvationExample {

    public static volatile boolean running = true;

    public static void main(String[] args) {
        // Tạo luồng ưu tiên cao
        Thread highPriority = new Thread(() -> {
            while (running) {
                System.out.println("High priority thread running...");
            }
        });

        // Tạo luồng ưu tiên thấp
        Thread lowPriority = new Thread(() -> {
            while (running) {
                System.out.println("Low priority thread running...");
            }
        });

        // Đặt độ ưu tiên
        highPriority.setPriority(Thread.MAX_PRIORITY);
        lowPriority.setPriority(Thread.MIN_PRIORITY);

        // Khởi động cả hai luồng
        highPriority.start();
        lowPriority.start();

        // Dừng chương trình sau 2 giây
        try {
            Thread.sleep(2000); // Cho các luồng chạy trong 2 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        running = false; // Kết thúc vòng lặp
    }
}

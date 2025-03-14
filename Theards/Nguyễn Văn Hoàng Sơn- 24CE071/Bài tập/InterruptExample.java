class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("Worker is running...");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Worker thread interrupted!");
                    break; // Thoát khỏi vòng lặp khi bị interrupt
                }
            }
            System.out.println("Worker stopped.");
        });

        worker.start();

        // Chờ 3 giây trước khi dừng worker
        Thread.sleep(3000);
        worker.interrupt(); // Gửi tín hiệu interrupt đến worker
    }
}

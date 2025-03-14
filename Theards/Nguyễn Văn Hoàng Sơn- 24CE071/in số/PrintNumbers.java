public class PrintNumbers {
    private static final Object lock = new Object();
    private static int count = 1;

    public static void main(String[] args) {
        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <= 10) {
                    synchronized (lock) {
                        if (count % 2 != 0) {
                            System.out.println(count);
                            count++;
                        }
                        lock.notify();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        
                    }
                }
            }
        });

        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <= 10) {
                    synchronized (lock) {
                        if (count % 2 == 0) {
                            System.out.println(count);
                            count++;
                        }
                        lock.notify();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }
}

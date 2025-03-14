// public class ClockThread extends Thread {
//     public void run() {
//         try {
//             while (true) {
//                 // Lấy thời gian hiện tại
//                 java.util.Date date = new java.util.Date();
//                 System.out.println(date);
//                 // Ngủ trong 1 giây
//                 Thread.sleep(1000);
//             }
//         } catch (InterruptedException e) {
//             System.out.println("Thread bị gián đoạn");
//         }
//     }

//     public static void main(String[] args) {
//         // Tạo một đối tượng ClockThread và khởi động nó
//         ClockThread clockThread = new ClockThread();
//         clockThread.start();
//     }
// }


import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockGUI extends JFrame {

    private JLabel timeLabel;

    public ClockGUI() {
        setTitle("Đồng hồ");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(timeLabel);
    }

    public void startClock() {
        Timer timer = new Timer(1000, e -> {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String time = sdf.format(new Date());
            timeLabel.setText(time);
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ClockGUI clock = new ClockGUI();
            clock.setVisible(true);
            clock.startClock();
        });
    }
}

import javax.swing.JFrame;

public class AppFrame extends JFrame {
    AppFrame() {
        setTitle("SEC F");
        setSize(500, 500);
        setLocationRelativeTo(null);
        AppPanel aPanel = new AppPanel();
        add(aPanel);
        setVisible(true);
    }
}

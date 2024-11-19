import javax.swing.JFrame;

public class AppFrame {

    private JFrame jFrame = new JFrame();
    LoadBundle lb = new LoadBundle();
    AppFrame() {
        jFrame.setTitle(lb.getConstant("APP_TITLE"));
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        AppPanel aPanel = new AppPanel();
        jFrame.add(aPanel);
        jFrame.setVisible(true);
    }
}

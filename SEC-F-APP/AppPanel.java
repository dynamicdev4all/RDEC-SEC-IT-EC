import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AppPanel extends JPanel {

    BufferedImage bgImage;
    Timer timer;
    int xPos = 200;
    int yPos = 300;
    int carCount = 4;

    Car cars[] = new Car[carCount];

    // Car car1;
    // Car car2;
    // Car car3;

    AppPanel() {
        setSize(500, 500);
        // setBackground(Color.BLUE);
        // loadBgImage();
        // car1 = new Car(60, 300, 80, 150);
        // car2 = new Car(190, 300, 80, 150);
        // car3 = new Car(320, 300, 80, 150);
        initCar();
        // car1.loadBgImage();
        callPaintAgain();
        addKeyboardControls();
        setFocusable(true);
    }

    void initCar() {
        int start = 30;
        int gap = 40;
        int speed = 3;
        for (int i = 0; i < carCount; i++) {
            cars[i] = new Car(start, 300, 80, 150, speed);
            // gap = gap + 40;
            start = start + 80 + gap;
            speed = speed + 5;
        }
    }

    void paintCars(Graphics pen) {
        for (int i = 0; i < carCount; i++) {
            cars[i].showCar(pen);
        }
    }

    void moveAllCars() {
        for (int i = 0; i < carCount; i++) {
            cars[i].moveCarUp();
        }
    }

    @Override
    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        paintCars(pen);
    }

    void callPaintAgain() {
        timer = new Timer(30, (a) -> {
            // car1.moveCarUp();
            // car2.moveCarUp();
            // car3.moveCarUp();
            moveAllCars();
            repaint();
        });
        timer.start();
    }

    void addKeyboardControls() {
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
            }

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    xPos = xPos + 1; // right move
                }

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    xPos = xPos - 1; // left move
                }

                throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
            }

        });
    }
}

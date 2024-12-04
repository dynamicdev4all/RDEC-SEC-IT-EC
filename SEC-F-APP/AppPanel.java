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
    Timer timer;
    int xPos = 200;
    int yPos = 300;
    int carCount = 1;
    int birdX = 150;
    int currentIndex = 0;
    Bird b1 = new Bird();
    BufferedImage flyingImages[] = b1.cutSpriteSheet();
    Pipe p1 = new Pipe();
    BufferedImage pipeImages[] = p1.cutSpriteSheet();
    // Car cars[] = new Car[carCount];
    // BufferedImage leftRun[] = new BufferedImage[8];

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
        // initCar();
        // car1.loadBgImage();
        callPaintAgain();
        addKeyboardControls();
        setFocusable(true);
    }

    // void initCar() {
    // int start = 30;
    // int gap = 40;
    // int speed = 3;
    // for (int i = 0; i < carCount; i++) {
    // cars[i] = new Car(start, 300, 80, 150, speed);
    // // gap = gap + 40;
    // start = start + 80 + gap;
    // speed = speed + 5;
    // }
    // }

    // void paintCars(Graphics pen) {
    // for (int i = 0; i < carCount; i++) {
    // cars[i].showCar(pen);
    // }
    // }

    // void moveAllCars() {
    // for (int i = 0; i < carCount; i++) {
    // cars[i].moveCarUp();
    // }
    // }

    void paintBird(Graphics pen) {
        // for (int i = 0; i < flyingImages.length; i++) {
        b1.showBird(pen, flyingImages[currentIndex], birdX);
        // System.out.println(i);
        // }
    }
    void paintPipe(Graphics pen) {
        // for (int i = 0; i < flyingImages.length; i++) {
        p1.showPipe(pen, pipeImages[0], 30, 50);
        p1.showPipe(pen, pipeImages[1], 170, 50);
        p1.showPipe(pen, pipeImages[2], 310, 50);
        p1.showPipe(pen, pipeImages[3], 450, 50);
        p1.showPipe(pen, pipeImages[4], 900, 50);
        // System.out.println(i);
        // }
    }

    @Override
    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        // paintCars(pen);
        paintBird(pen);
        paintPipe(pen);
    }

    void callPaintAgain() {
        timer = new Timer(65, (a) -> {
            // car1.moveCarUp();
            // car2.moveCarUp();
            // car3.moveCarUp();
            // moveAllCars();
            currentIndex++;
            if (currentIndex > 9) {
                currentIndex = 0;
            }
            birdX+=15;
            if (birdX > 500) {
                birdX = -194;
            }
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

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Car {
    int x;
    int y;
    int h;
    int w;
    int speed;
    BufferedImage image;

    Car(int x, int y, int w, int h, int speed) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.speed = speed;
        loadBgImage();
    }

    void loadBgImage() {
        try {
            image = ImageIO.read(AppPanel.class.getResource("car.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    void showCar(Graphics pen) {
        pen.drawImage(image, x, y, w, h, null);
    }

    void moveCarUp() {
        if(y<-h){
            y = 500;
        }
        y = y - speed;
    }
}

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Bird {
    BufferedImage spriteSheet;
    BufferedImage birdFlyingImages[] = new BufferedImage[10];

    Bird() {
        loadSpriteSheet();
    }

    void loadSpriteSheet() {
        try {
            spriteSheet = ImageIO.read(AppPanel.class.getResource("bird.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    BufferedImage[] cutSpriteSheet() {
        birdFlyingImages[0] = spriteSheet.getSubimage(0, 0, 194, 180);
        birdFlyingImages[1] = spriteSheet.getSubimage(194, 0, 194, 180);
        birdFlyingImages[2] = spriteSheet.getSubimage(388, 0, 194, 180);
        birdFlyingImages[3] = spriteSheet.getSubimage(582, 0, 194, 180);
        birdFlyingImages[4] = spriteSheet.getSubimage(776, 0, 194, 180);
        birdFlyingImages[5] = spriteSheet.getSubimage(0, 180, 194, 180);
        birdFlyingImages[6] = spriteSheet.getSubimage(194, 180, 194, 180);
        birdFlyingImages[7] = spriteSheet.getSubimage(388, 180, 194, 180);
        birdFlyingImages[8] = spriteSheet.getSubimage(582, 180, 194, 180);
        birdFlyingImages[9] = spriteSheet.getSubimage(776, 180, 194, 180);

        return birdFlyingImages;
    }

    void showBird(Graphics pen, BufferedImage img, int x) {
        pen.drawImage(img, x, 160, 150, 150, null);
    }
}

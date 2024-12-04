import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Pipe {
    BufferedImage spriteSheet;
    BufferedImage pipeImages[] = new BufferedImage[5];

    Pipe() {
        loadSheet();
    }

    void loadSheet() {
        try {
            spriteSheet = ImageIO.read(AppPanel.class.getResource("pipe.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    BufferedImage[] cutSpriteSheet() {
        pipeImages[0] = spriteSheet.getSubimage(0, 0, 1184, 592);
        pipeImages[1] = spriteSheet.getSubimage(0, 0, 1184, 1184);
        pipeImages[2] = spriteSheet.getSubimage(0, 0, 1184, 296);
        pipeImages[3] = spriteSheet.getSubimage(0, 0, 1184, 592);
        pipeImages[4] = spriteSheet.getSubimage(0, 0, 1184, 394);

        return pipeImages;
    }

    void showPipe(Graphics pen, BufferedImage img, int x,int h) {
        pen.drawImage(img, x, 160, 110, 800-img.getHeight(), null);
    }
}

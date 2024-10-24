import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.*;
import java.io.IOException;

import javax.imageio.*;

import javax.swing.*;


public class AppPanel extends JPanel {
    BufferedImage bufferImage;
    Timer timer;
    int xAxis= 0;
    int yAxis= 0;
    AppPanel() {
        setSize(500, 500);
        // setBackground(Color.GREEN);
        showBg();
        loopPaint();
    }

    void showBg() {
        try {
            bufferImage = ImageIO.read(AppPanel.class.getResource("bg.jpg"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.drawImage(bufferImage, xAxis,yAxis,50,50, null);

    }


    void loopPaint(){
      timer = new Timer(50, (abcd)->{
        xAxis = xAxis + 5;
        yAxis = yAxis + 12;
        if(xAxis >500){
            xAxis = 0;
        }
        if(yAxis >500){
            yAxis = 0;
        }
       repaint();
      });  
      timer.start();
    }
}

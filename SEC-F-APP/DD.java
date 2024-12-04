import java.io.File;


import javax.scene.media.Media;
import javax.print.attribute.standard.Media;

public class DD {
    public static void main(String[] args) {
        String name = "m.mp3";
        Media m = new Media(new File(name).toString());
    }
}

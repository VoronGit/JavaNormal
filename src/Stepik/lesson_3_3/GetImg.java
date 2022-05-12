package Stepik.lesson_3_3;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.io.File.separator;

public class GetImg {

    public static BufferedImage getMeImg(String fileName) {
        BufferedImage img;
        try {
            img = ImageIO.read(new File("." + separator + "src" + separator + "Stepik" + separator + "lesson_3_3" + separator + "img" + separator + fileName + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return img;
    }
}

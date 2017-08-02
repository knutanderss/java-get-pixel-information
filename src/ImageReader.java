import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.InputStream;

/**
 * Created by knutandersstokke on 02.08.2017.
 */
public class ImageReader {

    public static void main(String[] args) throws Exception {
        InputStream is = ImageReader.class.getResourceAsStream("img.png");
        BufferedImage image = ImageIO.read(is);

        // Getting pixel color by position x and y
        int bluePixelInt = image.getRGB(0, 0);
        int greenPixelInt = image.getRGB(5, 5);
        int yellowPixelInt = image.getRGB(5, 25);
        int whitePixelInt = image.getRGB(25, 25);

        Pixel bluePixel = Pixel.pixelFromRGBInt(bluePixelInt);
        Pixel greenPixel = Pixel.pixelFromRGBInt(greenPixelInt);
        Pixel yellowPixel = Pixel.pixelFromRGBInt(yellowPixelInt);
        Pixel whitePixel = Pixel.pixelFromRGBInt(whitePixelInt);

        System.out.println("Blue pixel: " + bluePixel);
        System.out.println("Green pixel: " + greenPixel);
        System.out.println("Yellow pixel: " + yellowPixel);
        System.out.println("White pixel: " + whitePixel);
    }
}

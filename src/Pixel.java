/**
 * Created by knutandersstokke on 02.08.2017.
 */
public class Pixel {

    private int red, blue, green;

    private Pixel(int red, int blue, int green) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    @Override
    public String toString() {
        return  "("  + red +
                ", " + blue +
                ", " + green +
                ')';
    }

    public static Pixel pixelFromRGBInt(int rgb) {

        // This part is from "Black Shadow", StackOverFlow
        // Filter out red 1s (00000000 11111111 00000000 00000000), move 1s to end
        int red = (rgb & 0x00ff0000) >> 16;
        int green = (rgb & 0x0000ff00) >> 8;
        int blue = rgb & 0x000000ff;

        return new Pixel(red, green, blue);
    }
}

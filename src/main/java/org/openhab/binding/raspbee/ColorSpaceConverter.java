
import java.awt.Color;

public class ColorSpaceConverter {

    
    //Umrechnung und setzen der Werte für die Lampe
    
    
    /**
     * Converts a color in the HSB format into the same color in the RGB format.
     * 
     * @param hue
     *            Hue as angle/360 [0.0 - 1.0]
     * @param saturation
     *            Saturation [0.0 - 1.0]
     * @param brightness
     *            Brightness [0.0 - 1.0]
     * @return The RGB values for the color.
     */
    public int[] hsbToRgb(double hue, double saturation, double brightness) {
//        int rgb = Color.HSBtoRGB((float) hue, (float) saturation, (float) brightness);
        int[] result = new int[3];
//        result[0] = (rgb >> 16) & 0xff;
//        result[1] = (rgb >> 8) & 0xff;
//        result[2] = (rgb >> 0) & 0xff;
        return result;
    }

    /**
     * Converts a color in the RGB format into the same color in the HSB format.
     * 
     * @param red
     *            Red [0 - 255]
     * @param green
     *            Green [0 - 255]
     * @param blue
     *            Blue [0 - 255]
     * @return The HSB values for the color. Hue as angle/360 [0.0 - 1.0],
     *         Saturation [0.0 - 1.0], Brightness [0.0 - 1.0]
     */
    public double[] rgbToHsb(int red, int green, int blue) {
        // float[] hsb = new float[3];
        // Color.RGBtoHSB(red, green, blue, hsb);
         double[] result = new double[3];
        // result[0] = hsb[0];
        // result[1] = hsb[1];
        // result[2] = hsb[2];
         return result;
    }

    /**
     * Converts a color in the RGB format into the same color in the HSB format.
     * 
     * @param rgbValues
     *            Red [0 - 255], Green [0 - 255], Blue [0 - 255]
     * @return The HSB values for the color. Hue as angle/360 [0.0 - 1.0],
     *         Saturation [0.0 - 1.0], Brightness [0.0 - 1.0]
     */
    public double[] rgbToHsb(int[] rgbValues) {
        return rgbToHsb(rgbValues[0], rgbValues[1], rgbValues[2]);
    }

}
import java.awt.*;

/**
 * An image filter to make the image a bit darker.
 * 
 * @author Michael Kolling and David J Barnes 
 * @version 1.0
 */
public class DarkerFilter extends Filter
{
    /**
     * Constructor for objects of class DarkerFilter.
     * @param name The name of the filter.
     */
    public DarkerFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
              int pixel=image.getRGB(x, y);
            //obtendo os valores de cada cor e da transparência
              int a=(pixel>>24)&0xff;
              int r=(pixel>>16)&0xff;
              int g=(pixel>>8)&0xff;
              int b=pixel&0xff;
        //calculando a media dos valores de cada cor presente no pixel
              int media=(r+g+b)/3;
                
              pixel=(a<<24)|(media<<16)|(media<<8)|media;
              image.setRGB(x, y, pixel);


            }
        }
    }
}

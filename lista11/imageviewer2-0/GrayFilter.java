public class GrayFilter extends Filter {
 

    public GrayFilter(String name) {
    super(name);
    //TODO Auto-generated constructor stub
  }

    public void apply(OFImage image) {
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


            }}
    }

}

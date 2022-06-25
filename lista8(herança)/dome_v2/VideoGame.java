
/**
 * Write a description of class VideoGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VideoGame extends Item
{
    private int price;
    /**
     * Constructor for objects of class VideoGame
     */
    public VideoGame(String theTitle,int time,int price)
    {
        super(theTitle, time);
        this.price=price;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public  void getPrice()
    {
        System.out.println(price);
    }
}

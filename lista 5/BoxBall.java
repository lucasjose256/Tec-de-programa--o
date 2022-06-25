import javafx.scene.canvas.Canvas;
import javafx.scene.shape.Ellipse;
import java.awt.*;
import java.awt.geom.*;
import java.sql.Array;
import java.util.ArrayList;
/**
 * Write a description of class BoxBall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BoxBall
{
    // instance variables - replace the example below with your own
    private static final int GRAVITY = 3;  // effect of gravity

    private int ballDegradation = 2;
    private Ellipse2D.Double circle;
    private Color color;
    private int diameter;
    private int xPosition;
    private int yPosition;      // y position of ground
    private Canvas myCanvas;
    private int ySpeed = 1;  
    private ArrayList<Ellipse2D.Double> circles;
    private Rectangle2D.Double  rectangle;

    public BoxBall(Canvas canv,ArrayList<Ellipse2D.Double> circles,Rectangle2D.Double rectangle)
    {
        this.rectangle= rectangle;
        this.circles=circles;
        myCanvas= new Canvas();
        
        
    }

    public void draw()
    {   
       // myCanvas.setForegroundColor();
      //  myCcanvas.fillCircle(xPosition, yPosition, diameter);
    }

    /**
     * Erase this ball at its current position.
     **/
    public void erase()
    {
      //  canvas.eraseCircle(xPosition, yPosition, diameter);
    }





}

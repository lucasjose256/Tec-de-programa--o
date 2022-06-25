
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private int temperature;
    private int max;
    private int min;
    private int increment;
    /**
     * Constructor for objects of class Heater
     */
    public Heater(int min,int max)
    {
        this.min=min;
        this.max=max;
        increment=5;
        temperature = 15;
    }

    public void warmer()
    {
       if(!(temperature + 5 > max)){
        temperature=temperature+increment;
    }        
    }
     public void cooler()
    {
        if(!(temperature - 5 < min)){
        temperature=temperature-increment;
    }    
    }
    
    public int getTemperature(){
    
    return temperature;

}   public void setIncrement(int inc){
     if(inc>0){
    increment=inc;}
}
}

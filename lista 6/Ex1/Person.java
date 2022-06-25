
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String x;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name)
    {
        x=name;
        
    }

    public String changeName(String name)
    {
        x=name;
        return x;
    }
    public String  getName(){
    return x;
    }
}

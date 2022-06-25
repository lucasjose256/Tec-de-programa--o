
/**
 * Write a description of class Pessoa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pessoa
{
    private String name;
    
    
    /**
     * Create a new student with a given name and ID number.
     */
    public Pessoa(String fullName)
    {
        name = fullName;
       
    
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    public void print()
    {
        System.out.println(name+"  ");
    }
}

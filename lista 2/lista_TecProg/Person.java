
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;

    public Person(String name)
    {
        this.name=name;
        age=0;
       
    }

    public void setAge(int x)
    {
        age=x;
        
    }
    
    public void imprime(){
    
    System.out.println("The name of this person is'" + name);
    
    System.out.println("Age" + age);
    
        
    
    
    
    }
    
    
}

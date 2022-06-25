

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TwoHourTests.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TwoHourTests
{
    /**
     * Default constructor for test class TwoHourTests
     */
    public TwoHourTests()
    {
    }


    @Test
    public void test1()
    {
        //criando os compromissos
    Appointment a1= new Appointment("A",2);
    Appointment a2= new Appointment("B",2);
    Appointment a3= new Appointment("C",2);
   
    Day d1= new Day(1);
   //dizendo para o método assertEquals qual é o valor esperado
    assertEquals(true,d1.makeAppointment(12,a1));
    assertEquals(false, d1.makeAppointment(12,a2));
    assertEquals(true,d1.makeAppointment(16,a3));
   
        
        
    }
}


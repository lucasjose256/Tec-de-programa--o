

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestCalculator.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestCalculator
{
    /**
     * Default constructor for test class TestCalculator
     */
    public TestCalculator()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void plus(){
    
    CalcEngine c1 = new CalcEngine();
    
    c1.numberPressed(5);
    c1.plus();
    c1.numberPressed(5);
    c1.equals();

    assertEquals(10,c1.getDisplayValue());
    
    }
    @Test
      public void minus(){
    
    CalcEngine c1 = new CalcEngine();
    
    c1.numberPressed(10);
    c1.minus();
    c1.numberPressed(3);
    c1.equals();
    c1.getDisplayValue();
    assertEquals(7,c1.getDisplayValue());
    
    }
    
    
}

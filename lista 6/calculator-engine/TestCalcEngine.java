

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestCalcEngine.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestCalcEngine
{
    /**
     * Default constructor for test class TestCalcEngine
     */
    public TestCalcEngine()
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
    public void testPlus(){
      CalcEngine engine = new CalcEngine();
         // Limpando qualquer número que esteja na calculadora
        engine.clear();
        // Simulate the presses: 3 + 4 =
        engine.numberPressed(3);
        engine.plus();
        engine.numberPressed(4);
        engine.equals();
        
        assertEquals(7,engine.getDisplayValue());
  
    }    
    @Test
     public void testMinus()
    {   
        CalcEngine engine = new CalcEngine();
        // Limpando qualquer número que esteja na calculadora
        engine.clear();
        // Simulate the presses: 9 - 4 =
        engine.numberPressed(9);
        engine.minus();
        engine.numberPressed(4);
        engine.equals();
        
        assertEquals(5,engine.getDisplayValue());
    }
    @Test
    public void testAll(){
    
        testMinus();
        testPlus();
        
    }
    
}
    
    


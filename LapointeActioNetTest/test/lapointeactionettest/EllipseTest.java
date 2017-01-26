package lapointeactionettest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patrick
 */
public class EllipseTest {
    
    // basic delta we'll tolerate because doubles
    private static final double delta = 0.0001;
    
    // Perimeter delta we'll tolerate.  In addition to doubles being poor
    // representations of real numbers, the circumference formula for an
    // ellipse is an infinite series and itself an approximation
    private static final double perimeterDelta = 0.1;
    
    public EllipseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getArea method, of class Ellipse.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Ellipse instance = new Ellipse(5, 10);
        double expResult = 157.079632679;
        double result = instance.getArea();
        assertEquals(expResult, result, delta);
    }

    /**
     * Test of getPerimiter method, of class Ellipse.
     */
    @Test
    public void testGetPerimiter() {
        System.out.println("getPerimiter");
        Ellipse instance = new Ellipse(5, 10);
        double expResult = 48.44;
        double result = instance.getPerimiter();
        assertEquals(expResult, result, perimeterDelta);
    }
    
    
    /**
     * Test of creating ellipse with bad radii
     */
    @Test(expected=IllegalArgumentException.class)
    public void TestInvalidRadii(){
        System.out.println("create ellipse with bad radii");
        Ellipse badEllipse = new Ellipse(-3, -4);
    }
    
}

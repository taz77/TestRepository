/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class CircleTest {
    
    //Delta we'll tolerate because doubles
    private static final double delta = 0.0001;
    
    public CircleTest() {
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
     * Test of getArea method, of class Circle.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea unit circle");
        Circle instance = new Circle(1.0);
        double expResult = Math.PI;
        double result = instance.getArea();
        assertEquals(expResult, result, delta);
    }

    /**
     * Test of getPerimiter method, of class Circle.
     */
    @Test
    public void testGetPerimiter() {
        System.out.println("getPerimiter");
        Circle instance = new Circle(5);
        double expResult = 31.415926535898;
        double result = instance.getPerimiter();
        assertEquals(expResult, result, delta);
    }
    
    /**
     * Test of creating Circle with less than positive sizes
     */
    @Test(expected=IllegalArgumentException.class)
    public void CircleLessThanZero(){
        System.out.println("create circle with bad radius");
        Circle badCircle = new Circle(0);
    }
    
}

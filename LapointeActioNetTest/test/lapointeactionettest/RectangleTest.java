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
public class RectangleTest {
    
    //Delta we'll tolerate because doubles
    private static final double delta = 0.0001;
    
    public RectangleTest() {
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
     * Test of getArea method, of class Rectangle.
     */
    @Test
    public void testGetAreaSimple() {
        System.out.println("getArea simple integer sides");
        Rectangle instance = new Rectangle(5, 10);
        double expResult = 50;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of getArea method, of class Rectangle.
     */
    @Test
    public void testGetAreaDecimals() {
        System.out.println("getArea with floating points");
        Rectangle instance = new Rectangle(1234.56478, 9876.54321);
        double expResult = 12193232.3952;
        double result = instance.getArea();
        assertEquals(expResult, result, delta);
    }

    /**
     * Test of getPerimiter method, of class Rectangle.
     */
    @Test
    public void testGetPerimiterSimple() {
        System.out.println("getPerimiter");
        Rectangle instance = new Rectangle(5.5, 9.4);
        double expResult = 29.8;
        double result = instance.getPerimiter();
        assertEquals(expResult, result, delta);
    }
    
    /**
     * Test of creating Rectangle with less than positive sizes
     */
    @Test(expected=IllegalArgumentException.class)
    public void RectangleLessThanZero(){
        System.out.println("create less than zero sided rectangle");
        Rectangle badRectangle = new Rectangle(0, -1);
    }
    
}

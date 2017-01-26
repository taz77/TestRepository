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
public class TriangleTest {
    
    //Delta we'll tolerate because doubles
    private static final double delta = 0.0001;
    
    public TriangleTest() {
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
     * Test of getArea method, of class Triangle.
     * Simple case of a right triangle
     */
    @Test
    public void testGetAreaSimple() {
        System.out.println("getArea of simple right triangle");
        Triangle instance = new Triangle(5, 5, 7.071);
        double expResult = 12.5;
        double result = instance.getArea();
        assertEquals(expResult, result, delta);
    }
    
    /**
     * Test of getArea method, of class Triangle.
     * extreme obtuse
     */
    @Test
    public void testGetAreaObtuse() {
        System.out.println("getArea of obtuse right triangle");
        Triangle instance = new Triangle(10000, 10000, 14141);
        double expResult = 49999999.355231;
        double result = instance.getArea();
        assertEquals(expResult, result, delta);
    }

    /**
     * Test of getPerimiter method, of class Triangle.
     * simple equilateral
     */
    @Test
    public void testGetPerimiterSimple() {
        System.out.println("getPerimiter simple equilateral");
        Triangle instance = new Triangle(5, 5, 5);
        double expResult = 15;
        double result = instance.getPerimiter();
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of creating Triangle with invalid sizes
     */
    @Test(expected=IllegalArgumentException.class)
    public void TriangleInavlid(){
        System.out.println("create triangle with invalid sides");
        Triangle badTriangle = new Triangle(1, 2, 3);
    }
    
    /**
     * Test of creating Triangle with less than positive sizes
     */
    @Test(expected=IllegalArgumentException.class)
    public void TriangleLessThanZero(){
        System.out.println("create less than zero sided triangle");
        Triangle badTriangle = new Triangle(-1, 0, 0);
    }
    
}

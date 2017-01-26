/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapointeactionettest;

/**
 *
 * @author Patrick
 */
public class Ellipse implements Shape {

    private final double radiusA;
    private final double radiusB;
    
    public Ellipse(double radiusA,double radiusB){
        
        if(radiusA <= 0 || radiusB <= 0){
            throw new IllegalArgumentException("Radii must be greater than 0");
        }
        
        this.radiusA = radiusA;
        this.radiusB = radiusB;
    }

    @Override
    public double getArea() {
        return Math.PI * radiusA * radiusB;
    }

    @Override
    public double getPerimiter() {
        
        double h = Math.pow((radiusA - radiusB), 2) / 
                Math.pow((radiusA + radiusB), 2);
        
        double p = 0.0;
        double bc = 1.0; //binomial coefficient
        for(int i = 1; i <= 15; i++){
            bc += Math.pow(h, i) / Math.pow(4, i);
        }
        
        p = Math.PI * (radiusA + radiusB) * bc;
        
        return p;
    }
    
}

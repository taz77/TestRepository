package lapointeactionettest;

/**
 *
 * @author Patrick
 */
public class Circle implements Shape {
    
    private final double radius;
    
    public Circle(double radius){
        
        if(radius <= 0){
            throw new IllegalArgumentException("Circle must have positive "
                    + "radius");
        }
        
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimiter() {
        return 2 * Math.PI * radius;
    }
    
}

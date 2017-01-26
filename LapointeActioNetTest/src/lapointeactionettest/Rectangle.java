package lapointeactionettest;

/**
 *
 * @author Patrick
 */
public class Rectangle implements Shape {

    private final double length;
    private final double width;
    
    public Rectangle(double length, double width){
        
        if (length <= 0 || width <= 0){
            throw new IllegalArgumentException("Rectangle must have positive"
                    + "length and width");
        }
        
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimiter() {
        return 2 * (length + width);
    }
    
}

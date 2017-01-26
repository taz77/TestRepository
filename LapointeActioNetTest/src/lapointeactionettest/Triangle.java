package lapointeactionettest;

/**
 *
 * @author Patrick
 */
public class Triangle implements Shape {
    
    private final double sideA;
    private final double sideB;
    private final double sideC;
    
    public Triangle(double sideA, double sideB, double sideC){
        
        if(!validate(sideA, sideB, sideC)){
            throw new IllegalArgumentException("sides must be positive and no "
                    + "two sides added may be less than the third");
        }
        
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        //Heron's formula
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s-sideA) * (s-sideB) * (s-sideC));
    }

    @Override
    public double getPerimiter() {
        return sideA + sideB + sideC;
    }
    
    private boolean validate(double a, double b, double c){
        if(a <= 0 || b <= 0 || c <= 0){
            return false;
        }
        if((a + b) <= c || 
           (b + c) <= a ||
           (a + c) <= b){
            return false;
        }
        return true;
    }
    
}

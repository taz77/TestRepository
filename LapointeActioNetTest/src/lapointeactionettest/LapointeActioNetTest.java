package lapointeactionettest;

/**
 *
 * @author Patrick Lapointe
 * 
 */
public class LapointeActioNetTest {

    public static void main(String[] args) {
        //TODO = notes on lack of class member accessors in shapes
        String ast = "********************************************************";
        System.out.println(ast + "\n" + ast);
        System.out.println("Submitted for your approval, this is my ActioNet "
                + "coding test response\n");
        System.out.println("Few notes: Shapes don't have class member accessors.");
        System.out.println("I figured it was outside the scope of the exercise "
                + "so they're just\nimmutable calculation objects\n");
        System.out.println("The collection exercises will now execute.");
        System.out.println("\t\t~Patrick Lapointe, 1/25/2017");
        System.out.println(ast + "\n" + ast + "\n\n");
        
        CollectionExercise ce = new CollectionExercise();
        ce.runExercise();
        System.out.println("\n");
        ce.runKvpExercise();
        
        System.out.println(ast + "\n" + ast);
        
        DotNumberPrinter dnp = new DotNumberPrinter();
        dnp.printDotsAndNumbers(8);
    }
}

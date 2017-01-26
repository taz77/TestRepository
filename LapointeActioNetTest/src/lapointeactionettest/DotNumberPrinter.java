package lapointeactionettest;

/**
 *
 * @author Patrick
 */
public class DotNumberPrinter {
    
    /**
     * Refactored version of OriginalDotsAndNumbersAlgorithm
     * @param max total number of dot/number iterations
     * Actually unclear on wording here.  By "one control structure" do we mean
     * one single outer loop and that's it?  Or, one loop per iteration instead
     * of a J and K loop as in the original?
     * I'm using a loop per line.  There is no obvious way to say
     * "Print X characters" without a loop.  Still more succinct.
     */
    public void printDotsAndNumbers(int max){
        for(int i = 1; i <= max; i++){
            for(int j = 0; j < max; j++){
                System.out.print((j < max-i) ? "." : ""+i);
            }
            System.out.println();
        }
    }
    
    /**
     * the algorithm from exercise 3 to be refactored
     */
    public void OriginalDotsAndNumbersAlgorithm(){
        for(int i = 1; i <=5; i++){
            for (int j = 1; j <= (5-i); j++){
                System.out.print(".");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

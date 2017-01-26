package lapointeactionettest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Patrick
 */
public class CollectionExercise {
    
    private List<Integer> integerList1;
    private List<Integer> integerList2;
    
    /**
     * Runs the first two parts of the collections exercise
     */
    public void runExercise(){
        
        System.out.println("creating two lists...");
        
        init();
        
        printList(integerList1);
        printList(integerList2);
        
        System.out.format("\nCollection 1 contains %d elements\n"
                + "Collection 2 contains %d elements\n",
                integerList1.size(), integerList2.size());
        
        System.out.println("\nCombining lists without dupes and sorting...");
        
        List<Integer> combined = combineLists(integerList1, integerList2);
        Collections.sort(combined);
        
        System.out.println("Removing middle entry...");
        
        combined.remove(combined.size()/2);
        
        System.out.println("\nPrinting in reverse order...");
        
        printListReverse(combined);
        
        System.out.format("Combined collection contains %d elements\n",
                combined.size());
        
    }
    
    /**
     * Runs the third part of the collections exercise
     * 
     * The HashMap collection was chosen because we get the benefit of a unique
     * key associated with a single value.  It's also extremely fast.  We can
     * test the existence of a key at O(1).  Hashing is great!
     */
    public void runKvpExercise(){
        System.out.println("Adding five entries to a hashmap\n");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One!");
        map.put(2, "Two!");
        map.put(3, "Three!");
        map.put(4, "Four!");
        map.put(5, "Five!");
        
        System.out.println("At this point, we overwrite the value associated "
                + "with a key or test to see if it's already hashed.");
        
        int newKey = 3;
        String newValue = "ThreeAgain";
        
        if(!map.containsKey(newKey)){
            map.put(newKey, newValue);
        }
        else{
            System.out.format("Map already contains key %d associated with "
                    + "value: %s\n\n", newKey, map.get(newKey));
        }
                
        System.out.println(map);
        
        System.out.format("The hashmap contains %d entries.\n", map.size());
        System.out.println();
        
    }
    
    private void init(){
        //randomly populate the two collections
        integerList1 = new ArrayList<>();
        for(int i = 1; i <= 10; i++ ){
            integerList1.add(i);
        }
        
        integerList2 = new ArrayList<>();
        for(int i = 6; i <= 15; i++){
            integerList2.add(i);
        }
        
        shuffle(integerList1);
        shuffle(integerList2);
    }
    
    private void shuffle(List<Integer> list){
        Random rand = new Random();
        for(int i = list.size()-1; i > 0; i--){
            int j = rand.nextInt(i+1);
            //swap j and i elements
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
    
    private void printList(List<Integer> list){
        list.forEach((i) -> {
            System.out.print(i + " ");
        });
        System.out.println();
    }
    
    private void printListReverse(List<Integer> list) {
        for(int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    
    private ArrayList<Integer> combineLists(List<Integer> l1, List<Integer> l2){
        HashSet<Integer> set = new HashSet<>();
        set.addAll(l1);
        set.addAll(l2);

        ArrayList<Integer> combined = new ArrayList<>();
        set.forEach((i) -> {
            combined.add(i);
        });

        return combined;
    }
}

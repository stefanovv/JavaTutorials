package class_and_objects2;

import java.util.function.Function;

public class DataStructure {
    
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
     
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
     
    public void printEven() {
         
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    //Define a method named print(DataStructureIterator iterator). Invoke this 
    //method with an instance of the class EvenIterator so that it performs 
    //the same function as the method printEven.
    
    public void print(DataStructureIterator iterator){
    	while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    public void print(Function<Integer, Boolean> iterator){
    	int index = 0;
    	
    	for(int num: arrayOfInts){
    		if(iterator.apply(index)){
    			System.out.print(num + " ");
    		}
    		 
    		index++;
    	}
    	
    	System.out.println();
    }
    
    public static boolean isEvenIndex(int index){
    	return index % 2 == 0 ? true : false;
    }
    
    public static boolean isOddIndex(int index){
    	return index % 2 == 1 ? true : false;
    }
    
    public EvenIterator getEvenIterator(){
    	return new EvenIterator();
    }
    
    public int[] getArray(){
    	return this.arrayOfInts;
    }
     
    interface DataStructureIterator extends java.util.Iterator<Integer> { }
 
    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
     
    private class EvenIterator implements DataStructureIterator {
         
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
         
        public boolean hasNext() {
             
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }       
         
        public Integer next() {
             
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
             
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }
     
    public static void main(String s[]) {
        
        DataStructure ds = new DataStructure();
        
        //Even numbers with function
        ds.printEven();
        
        System.out.println("Inner and Anonymous classes:");
        //Print function with ready class
        ds.print(ds.getEvenIterator());
        //Print fun with anonym class
        ds.print(new DataStructureIterator() {
			
        	private int nextIndex = 1;
            
            public boolean hasNext() {
                return (nextIndex <= SIZE - 1);
            }       
             
            public Integer next() {
                Integer retValue = Integer.valueOf(ds.getArray()[nextIndex]);
                
                nextIndex += 2;
                return retValue;
            }
		});
        
        System.out.println("Lambda expressions: ");
        //With lambda print even
        ds.print(i -> i % 2 == 0 ? true : false);
        //With labmda print odd
        ds.print(i -> i % 2 == 1 ? true : false);
        
        System.out.println("Method references: ");
        //With method ref
        ds.print(DataStructure::isEvenIndex);
        ds.print(DataStructure::isOddIndex);
        
    }
}

/**
 * 
 */
package java8;

/**
 * @author MakineniH
 *
 */
import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SockMerchent {
	static int numOfMatchingPairs = 0;
	
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	
 
    	
    /*	List<Integer> arAsList = Arrays.stream(ar).boxed().collect(Collectors.toList());

    		Map<Integer, Long> frequencies = arAsList.stream()
    					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));*/
    	
       	/*	sockPairs.forEach(new Consumer<Long>() {

    				@Override
    				public void accept(Long t) {
    					numOfMatchingPairs += (t/2);
    				}
    			});	*/
    		
    		Map<Integer, Long> frequencies = IntStream.of(ar).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
     		
    		
    		/*List<Long> sockPairs = frequencies.values().stream().collect(Collectors.toList());   		
    		sockPairs.stream().forEach(t-> numOfMatchingPairs += (t/2))  ;	
    		*/
    		
    		//frequencies.values().stream().collect(Collectors.toList()).stream().forEach(t-> numOfMatchingPairs += (t/2))  ;	
    		frequencies.values().stream().forEach(t-> numOfMatchingPairs += (t/2))  ;	
 
    	 return numOfMatchingPairs;  	 
    }


    public static void main(String[] args) throws IOException {
        int n = 9;
        int[] ar = {1 ,1 ,3 ,1 ,2 ,1 ,3 ,3 ,3 ,3 };
        int result = sockMerchant(n, ar);
        System.out.println("Result = " + result);
        
        
  
    }
}

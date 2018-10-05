/**
 * 
 */
package java8;

/**
 * @author MakineniH
 *
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import javax.print.attribute.IntegerSyntax;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTriplets {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

	List<Integer> c = new ArrayList<Integer>();
		c.add(0);
		c.add(0);
		
		/*	for (int i = 0; i < a.size(); i++) {

			for (int j = 0; j < b.size(); j++) {
				if (i == j && a.get(i) > b.get(j)) {
					c.set(0, c.get(0) + 1);
				} else if (i == j && a.get(i) < b.get(j)) {
					c.set(1, c.get(1) + 1);
				}
			}
		}*/
		
		int[] alice = a.stream().mapToInt(Integer::intValue).toArray();
		int[] bob = b.stream().mapToInt(Integer::intValue).toArray();
		
		
	/*	IntStream.range(0, alice.length).forEach(new IntConsumer() {
			
			@Override
			public void accept(int value) {
				
				    IntStream.range(value==0 ?0:value, value+1).forEach(new IntConsumer() {
						
						@Override
						public void accept(int value2) {
							if(bob[value2] > alice[value2]){
								c.set(1, c.get(1) + 1);
							}else if (bob[value2] < alice[value2]) {
								c.set(0, c.get(0) + 1);
							}
							 System.out.println(alice[value2]);
							 System.out.println("------");
							 System.out.println(bob[value2]);
						}
					}); 
				    
				   
				    
				    System.out.println("-- End of Outer Loop --");
			}
		});
        */
		IntStream.range(0, alice.length).forEach(value -> {
			IntStream.range(value, value + 1).forEach(value2 -> {
				if (bob[value2] > alice[value2]) {
					c.set(1, c.get(1) + 1);
				} else if (bob[value2] < alice[value2]) {
					c.set(0, c.get(0) + 1);
				}
			});
		});

		 return c;
	}

	public static void main(String[] args) throws IOException {

		List<Integer> a = new ArrayList<Integer>();
		a.add(17);
		a.add(28);
		a.add(30);

		List<Integer> b = new ArrayList<Integer>();
		b.add(99);
		b.add(16);
		b.add(8);

		List<Integer> result = compareTriplets(a, b);
		System.out.println(result);
	}
}








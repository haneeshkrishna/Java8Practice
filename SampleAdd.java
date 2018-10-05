/**
 * 
 */
package java8;

import java.util.Arrays;
import java.util.stream.DoubleStream;

/**
 * @author MakineniH
 *
 */
public class SampleAdd {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
	  System.out.println(Arrays.stream(a).sum());
	}

}

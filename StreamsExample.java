/**
 * 
 */
package java8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author MakineniH
 *
 */
public class StreamsExample {
	
	public static void main(String[] args) {
		IntStream.range(1, 10).forEach(a-> System.out.print(a));
		System.out.println();
		System.out.println("--------------");
		
		IntStream.range(1, 10).skip(5).forEach(a->System.out.print(a));
		System.out.println();
		System.out.println("--------------");
		
		System.out.println(IntStream.range(1,10).sum());
		System.out.println();
		System.out.println("--------------");
		
		Stream.of( "Preethi" , "Haneesh" , "Makineni").sorted().findFirst().ifPresent(System.out::println);
		System.out.println();
		System.out.println("--------------");
		
		String[] names = { "Preethi" , "Haneesh" , "Makineni"};
		if(Arrays.stream(names).sorted().anyMatch(a->a.startsWith("H"))) {
			System.out.println("Elements starting with H are found");
		}else {
			System.out.println("Elements starting with H NOT are found");
		}
		
		System.out.println();
		System.out.println("--------------");
		
		Arrays.stream(new int[] {1,2,3,4,5,6,}).map(x->x*x).average().ifPresent(System.out::println);
		
	}

}

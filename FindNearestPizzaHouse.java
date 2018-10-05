/**
 * 
 */
package java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import javax.print.attribute.HashAttributeSet;

/**
 * @author MakineniH
 * 
 *         Main method has a list of Co-ordinates and Total number of Pizza
 *         stores near house and number of stores to be returned.
 * 
 *         Near stores are found by the formula sqrt(a^2+b^2). Less value is
 *         nearest store
 * 
 *         Return the stores limited to numberOfStoresToReturn
 *
 */
public class FindNearestPizzaHouse {

	public static void main(String[] args) {
		List<Integer> coOrdinates1 = new ArrayList<Integer>();
		coOrdinates1.add(1);
		coOrdinates1.add(2);
		List<Integer> coOrdinates2 = new ArrayList<Integer>();
		coOrdinates2.add(3);
		coOrdinates2.add(1);
		List<Integer> coOrdinates3 = new ArrayList<Integer>();
		coOrdinates3.add(0);
		coOrdinates3.add(0);

		List<List<Integer>> coOrdinates = new ArrayList<List<Integer>>();
		coOrdinates.add(coOrdinates1);
		coOrdinates.add(coOrdinates2);
		coOrdinates.add(coOrdinates3);

		int totalStoresNearHouse = 3;
		int numberOfStoresToReturn = 2;

		List<List<Integer>> nearestStores = findNearStores(coOrdinates, totalStoresNearHouse, numberOfStoresToReturn);
		System.out.println(nearestStores);
	}

	/**
	 * @param coOrdinates
	 * @param totalStoresNearHouse
	 * @param numberOfStoresToReturn
	 * @return
	 */
	private static List<List<Integer>> findNearStores(List<List<Integer>> coOrdinates, int totalStoresNearHouse,
			int numberOfStoresToReturn) {

		Map<Double, List<Integer>> distanceMap = new TreeMap<Double, List<Integer>>();

		/*
		 * for (int i = 0; i < totalStoresNearHouse; i++) {
		 * distanceMap.put(Math.sqrt( Math.pow(coOrdinates.get(i).get(0),
		 * 2)+Math.pow(coOrdinates.get(i).get(1), 2) ) , coOrdinates.get(i)); }
		 * 
		 * coOrdinates.forEach(new Consumer<List<Integer>>() {
		 * 
		 * @Override public void accept(List<Integer> t) {
		 * distanceMap.put(Math.sqrt( Math.pow(t.get(0), 2)+Math.pow(t.get(1),
		 * 2) ) , t);
		 * 
		 * } });
		 * 
		 * We can use TreeMap instead of Hashmap Map<Double, List<Integer>>
		 * distanceMap2=
		 * distanceMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).
		 * collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		 * (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		 * 
		 * To Convert Map Values to List List<List<Integer>> collect =
		 * distanceMap.values().stream().collect(Collectors.toList());
		 * 
		 */

		coOrdinates.stream().forEach(t -> distanceMap.put(Math.sqrt(Math.pow(t.get(0), 2) + Math.pow(t.get(1), 2)), t));
		List<List<Integer>> collect = distanceMap.values().stream().limit(numberOfStoresToReturn)
				.collect(Collectors.toList());
	
		 
		 return collect;
		 
	}

}

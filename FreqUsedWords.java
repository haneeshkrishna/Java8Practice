/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Predicate;

/**
 * @author MakineniH
 *
 */
public class FreqUsedWords {
	
	public static void main(String[] args) {
		ArrayList<String> excludeWords = new ArrayList<String> ();
		excludeWords.add("a");
		excludeWords.add("an");
		excludeWords.add("the");
		excludeWords.add("is");
		String sentenceText = "is a men two men is the men is.";
		List<String> frequentWords = findFreqWords(sentenceText , excludeWords); 
		
	}

	/**
	 * @param sentenceText
	 * @param excludeWords
	 * @return
	 */
	private static List<String> findFreqWords(String sentenceText, ArrayList<String> excludeWords) {
		
		TreeMap<String , Integer> wordsMap = new TreeMap<String , Integer>();
		sentenceText = sentenceText.replaceAll("[^a-zA-Z0-9\\s+]", " ");
	//	System.out.println(sentenceText);
		String[] wordsArr = sentenceText.split("\\s+");
		//Arrays.stream(wordsArr).forEach(System.out::println);
		//excludeWords.forEach(a->{System.out.println(a);});
		
	 
	 
		Collections.unmodifiableCollection(excludeWords);
		excludeWords.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return false;
			}
		});
		
		int count = 1;
		
		for(String word : wordsArr){
			if(!excludeWords.contains(word)){
				if(wordsMap.containsKey(word)){
					count = wordsMap.get(word);
					count++;
				}
				wordsMap.put(word, count);				
			}
		}
		
		
		
		
		
	 wordsMap.entrySet().forEach(w->{ if(w.getValue() >1 )
		 System.out.println("key->" + w.getKey() + ", Value ->" + w.getValue() );		 
	 });
		return null;
	}

}

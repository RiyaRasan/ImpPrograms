package StringPrograms;

import java.util.HashMap;

public class CountOccurrencesOfEachWordInString {

	public static void main(String[] args) {
		String str="Test Java Automation Test";
		String words[]= str.split(" ");
		
		HashMap<String, Integer> mapOb = new HashMap<>();
		
		for(String word : words) {
			if(mapOb.containsKey(word)){
				mapOb.put(word, mapOb.get(word)+1);
			}else {
				mapOb.put(word,1);
			}
		}
		
		System.out.println("Count Occurrences Of Each Word In String\n" + mapOb);
	}
}

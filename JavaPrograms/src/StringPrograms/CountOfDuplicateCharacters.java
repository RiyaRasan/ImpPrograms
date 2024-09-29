package StringPrograms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CountOfDuplicateCharacters {

	public static void main(String[] args) {

		String str = "riya rasanbhaire";
		
		HashMap<Character, Integer> charcount= new HashMap<Character, Integer>();
		
		//Converting string into character array
		char[] strArray = str.toCharArray();
		
		//Putting character and their count in hashmap
		for(char ch:strArray) {
			
			if(charcount.containsKey(ch)) {
				charcount.put(ch, charcount.get(ch)+1);
			}else {
				charcount.put(ch, 1);
			}
		}
		
		//Reading keys with their values
		//Used set because it will not store duplicate characters
		Set<Character> ob =  charcount.keySet();
		
		for(char setOb : ob) {
			if(charcount.get(setOb)>1) {
				System.out.println(setOb + ":" + charcount.get(setOb));
			}
		}
	}

}

package ArrayArrayListPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveRepeatedElementsFromArray {

	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
		
		// Step 1: Count occurrences of each element using a HashMap
		Map<Integer, Integer> countMap = new HashMap<>();
		
		for(int num: arr) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}
		
		// Step 2: Identify elements with count = 1 (non-repeated)
		List<Integer> nonRepeatedElements = new ArrayList<>();
		for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if(entry.getValue()==1) {
				nonRepeatedElements.add(entry.getKey());
			}
		}	
		
		// Step 3: Print the array list
		System.out.println("Non repeated elements of array: " + nonRepeatedElements);
	}
}

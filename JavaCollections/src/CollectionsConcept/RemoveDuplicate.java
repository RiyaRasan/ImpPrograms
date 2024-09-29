package CollectionsConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		//Method 1-->LinkedHashSet: Duplicates are removed but order of insertion is NOT affected
		ArrayList<Integer> arr1=new ArrayList<Integer>(Arrays.asList(3,4,1,2,2,3,4,5,5,6,7,8,8,9,9,9,8,9));
		LinkedHashSet<Integer> arr2=new LinkedHashSet<Integer>(arr1);
		ArrayList<Integer> arrWithoutDuplicates= new ArrayList<Integer>(arr2);
		System.out.println(arrWithoutDuplicates);//[3, 4, 1, 2, 5, 6, 7, 8, 9]
		
		//Method 2-->JDK 8: stream()
		ArrayList<Integer> markList= new ArrayList<Integer>(Arrays.asList(3,4,1,2,2,3,4,5,5,6,7,8,8,9,9,9,8,9));
		List<Integer> uniqueMarks= markList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueMarks);//[3, 4, 1, 2, 5, 6, 7, 8, 9]
	}

}

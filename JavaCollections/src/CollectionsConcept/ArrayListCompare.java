package CollectionsConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		
		//1) First sort then compare
		ArrayList<String> l1=new ArrayList<String>(Arrays.asList("A", "B","C", "D", "E"));
		ArrayList<String> l2=new ArrayList<String>(Arrays.asList("A", "B","C", "D", "F"));
		ArrayList<String> l3=new ArrayList<String>(Arrays.asList("A", "B","C", "E", "D"));

		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1.equals(l2));//false
		System.out.println(l1.equals(l3));//false
		
		Collections.sort(l3);
		System.out.println(l1.equals(l3));//true
		
		//2) Compare two list- finding out extra elements in an arrayList		
		ArrayList<String> l4=new ArrayList<String>(Arrays.asList("A", "B","C", "D", "E"));
		ArrayList<String> l5=new ArrayList<String>(Arrays.asList("A", "B","C", "D", "F"));
		
		//It will remove all common elements and will fetch only those elements which are present in l4 but not in l5
		l4.removeAll(l5);
		System.out.println(l4);//[E]
		
		//3) Find out common elements
		ArrayList<String> lang1=new ArrayList<String>(Arrays.asList("Java","Python","Ruby","C#","JS"));
		ArrayList<String> lang2=new ArrayList<String>(Arrays.asList("Java","Python","Ruby","C#","PHP"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);//[Java, Python, Ruby, C#]	
	}

}

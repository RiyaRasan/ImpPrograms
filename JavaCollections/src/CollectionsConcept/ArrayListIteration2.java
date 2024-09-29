package CollectionsConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIteration2 {

	public static void main(String[] args) {
		
		ArrayList<Object> arr= new ArrayList<Object>();
		
		arr.add("Reyansh");//0
		arr.add("Boy");//1
		arr.add(7);//2
		arr.add('H');//3
		arr.add(true);//4
		arr.add(1.2);//5
		
		System.out.println(arr);//[Reyansh, Boy, 7, H, true, 1.2]
//		System.out.println(arr.get(6));//IndexOutOfBoundsException
		
		
		
		//List with other collection
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);//[10, 20, 30, 40]
	}
}



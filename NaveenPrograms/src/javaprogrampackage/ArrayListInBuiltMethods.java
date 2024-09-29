package javaprogrampackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListInBuiltMethods {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Tom");//0
		names.add("Peter");//1
		names.add("Lisa");//2
		names.add("Ravi");//3
		
		System.out.println(names);//[Tom, Peter, Lisa, Ravi]
		
		Collections.sort(names);
		System.out.println(names);//[Lisa, Peter, Ravi, Tom]
		
		Collections.swap(names, 0, 3);
		System.out.println(names);//[Tom, Peter, Ravi, Lisa]
		
		Collections.swap(names, 2, 3);
		System.out.println(names);//[Tom, Peter, Lisa, Ravi]
		
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);//Tom, Ravi, Peter, Lisa]
		
		if(names.contains("Peter")) {
			System.out.println("Peter is present in the list");
		}
		names.clear();
		System.out.println(names);
		
/*		ArrayList<Integer> arr=new ArrayList<Integer>();//ArrayList with generics
		arr.add(100);
		arr.add(2);
		arr.add(300);
		arr.add(40);
		System.out.println(arr);//[100, 2, 300, 40]
		Collections.sort(arr);
		System.out.println(arr);//[2, 40, 100, 300]
		
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);//[300, 100, 40, 2]
*/		
/*		
		ArrayList<Integer> arr2=new ArrayList<Integer>();//ArrayList with generics
		arr2.add(100);
		arr2.add(200);
		arr2.add(300);
		arr2.add(400);
		System.out.println(arr2);
		
		//addAll()
		arr.addAll(arr2);
		System.out.println(arr);
		
	*/	
		
//		int ar[]= {1,2,3,4};//Static array, array literal
//		
//		System.out.println(ar);
//		System.out.println(Arrays.toString(ar));   
		

	}
}

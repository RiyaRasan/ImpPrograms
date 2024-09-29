package CollectionsConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListIteration3 {

	public static void main(String[] args) {
		
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Java");
		arr1.add("C");
		arr1.add("C++");
		arr1.add("Python");
		
		ArrayList<String> arr2= new ArrayList<String>();
		arr2.add("Tester");
		arr2.add("Dev ops");
		
		//addAll()
//		arr1.addAll(arr2);
//		System.out.println(arr1);//[Java, C, C++, Python, Tester, Dev ops]
		
//		arr1.addAll(2, arr2);
//		System.out.println(arr1);//[Java, C, Tester, Dev ops, C++, Python]
		
		//clear()
//		arr1.clear();
//		System.out.println(arr1);//[]
		
		//clone()
		ArrayList <String> clonedArr=(ArrayList<String>) arr1.clone();
		System.out.println(clonedArr);//[Java, C, C++, Python]
		
		//contains()
		System.out.println(arr1.contains("Java"));//true
		
		//indexOf()
		System.out.println(arr1.indexOf("Python"));//3
		System.out.println(arr1.indexOf("Python")>0);//true
		
		//Arrays.asList()
		ArrayList<String> arr3=new ArrayList<String>(Arrays.asList("Riya", "Reyansh", "Yogesh", "Rasanbhaire", "Riya"));
		System.out.println(arr3);//[Riya, Reyansh, Yogesh, Rasanbhaire, Riya]
		
		//lastIndexOf()
		System.out.println(arr3.lastIndexOf("Riya"));//4
		System.out.println(arr3.lastIndexOf("Test"));//-1
		
		//remove()
		arr3.remove(3);
		System.out.println(arr3);//[Riya, Reyansh, Yogesh, Riya]
		arr3.remove(0);
		System.out.println(arr3);//[Reyansh, Yogesh, Riya]

		//Using removeIf() and lamba ->  to remove all even numbers out of the arrayList
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		numbers.removeIf(num -> num%2==0);
		System.out.println(numbers);//[1, 3, 5, 7, 9]
		
		//retainAll(Collections.singleton("Tom"))
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Tom","Harry","Lisa","John","Tom", "Peter", "Steve"));
		System.out.println(nameList);//[Tom, Harry, Lisa, John, Tom, Peter, Steve]
		
		nameList.retainAll(Collections.singleton("Tom"));
		System.out.println(nameList);//[Tom, Tom]
		
		//subList()
		ArrayList<Integer> arr4= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		ArrayList<Integer> subList= new ArrayList<Integer>(arr4.subList(2,6));
		System.out.println(subList);//[3, 4, 5, 6]
		
		//toArray()
		ArrayList<String> arr5= new ArrayList<String>(Arrays.asList("Tom","Harry","Lisa","John","Tom", "Peter", "Steve"));
		Object arr[]=arr5.toArray();
		System.out.println(Arrays.toString(arr));//[Tom, Harry, Lisa, John, Tom, Peter, Steve]
		
		for(Object ob:arr) {
			System.out.println(ob);
			/*
			 	Tom
				Harry
				Lisa
				John
				Tom
				Peter
				Steve	
				*/		 
		}
		
	}

}

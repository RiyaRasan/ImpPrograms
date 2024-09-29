package ArrayArrayListPrograms;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String arr[]= {"java","C++","C++","Python","java","C"};
		
		//Approach 1
//		boolean flag=false;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("Found duplicate element in array: "+ arr[i]);
//					flag=true;
//				}
//			}
//		}
//		if(flag==false){
//			System.out.println("Duplicate element NOT found");
//		}
		
		
		//Approach 2-  HashSet allows to add unique values only. Duplicates are NOT allowed in HashSet
		HashSet <String> langs= new HashSet();
		
		/*
		 * System.out.println(langs.add("java"));//true
		 * System.out.println(langs.add("C++"));//true
		 * System.out.println(langs.add("C++"));//false
		 * System.out.println(langs.add("Python"));//true
		 * System.out.println(langs.add("java"));//false
		 * System.out.println(langs.add("C"));//true
		 */	
		boolean flag=false;
		for(String la:arr)	{
			if(langs.add(la)==false) {
				System.out.println("Found duplicate element in array: "+ la);
				flag=true;
			}
		}
		
		if(flag==false){
			System.out.println("Duplicate element NOT found");
		}
	}
}

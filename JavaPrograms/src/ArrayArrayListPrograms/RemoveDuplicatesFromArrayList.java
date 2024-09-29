package ArrayArrayListPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<>();
		alist.add(5);
		alist.add(2);
		alist.add(9);
		alist.add(1);
		alist.add(6);
		alist.add(2);
		alist.add(5);
		
		//Passing object of ArrayList as HashSet Parameter
		Set<Integer> setOb=new HashSet<Integer>(alist);
		System.out.println("ArrayList with duplicates removed: ");
		
		for(int num:setOb) {
			System.out.println(num + " ");
		}
	}
}

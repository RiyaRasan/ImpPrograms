package javaprogrampackage;

import java.util.ArrayList;

public class ArrayListRemoveConcept {

	public static void main(String[] args) {
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		System.out.println(marksList.size());//0
		
		marksList.add(100);//index0
		marksList.add(200);//index1
		marksList.add(11);//index2
		marksList.add(20);//index3
		
		System.out.println(marksList.get(0));//100
		System.out.println(marksList.get(2));//11
		marksList.remove(2);
		System.out.println(marksList.get(2));//20		
		marksList.add(400);//index4		
		System.out.println(marksList.get(3));//400		
		marksList.add(0, 150);
		System.out.println(marksList.get(0));//150
		marksList.add(7, 1000);//index7, IndexOutOfBoundsException
		System.out.println(marksList.get(7));
		
		for(int i=0; i<marksList.size(); i++) {
			System.out.println(i+ ":" + marksList.get(i));
		}
	}
}

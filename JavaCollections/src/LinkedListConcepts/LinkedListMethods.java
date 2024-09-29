package LinkedListConcepts;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		System.out.println(names.size());//0
		names.add("Tom");
		names.add("Naveen");
		System.out.println(names.size());//2
	}

}

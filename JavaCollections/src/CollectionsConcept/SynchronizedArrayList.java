package CollectionsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		nameList.add("Java");
		nameList.add("Python");
		nameList.add("Ruby");
		
		//add() and remove() --> don't need explicit synchronization
		//to fetch/traverse through the values from the list -->explicit synchronization is needed
		synchronized(nameList) {
			Iterator<String> it=nameList.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		//copyOnWriteArrayList--> It is a class. It is thread safe and synchronized already. import java.util.concurrent.CopyOnWriteArrayList
		CopyOnWriteArrayList<String> empList=new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Steve");
		empList.add("Naveen");
		
		//We don't need explicit synchronization for adding, removing and traversing through the ArrayList
		Iterator<String> it=nameList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

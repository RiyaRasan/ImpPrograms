package HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedMap {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Reyansh", "7");
		map1.put("Riya", "30");
		map1.put("Yogesh", "37");
		
		//Synchronized Map
		Map<String,String> map2 = Collections.synchronizedMap(map1);
		System.out.println(map2);//{Yogesh=37, Reyansh=7, Riya=30}
		
		//ConcurrentHashMap: It does not throw any ConcurrentModificationException
		ConcurrentHashMap<String, String> concurrentMap=new ConcurrentHashMap<>();
		concurrentMap.put("A", "Java");
		concurrentMap.put("B", "Python");
		concurrentMap.put("C", "Ruby");
		System.out.println(concurrentMap.get("A"));//Java
	}

}

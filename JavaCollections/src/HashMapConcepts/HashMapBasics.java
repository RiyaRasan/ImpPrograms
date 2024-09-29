package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
			
/*HASHMAP
 * 
 * 1) Collection which does not maintain indexing or order. 
 * 2) It store data in the form of key and value (K,V). 
 * 3) In hashmap, keys cannot be duplicate.
 * 4) In hashMap, keys cannot be duplicate. If keys are duplicate, no error is thrown but the latest value of key is given.
 * 5) Hashmap allows multiple null values but only one null key. 
 * 6) Hashmap is unsynchronized.
 */
		
		HashMap<String, String> capitalMap=new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London11");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "Moscow");
		
		System.out.println(capitalMap.get("India"));//New Delhi
		System.out.println(capitalMap.get("Germany"));//null
		System.out.println(capitalMap.get("UK"));//London11
		System.out.println(capitalMap.get(null));//Moscow
		
		//Iterator over the keys by using keySet()
		Iterator<String> it=capitalMap.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			capitalMap.get(key);
//			New Delhi
//			null
//			London11
//			Moscow
		}
		
		System.out.println("-------------------------");
		
		//Iterator over the set(key value pair) by using entrySet()
		Iterator<Entry<String, String>> it1=capitalMap.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> entry=it1.next();
			System.out.println("KEY="+ entry.getKey() + " and VALUE="+ entry.getValue());	
//			KEY=null and VALUE=Moscow
//			KEY=USA and VALUE=Washington DC
//			KEY=UK and VALUE=London11
//			KEY=India and VALUE=New Delhi
		}
		
		//remove()
		capitalMap.remove("UK");
		
		System.out.println("-------------------------");	
		
		//Iterate hashmap using Java 8 for each and lambda
		capitalMap.forEach((k,v)-> System.out.println("KEY="+ k + " and VALUE="+ v));
//		KEY=null and VALUE=Moscow
//		KEY=USA and VALUE=Washington DC
//		KEY=India and VALUE=New Delhi
	}

}

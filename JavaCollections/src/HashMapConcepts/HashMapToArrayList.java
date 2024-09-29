package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> companyMap=new HashMap<>();
		companyMap.put("Amazon", 10000);
		companyMap.put("Google", 20000);
		companyMap.put("Oracle", 5000);
		companyMap.put("Microsoft", 25000);
		
		Iterator it= companyMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pairs= (Map.Entry) it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}
		System.out.println("-----------");
		
		//Convert HashMap into ArrayList
		ArrayList<String> companyNamesList=new ArrayList<>(companyMap.keySet());
		for(String s:companyNamesList) {
			System.out.println(s);
		}
		
		System.out.println("-----------");
		ArrayList<Integer> empNamesList = new ArrayList<>(companyMap.values());
		for(Integer emp:empNamesList) {
			System.out.println(emp);
		}
	} 
}

package HashMapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {

	public static Map<String, Integer> marksMap;
	static {
		marksMap= new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}
	public static void main(String[] args) {
		
		//1) Using HashMap class
		HashMap<String, String> map1=new HashMap<>();
		Map<String, String> map2=new HashMap<>();//Top casting
		
		//2) Static way- Static hashMap
		System.out.println(HashMapInitialization.marksMap.get("A"));//100
		
		//3) Immutable(cannot be changed) map with only single entry
		Map<String, Integer> map3=Collections.singletonMap("test",10);
		System.out.println(map3.get("test"));//10
//		map3.put("test2",20);//java.lang.UnsupportedOperationException
		
		//4)(Methods introduced after JDK 1.8) Creating one 2D array of Strings using Stream and collecting in the of Map
		Map<String, String> map4= Stream.of(new String[][]{
			{"Tom", "A Grade"},
			{"Lisa", "B Grade"},
		}).collect(Collectors.toMap(data->data[0], data->data[1]));
		
		System.out.println(map4.get("Tom"));//A Grade
		System.out.println(map4.get("Lisa"));//B Grade
		
		//4)Using SimpleEntry: Immutable map
		Map<String, String> map5=Stream.of(
				new AbstractMap.SimpleEntry<>("Riya","Java"),
				new AbstractMap.SimpleEntry<>("Tom","Python")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map5.get("Riya"));//Java
		
		//From jdk 1.9
		//5) Empty map
		Map<String, String> map6=Map.of();
//		map6.put("Riya", "Rasanbhaire");//java.lang.UnsupportedOperationException
		System.out.println(map6.get("Riya"));//null
		
		Map<String,String> singleTonMap=Map.of("k1","v1");
		System.out.println(singleTonMap.get("k1"));//v1
//		singleTonMap.put("k2", "v2");//java.lang.UnsupportedOperationException
		
		//6) Multi map: Support maximum 10 key value pair
		Map<String, String> multiMap=Map.of("Reyansh","5-8-16","Riya","6-10-92","Yogesh","2-3-86");
		System.out.println(multiMap.get("Reyansh"));//5-8-16
		
		//7) Map.ofEntries: No limitation on number of key value pair
		Map<String, String> map7=Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A","1000"),
				new AbstractMap.SimpleEntry<>("B","2000"),
				new AbstractMap.SimpleEntry<>("C","3000")
				);
		System.out.println(map7.get("A"));//1000
//		map7.put("D", "4000");//java.lang.UnsupportedOperationException
		
    	//8) Map using Guava dependency
/*		Map<String, String> titleMaps= ImmutableMap.of("Google","Google India", "Amazon","Amazon Shopping");
		System.out.println(titleMaps.get("Amazon"));
		
//		titleMaps.put("Rediff", "Rediff India");//java.lang.UnsupportedOperationException*/
	}

}

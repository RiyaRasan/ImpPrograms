package TreeMapConcepts;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapConcept {
	 public static void main(String[] args) {
	 
		 TreeMap<Integer, String> map = new TreeMap<>();
		 map.put(1000, "Tom");
		 map.put(2000, "Peter");
		 map.put(3000, "Steve");
		 map.put(11000, "Naveen");
		 map.put(1400, "Robby");
		 
		 //By default, data printed in ascending order
		 System.out.println(map);//{1000=Tom, 1400=Robby, 2000=Peter, 3000=Steve, 11000=Naveen}
		 
		 System.out.println(map.lastKey());//11000
		 System.out.println(map.firstKey());//1000
		 
		 //Print keys<3000
		 Set<Integer> keysLessThan3K=map.headMap(3000).keySet();
		 System.out.println(keysLessThan3K);//[1000, 1400, 2000]
		 
		 //Print keys>=3000
		 Set<Integer> keysGreatThan3K=map.tailMap(3000).keySet();
		 System.out.println(keysGreatThan3K);//[3000, 11000]
		 
		 //Data is printed in ascending order
		 TreeMap<String, Integer> UserMap = new TreeMap<>();
		 UserMap.put("James", 100);
		 UserMap.put("Brad", 200);
		 UserMap.put("Albert", 400);
		 UserMap.put("George", 50);
		 UserMap.put("Larry", 900);
		 UserMap.put("Ted", 120);
		 UserMap.put("Paul", 300);
		
		 UserMap.forEach((k,v)->System.out.println("key=" + k + " value=" + v));
		 /* key=Albert value=400
		 key=Brad value=200
		 key=George value=50
		 key=James value=100
		 key=Larry value=900
		 key=Paul value=300
		 key=Ted value=120 */
		 
		 //Data is printed in descending order
		 TreeMap<String, Integer> map1 = new TreeMap<>(Comparator.reverseOrder());
		 map1.put("Ziva", 100);
		 map1.put("Brad", 200);
		 map1.put("Albert", 400);
		 map1.put("George", 50);
		 map1.put("Larry", 900);
		 map1.put("Ted", 120);
		 map1.put("Robby", 300);
		 
		 System.out.println(map1);//{Ziva=100, Ted=120, Robby=300, Larry=900, George=50, Brad=200, Albert=400} 
		 
		 map1.forEach((k,v)->System.out.println("key=" + k + " value=" + v));
		 
		/*
		 key=Ziva value=100
		 key=Ted value=120
		 key=Robby value=300
		 key=Larry value=900
		 key=George value=50
		 key=Brad value=200
		 key=Albert value=400
		 */
	 }
}



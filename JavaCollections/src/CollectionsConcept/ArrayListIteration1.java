package CollectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayListIteration1{  
	public static void main(String args[]){  
		
		ArrayList<String> studentList=new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Naveen");
		studentList.add("Lisa");
		studentList.add("Riya");
		
		//Reading elements of array list 
		//1) using simple for loop
		for(int i=0; i<studentList.size();  i++){
			System.out.println(studentList.get(i));
		}
		System.out.println("--------");
		
		//2) For each loop
		for(String s:studentList){
			System.out.println(s);
		}
		System.out.println("--------");
		
		//3 JDK 8: Stream with lamba
		studentList.stream().forEach(ele ->System.out.println(ele));
		System.out.println("--------");
		
		//4 Iterator
		Iterator<String> it = studentList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}  
} 
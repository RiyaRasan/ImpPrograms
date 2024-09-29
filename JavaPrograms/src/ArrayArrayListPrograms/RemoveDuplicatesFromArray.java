package ArrayArrayListPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,2,3,4,5,7,8,6};
		
		Set<Integer> setOb=new HashSet<Integer>();
		
		//Adding numbers to the Set because it will not store duplicate values
		for(int num:arr) {
			setOb.add(num);
		}
		
		//Setting final array size = Set size
		int[] finalArr= new int[setOb.size()]; 
		
		//Storing Set values into final array
		int i=0;
		for(int num:setOb) {
			finalArr[i]=num;
			i++;
		}
		
		//Array with duplicates removed
		for(int num:finalArr) {
			System.out.println(num + " ");
		}
	}
}

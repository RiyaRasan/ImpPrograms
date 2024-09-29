package StreamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: Program to separate even and odd numbers using stream function.
 */

public class SeparateEvenAndOddNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//Print the even numbers using stream()
//		numbers.stream().filter(num->num%2==0).forEach(System.out::println);
		
		
		//Put all the numbers into a map with key as true for even numbers and false for odd numbers
		Map<Boolean, List<Integer>> mapOb = numbers.stream().collect(Collectors.partitioningBy(num->num%2==0));
		
		//List that will contain all the true values (even numbers)
		List<Integer> evenNumbers = mapOb.get(true);
		
		//List that will contain all the false values (odd numbers)
		List<Integer> oddNumbers = mapOb.get(false);
		
		System.out.println("Even numbers: " + evenNumbers);
		System.out.println("Odd numbers: " + oddNumbers);		
	}
}

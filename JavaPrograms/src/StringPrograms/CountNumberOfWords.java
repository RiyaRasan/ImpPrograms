package StringPrograms;

import java.util.Scanner;

public class CountNumberOfWords {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=0;
		
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		String [] words= str.split(" ");
		for(int i=0;i<words.length;i++) {
			count++;
		}
		System.out.println("Number of words = " + count);
	}
}

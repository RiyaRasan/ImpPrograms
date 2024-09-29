package StringPrograms;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String reverseString="";
		
		System.out.println("Enter a string");
		String str = sc.nextLine();
		char strArray[]= str.toCharArray();
		for(int i=0;i<strArray.length;i++) {
			reverseString= strArray[i]+ reverseString;
		}

		System.out.println("ReverseString=" + reverseString);
		
		if(reverseString.equalsIgnoreCase(str)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}
}

package StringPrograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String reverseString="";
		
		System.out.println("Enter a string");
		String str1 = sc.nextLine();
		
		System.out.println("InitialString="+ str1);
		
//		StringBuffer sb1= new StringBuffer(str1);
//		System.out.println("Reverse of str1="+ sb1.reverse());
		
//		StringBuilder sb2= new StringBuilder(str1);
//		System.out.println("Reverse of str1="+ sb2.reverse());
		
		
		
		for(int i=0;i<str1.length();i++) {
			reverseString = str1.charAt(i) + reverseString;
		}
		System.out.println("ReverseString="+ reverseString);
	}
}

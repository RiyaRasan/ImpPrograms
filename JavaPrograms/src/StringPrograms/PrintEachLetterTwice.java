package StringPrograms;

import java.util.Scanner;

public class PrintEachLetterTwice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		StringBuilder sbui = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			sbui.append(ch).append(ch);
		}	
		System.out.println(sbui.toString()); 
	}
}

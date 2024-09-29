package StringPrograms;

import java.util.Scanner;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String initialString, reverseString="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		initialString = sc.nextLine();
		
		System.out.println("InitialString="+ initialString);
		
		//Create string array of words
		String words[] = initialString.split(" ");
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String reverseWord="";
			
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println("ReverseString=" + reverseString);
	}

}


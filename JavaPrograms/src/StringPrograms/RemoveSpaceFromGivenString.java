package StringPrograms;

import java.util.Scanner;

public class RemoveSpaceFromGivenString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		
		String finalString = removeSpaceFromStringLogic(str);
		System.out.println("Final String: " + finalString);
	}
	
	public static String removeSpaceFromStringLogic(String str) {
		StringBuilder sbu = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				sbu.append(str.charAt(i));	
			}
		}
		
		return sbu.toString();
	}
}

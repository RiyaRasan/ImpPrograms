package StringPrograms;

import java.util.Scanner;

public class GetCharactersAtEvenIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		getCharactersAtEvenIndexLogic(str);
	}

	public static void getCharactersAtEvenIndexLogic(String str) {
		for(int i=0; i< str.length(); i++) {
			if(i%2==0) {
				System.out.print(str.charAt(i) + " ");
			}
		}
	}
}

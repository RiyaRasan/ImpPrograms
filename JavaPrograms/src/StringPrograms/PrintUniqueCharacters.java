package StringPrograms;
import java.util.Scanner;

public class PrintUniqueCharacters { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a string: "); 
		String str = sc.nextLine(); 
		System.out.println("Unique characters in \"" + str + "\":"); printUniqueCharLogic(str); 
	} 
	
	public static void printUniqueCharLogic(String str) {
		// Assume ASCII characters (0-127), use boolean array to track character occurrences 
		boolean[] unique = new boolean[128]; 
		for (int i = 0; i < str.length(); i++) { 
			char ch = str.charAt(i); 
			if (!unique[ch]) { 
				
				unique[ch] = true; 
				System.out.print(ch + " "); 
			} 
		} 
	} 
}

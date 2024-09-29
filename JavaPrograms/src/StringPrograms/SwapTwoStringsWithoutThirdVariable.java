package StringPrograms;

import java.util.Scanner;

public class SwapTwoStringsWithoutThirdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string 1 : ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter string 2 : ");
		String str2 = sc.nextLine();
		
		System.out.println("Before swapping \nstr1=" + str1 + "\nstr2=" + str2);
		System.out.println("*********************************");
		
		//Concatenate str1 and str2 and store in str1
		str1= str1 + str2;    
		
		//Extract the initial part (original str1) from the concatenated string
		str2= str1.substring(0, str1.length() - str2.length());
		
		//Extract the remaining part (original str2) from the concatenated string
		str1 = str1.substring(str2.length());
		
		System.out.println("After swapping \nstr1=" + str1 + "\nstr2=" + str2);
	}
}

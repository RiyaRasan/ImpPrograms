package BasicPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int rev=0, lastDigit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int number=num;
		
		while(num>0) {
			lastDigit= num%10;
			rev=rev*10 + lastDigit;
			num=num/10;
		}
		
		System.out.println("Reverse of number: "+rev);
		
		if(number==rev) {
			System.out.println("Entered number is a palindrome number");
		}else {
			System.out.println("Not a palindrome number");
		}
	}

}

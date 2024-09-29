package BasicPrograms;

import java.util.Scanner;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int lastDigit,even=0,odd=0;
		
		while(num>0) {
			lastDigit=num%10;
			
			if(lastDigit%2==0) {
				even++;
			}
			else{
				odd++;
			}

			num=num/10;
		}
		
		System.out.println("Number of even digits: "+even);
		System.out.println("Number of odd digits: "+odd);
	}

}

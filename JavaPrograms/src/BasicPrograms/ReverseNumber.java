package BasicPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		
		//1) Algorithm logic 		
//		int rev=0;
//		while(num>0) {
//			int lastDigit=num%10;
//			rev=rev*10+ lastDigit;
//			num=num/10;
//		}
		
//		//2) Using StringBuffer class
//		StringBuffer sb=new StringBuffer(String.valueOf(num));// convert num into string
//		StringBuffer rev=sb.reverse();//get reverse of string
		
		
		//3) Using StringBuilder class
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		
		System.out.println("Reverse: "+rev);
	}

}

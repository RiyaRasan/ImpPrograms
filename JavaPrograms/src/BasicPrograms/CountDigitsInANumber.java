package BasicPrograms;

import java.util.Scanner;

public class CountDigitsInANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int count=0;
		while(num>0) {//123>0    12>0    1>0
			num=num/10;//12      1       1/10
			count++;//1          2       3
		}	
		System.out.println("Count of digits: "+count);//3
	}			
}





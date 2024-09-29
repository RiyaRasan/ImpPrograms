package BasicPrograms;

import java.util.Scanner;

public class LargestNumTerneryOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int largest;
		
		largest= a>b?a:b;
		
		largest= largest>c?largest:c;
		
		System.out.println("Largest number: "+largest);
	}

}

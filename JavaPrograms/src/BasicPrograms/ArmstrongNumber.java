package BasicPrograms;

import java.util.Scanner;

/**
 * @description: Armstrong number is a number that is equal to the sum of cubes of its digits. 
 * For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers
 */

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first num : ");
		int num = sc.nextInt();
		int sum=0, ld;

		int initialNum=num;
		while(num!=0) {
			ld= num%10;
			sum=sum+ld*ld*ld;
			num=num/10;
		}
		
		if(sum==initialNum) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("NOT an Armstrong number");
		}				
	}
}

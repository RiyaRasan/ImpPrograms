package ArrayArrayListPrograms;

public class MissingNumberFomArray {

	public static void main(String[] args) {
		
		//Array should not have duplicates
		//Array need not be in sorted order
		//Values should be in range
		
		int a[]= {1,2,3,5,6};
		//sum1=1+2+3+5+6+7
		//sum2=1+2+3+4+5+6+7
		//sum2-sum1=3 -->missing number
		
		int sum1=0,sum2=0;
		
		for(int value:a) {
			sum1=sum1+value;
		}
		System.out.println("Sum of elements in array: "+sum1);//17
		
		for(int i=1;i<=6;i++) {
			sum2=sum2+i;
		}
		System.out.println("Sum of range of elements in array: "+sum2);//21
		
		System.out.println("Missing number: "+ (sum2-sum1));//4
	}
	
	

}

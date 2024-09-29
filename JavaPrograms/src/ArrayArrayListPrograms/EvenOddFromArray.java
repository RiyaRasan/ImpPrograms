package ArrayArrayListPrograms;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		
		//Using for loop
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2==0) {
//				System.out.println("Even number: "+a[i]);
//			}else {
//				System.out.println("Odd number: "+a[i]);
//			}
//		}
		
		//Using for each loop
		for(int value:a) {
			if(value%2==0) {
				System.out.println("Even number: "+value);
			}else {
				System.out.println("Odd number: "+value);
			}
		}
	}

}

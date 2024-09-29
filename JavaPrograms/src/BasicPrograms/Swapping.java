package BasicPrograms;

public class Swapping {

	public static void main(String[] args) {
		int a=10, b=20, c;
		System.out.println("Before swapping, a=" + a +" b=" + b);
		
		//Logic 1- Using third variable
//		c=b;
//		b=a;
//		a=c;
//		
	
		//Logic 2- Using + and - and without using third variable
//		a=a+b;   // 30=10+20
//		b=a-b;   // 10=30-20
//		a=a-b;   // 20=30-10
		
		//Logic 3- Using * and / and without using third variable
		//Here a and b should not be zero.
//		a=a*b;   // 200=10*20
//		b=a/b;	 // 10=200/20
//		a=a/b;   // 20=200/10
		
//		//Logic 4- Bitwise XOR (^)
//		a=a^b;	// 30=10^20
//		b=a^b;  // 10=30^20
//		a=a^b;  // 20=30^10
		
		//Logic 5- Single line statement
	    b=a+b-(a=b);  //10=10+20-(20)
		
		
		System.out.println("After swapping, a=" + a +" b=" + b);
	}
}

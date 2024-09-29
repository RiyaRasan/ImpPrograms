package javaprogrampackage;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//while loop
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i=i+2;
		}
		
		//while loop with if and break statement
		int k=1;
		while(k<=100) {
			
			if(k%5==0) {
				System.out.println(k + " is a multiple of 5");
			}
			if(k==50) {
				break;
			}
			k++;
		}
		
		//simple for loop
		for(int t=1;t<=10;t++) {
			System.out.println(t);
		}
		
		//for loop with initialization outside the for loop
		int t=1;
		for(;t<=10;t++) {
			System.out.println(t);
		}
		
//		//for loop without initialization, condition and increment/decrement
//		for(;;) {
//			System.out.println("this is infinite loop");
//		}
		
		//for loop using variable-byte 
		for (byte b = 1; b <= 5; b++) {
			System.out.println(b);
		}
		//for loop using variable-double
		for (double d = 1.0; d < 10.0; d++) {
			System.out.println(d);// 1.0
		}
		//for loop having character datatype
		for(char a='a';a<='z';a++) {
			System.out.println(a + "="+ (int)a);
		}
		
		//do while loop
		int x=1;
		do {
			System.out.println(x);//1
			x++;
		}while(x<=0);
	}

}

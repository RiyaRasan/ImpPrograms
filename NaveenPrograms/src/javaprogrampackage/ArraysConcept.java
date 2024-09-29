
package javaprogrampackage;

public class ArraysConcept {

	public static void main(String[] args) {
		//int array
		int a[]=new int[4];
		int[] b=new int[4];

		a[0]=0;
		a[1]=10;
		a[2]=20;
		a[3]=30;
		System.out.println("a[0]="+a[0]);
		System.out.println("a[1]="+a[1]);
		System.out.println("a[2]="+a[2]);
		System.out.println("a[3]="+a[3]);
//		System.out.println("a[4]="+a[4]);    ArrayIndexOutOfBoundsException
//		System.out.println("a[-1]="+a[-1]);  ArrayIndexOutOfBoundsException
		
		int length=a.length;
		int lowestIndex=0;
		int highestIndex=length-1;
		
		System.out.println("length="+length);
		System.out.println("lowestIndex="+lowestIndex);
		System.out.println("highestIndex="+highestIndex);
		System.out.println("------------------------------");
		
		//To print all the values of array. iterate the array using for loop
		for(int i=0;i<length;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println("------------------------------");
		
		//Reverse of array
		for(int i=length-1;i>=0;i--) {
			System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println("------------------------------");

		//double array
		double d[]=new double[2];
		d[0] = 12.33;
		d[1] = 23.44;
		System.out.println("d[0]="+d[0]);
		System.out.println("------------------------------");
		
		//char array
		char c[]=new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='#';
		System.out.println("c[0]+c[1]="+c[0]+c[1]);
		System.out.println("(c[0]+c[1])="+(c[0]+c[1]));
		
		for(int g=0;g<c.length;g++) {
			System.out.println("c["+g+"]="+c[g]);
		}

	}

}

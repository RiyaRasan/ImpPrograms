package ArrayArrayListPrograms;

public class MaxAndMinElementOfArray {

	public static void main(String[] args) {
		int a[]= {7,6,50,4,2,1,100};
		int max=a[0],min=a[0];
		int i;
		
		for(i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum value in arrary: "+max);
		
		for(i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum value in array: "+min);
	}

}

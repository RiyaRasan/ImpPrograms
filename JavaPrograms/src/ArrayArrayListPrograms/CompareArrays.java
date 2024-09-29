package ArrayArrayListPrograms;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		int a[]={1,2,3};
		int b[]= {1,2,3};
			
		//Using java.util.Arrays.equals()
		if(Arrays.equals(a, b))
		{
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are NOT equal");
		}
		
		//Approach 2
		boolean status=false;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]==b[i]) {
					status=true;
				}else {
					status=false;
				}
			}
		}
		if(status) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are NOT equal");
		}
	}

}

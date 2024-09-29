package ArrayArrayListPrograms;

public class SearchElementInAnArray {

	public static void main(String[] args) {
		int arr[]= {5,2,9,1,6,3};
		int target=6;
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("Element fount at index: "+ i);
				flag=true;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println(target + " is not present in the array");
		}
	}

}

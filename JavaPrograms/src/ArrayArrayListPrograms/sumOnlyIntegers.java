package ArrayArrayListPrograms;

public class sumOnlyIntegers {

	public static void main(String[] args) {
		String[] arr= {"5", "2", "9", "9", "1", "6", "#", "3"};
		int sum=0;
		
		for (String element:arr) {
			try {
				int num = Integer.parseInt(element);
				sum+=num;
			}catch(NumberFormatException e){
				System.out.println("Number format exception found because of element: " + element);
			}
		}		
		System.out.println("Sum of integers= " + sum);
	}
}

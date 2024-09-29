package javaprogrampackage;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		//ArrayLiterals: static array
		int i[]= {10,20,30,40};
		
		System.out.println(i.length);
		System.out.println("Highest limit="+ (i.length-1));
		System.out.println("Lowest limit="+ 0);
		
		System.out.println(i[0]);
//		System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		
		for(int e: i) {
			System.out.println(e);
		}
		System.out.println("---------------");
		
		//String Array Literals
		String students[] = {"Ramya", "Ravi", "Tom", "Peter"};
		System.out.println(students.length);
		
		for(String e : students) {
			System.out.println(e);
				if(e.equals("Tom")) {
					System.out.println("100 marks....");
					break;
				}
		}
		System.out.println("---------------");
		
		//Object Array Literals
		Object empData[] = {"Vinay", 25, 25.55, true, 'm'};
		
		for(Object e : empData) {
			System.out.println(e);
		}
	}
}

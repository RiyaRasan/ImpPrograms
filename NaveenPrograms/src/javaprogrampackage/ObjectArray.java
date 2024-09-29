package javaprogrampackage;

public class ObjectArray {

	public static void main(String[] args) {
		
		Object emp[]=new Object[5];
		emp[0]="Riya";
		emp[1]=29;
		emp[2]='F';
		emp[3]=true;
		emp[4]=4.2;
	//	emp[5]="employee";
		
		//Index based for loop
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		System.out.println("------------------");
		
		//for each loop
		for(Object e:emp){
			System.out.println(e);
			if(e.equals('F')) {
				System.out.println("Hi Riya..");
				break;
			}			
		}
	}
}

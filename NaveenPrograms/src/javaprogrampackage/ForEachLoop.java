package javaprogrampackage;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int i[]=new int[4];//0-3
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		//Index based loop
		for(int s=0;s<i.length;s++) {
			System.out.println(i[s]);
		}
		System.out.println("---------------");
		
		//For each loop - int type
		for(int e:i) {
			System.out.println(e);
		}
		System.out.println("---------------");
		
		//For each loop - double type
		double j[]=new double[4];//0-3
		j[0]=10.23;
		j[1]=20.43;
		for(double e:j) {
			System.out.println(e);
		}
		
		//For each loop - char type
		char riya[]= new char[3];
		riya[0]='a';
		riya[1]='b';
		riya[2]='$';
		for(char e:riya) {
			System.out.println(e);
		}
	}
}

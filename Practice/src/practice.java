import java.util.Scanner;

public class practice { 
	public static void main(String[] args)
	{
	
		String str = "14,30,0,200.505";
		
		
		str = str.replace(',',' ');//14300200.505
		
		double num = Double.parseDouble(str);
		
		System.out.println(num);
	
	}
}

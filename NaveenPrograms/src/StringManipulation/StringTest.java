package StringManipulation;

public class StringTest {

	public static void main(String[] args) {
		String x="hello selenium";
		x.concat("testing");
		System.out.println(x);//hello selenium
		
		String s=x.concat(" testing");
		System.out.println(s);//hello selenium testing
		
		String t1 = "java";
		String t2= "java";
		String t3 = "Java";
		
		String t4 = new String("selenium");//Number of objects= 2 -- heap + SCP
		String t5 = "selenium"; // 0
		String t6 = "selenium";//0
		
		t5 = "ruby";
		System.out.println(t5);
		String t7 = new String("selenium");//heap(1) + SCP(0)
		
		String t8 = "selenium";
		
		String t9 = new String("automation");
		
		String t10 = "automation";
		System.out.println(t10+"naveen");//automationnaveen
	}
}

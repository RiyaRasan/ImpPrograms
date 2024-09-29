package BasicPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str="ABCD";
		String rev="";
		
		int len=str.length();//4
		System.out.println("Length: "+len);
		
//		//1) Using string concatenation(+) operator
//		for(int i=len-1;i>=0;i--){
//			rev=rev+str.charAt(i);
//		}
		
		
//		//2) Using string character array
//		char a[]=str.toCharArray();
//		for(int i=len-1;i>=0;i--) {
//			rev=rev+ a[i];
//		}
//		
//		System.out.println("Reverse of string: "+ rev);
		
		//3) Using StringBuffer class
		StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}

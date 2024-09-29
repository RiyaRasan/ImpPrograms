package StringPrograms;

public class CountPuntuation {

	public static void main(String[] args) {
		
		String str = "Good Morning! Mr. James Potter. Had your breakfast?";
		
		
		//A-Z= 65 to 90
		//a-z= 97 to 122
		//0-9= 48 to 57
		
		char a[]=str.toCharArray();
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if((a[i]==',')||(a[i]=='!')||(a[i]=='.')||(a[i]=='?')){
				count++;
			}
		}
		System.out.println(count);
	}

}

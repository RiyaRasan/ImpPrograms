package StringPrograms;

public class Anagram {
	
	/**
	 * Logic
	 * 1) Length of two strings should be same.
	 * 2) Convert them into same case.
	 * 3) Sort them in ascending order.
	 * 4) After performing above steps, compare them.
	 * 
	 */

	public static void main(String[] args) {
		
		String str1="Heart";
		String str2="Earth";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		str1=sortString(str1);
		str2=sortString(str2);
		
		if(str1.length()==str2.length()) {
			if(str1.equals(str2)) {
				System.out.println("Both strings are anagrams");
			}else {
				System.out.println("Both the strings are not anagrams");
			}
		}
	}
	
	public static String sortString(String str) {
		char temp=0;
		char charArray[]= str.toCharArray();
		String sortedString="";
		for(int i=0;i<charArray.length;i++) {
			for(int j=0;j<charArray.length;j++) {
				if(charArray[i]<charArray[j]) {
					temp=charArray[i];
					charArray[i]=charArray[j];
					charArray[j]= temp;
				}
			}
		}

		for(char value:charArray) {
			sortedString=sortedString+value;
		}
		System.out.println("Sorted String=" + sortedString);
		return sortedString;
	}

}

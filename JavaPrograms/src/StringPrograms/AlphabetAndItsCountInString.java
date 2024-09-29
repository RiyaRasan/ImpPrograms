package StringPrograms;

public class AlphabetAndItsCountInString {

	public static void main(String[] args) {
		String str = "aabbcccdd";
		
		StringBuilder sbui = new StringBuilder();
		int count=1;
		
		for(int i=0; i<str.length(); i++) {
			
			// If the next character is the same, increase the count
			if((i+1)<str.length() && str.charAt(i)==str.charAt(i+1)) {
				count++;
			}else {
				// Append the character and its count to the result
				sbui.append(str.charAt(i)).append(count);
				
				// Reset the count
				count=1;
			}
		}
		System.out.println("Input=" + str);
		System.out.println("output=" + sbui.toString());
	}
}

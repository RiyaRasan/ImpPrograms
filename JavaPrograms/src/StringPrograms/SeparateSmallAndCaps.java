package StringPrograms;

public class SeparateSmallAndCaps {

	public static void main(String[] args) {
		
		String str1 = "aBACbcEDed";
		
		StringBuilder lowerCase = new StringBuilder(); 
		StringBuilder upperCase = new StringBuilder();
		
		for(char ch:str1.toCharArray()) {
			
			if(Character.isLowerCase(ch)) {
				lowerCase.append(ch);
			}else {
				upperCase.append(ch);
			}
		}
		
		System.out.println("Output in lowercase: "+lowerCase); 
		System.out.println("Output in uppercase "+upperCase);
	}

}
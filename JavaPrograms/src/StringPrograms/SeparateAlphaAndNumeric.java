package StringPrograms;

public class SeparateAlphaAndNumeric {

	public static void main(String[] args) {
		String str= "Subbu123raj";
		
		StringBuilder alpha = new StringBuilder();
		StringBuilder numeric = new StringBuilder();
		
		for(char ch: str.toCharArray()) {
			if(Character.isAlphabetic(ch)) {
				alpha.append(ch);
			}else if(Character.isDigit(ch)) {
				numeric.append(ch);
			}
		}
		System.out.println("Output in Alpha: "+ alpha.toString()); 
		System.out.println("Output in Numeric: "+ numeric.toString());
	}

}

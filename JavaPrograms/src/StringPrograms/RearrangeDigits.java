package StringPrograms;

public class RearrangeDigits {

	public static void main(String[] args) {
		String input = "32400121200";
		
		StringBuilder digits = new StringBuilder();
		StringBuilder nonDigits = new StringBuilder();
		
		for(char ch : input.toCharArray()) {
			if(Character.isDigit(ch)) {
				digits.append(ch);
			}else {
				nonDigits.append(ch);
			}
		}
		System.out.println("Digits: "+ digits.toString()); 
		System.out.println("Non Digits: "+ nonDigits.toString());
	}
}
